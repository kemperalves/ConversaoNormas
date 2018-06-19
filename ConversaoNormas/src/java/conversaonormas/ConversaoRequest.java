/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversaonormas;

import java.io.Serializable;

/**
 *
 * @author kemper
 */
public class ConversaoRequest implements Serializable {

    private String conteudoArquivoBase64 = null;

    public String getConteudoArquivoBase64() {
        return conteudoArquivoBase64;
    }

    public void setConteudoArquivoBase64(String conteudoArquivoBase64) {
        this.conteudoArquivoBase64 = conteudoArquivoBase64;
    }

}
