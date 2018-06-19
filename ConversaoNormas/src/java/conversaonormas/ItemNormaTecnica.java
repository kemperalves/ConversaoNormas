/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversaonormas;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author kemper
 */
public class ItemNormaTecnica implements Serializable {
    
    private String simbolo;
    private BigDecimal valorMinimo;
    private BigDecimal valorMaximo;

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public BigDecimal getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(BigDecimal valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public BigDecimal getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(BigDecimal valorMaximo) {
        this.valorMaximo = valorMaximo;
    }
    
    
    
    
}
