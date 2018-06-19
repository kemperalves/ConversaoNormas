/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversaonormas;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author kemper
 */
public class ConversaoResponse implements Serializable {

    private String cliente = null;
    private String produto = null;
    private String forma = null;

    private List<ItemNormaTecnica> itensNorma = null;

    private String medida = null;
    private BigDecimal di = null;

    private String tolerancia = null;

    private BigDecimal comprimentoMinimo = null;
    private BigDecimal comprimentoMaximo = null;

    private String normaAco = null;

    private BigDecimal largura = null;
    private BigDecimal espessura = null;

    private String dureza = null;

    private String graoAustenticio = null;
    private String empenamento = null;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<ItemNormaTecnica> getItensNorma() {
        return itensNorma;
    }

    public void setItensNorma(List<ItemNormaTecnica> itensNorma) {
        this.itensNorma = itensNorma;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public BigDecimal getDi() {
        return di;
    }

    public void setDi(BigDecimal di) {
        this.di = di;
    }

    public String getTolerancia() {
        return tolerancia;
    }

    public void setTolerancia(String tolerancia) {
        this.tolerancia = tolerancia;
    }

    public BigDecimal getComprimentoMinimo() {
        return comprimentoMinimo;
    }

    public void setComprimentoMinimo(BigDecimal comprimentoMinimo) {
        this.comprimentoMinimo = comprimentoMinimo;
    }

    public BigDecimal getComprimentoMaximo() {
        return comprimentoMaximo;
    }

    public void setComprimentoMaximo(BigDecimal comprimentoMaximo) {
        this.comprimentoMaximo = comprimentoMaximo;
    }

    public String getNormaAco() {
        return normaAco;
    }

    public void setNormaAco(String normaAco) {
        this.normaAco = normaAco;
    }

    public BigDecimal getLargura() {
        return largura;
    }

    public void setLargura(BigDecimal largura) {
        this.largura = largura;
    }

    public BigDecimal getEspessura() {
        return espessura;
    }

    public void setEspessura(BigDecimal espessura) {
        this.espessura = espessura;
    }

    public String getDureza() {
        return dureza;
    }

    public void setDureza(String dureza) {
        this.dureza = dureza;
    }

    public String getGraoAustenticio() {
        return graoAustenticio;
    }

    public void setGraoAustenticio(String graoAustenticio) {
        this.graoAustenticio = graoAustenticio;
    }

    public String getEmpenamento() {
        return empenamento;
    }

    public void setEmpenamento(String empenamento) {
        this.empenamento = empenamento;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

}
