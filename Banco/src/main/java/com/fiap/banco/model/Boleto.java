//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.02 at 09:51:53 PM BRT 
//


package com.fiap.banco.model;



public class Boleto {

    protected String id;
    protected String vencimento;
    protected String cpf;
    protected String processamento;
    protected String recebedora;
    protected double valor;
    protected boolean pago;
    protected boolean deposito;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the vencimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVencimento() {
        return vencimento;
    }

    /**
     * Sets the value of the vencimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVencimento(String value) {
        this.vencimento = value;
    }

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Gets the value of the processamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessamento() {
        return processamento;
    }

    /**
     * Sets the value of the processamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessamento(String value) {
        this.processamento = value;
    }

    /**
     * Gets the value of the recebedora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecebedora() {
        return recebedora;
    }

    /**
     * Sets the value of the recebedora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecebedora(String value) {
        this.recebedora = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

    /**
     * Gets the value of the pago property.
     * 
     */
    public boolean isPago() {
        return pago;
    }

    /**
     * Sets the value of the pago property.
     * 
     */
    public void setPago(boolean value) {
        this.pago = value;
    }

    /**
     * Gets the value of the deposito property.
     * 
     */
    public boolean isDeposito() {
        return deposito;
    }

    /**
     * Sets the value of the deposito property.
     * 
     */
    public void setDeposito(boolean value) {
        this.deposito = value;
    }

}
