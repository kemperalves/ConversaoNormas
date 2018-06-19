/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversaonormas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author kemper
 */
@WebServlet(name = "conversao", urlPatterns = {"/conversao"})
@MultipartConfig
public class conversao extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/json;charset=UTF-8");
        Gson gson = new GsonBuilder().serializeNulls().create();

        ConversaoResponse resp = new ConversaoResponse();

        try {

            //PASSO 1 - PEGAR O ARQUIVO .PDF DA REQUEST
            Part filePart = request.getPart("pdf"); // Recupera: <input type="file" name="pdf">
            InputStream fileContent = filePart.getInputStream();

            File tmpFile = File.createTempFile("ficha-tecnica", ".pdf");
            tmpFile.deleteOnExit();

            FileUtils.copyInputStreamToFile(fileContent, tmpFile);

            //PASSO 2 - PEGAR O PDF E TRANSFORMA EM TXT
            ProcessBuilder pb = new ProcessBuilder("pdftotext", "-layout", "-enc", "UTF-8", tmpFile.getCanonicalPath());
            Process pdftotext = pb.start();
            pdftotext.waitFor();
            
            String txtFileName = tmpFile.getAbsolutePath().replaceAll("[.]pdf$", ".txt");
            
            System.out.println(txtFileName);

            //PASSO 3 - PEGAR O TXT E MANDAR PARA O WATSON
            
            
            //PASSO 4 - PEGAR A RESPOSTA DO WTASON E INTERPRETAR, SETANDO CORRETAMENTE OS VALORES...
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(conversao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
            try (PrintWriter out = response.getWriter()) {
                out.print(gson.toJson(resp));
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
