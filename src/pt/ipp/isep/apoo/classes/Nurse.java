/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo.classes;

/**
 *
 * @author Gustavo Reis e João Gomes
 */
public class Nurse {

    /**
     * Nome do Enfermeiro
     */
    private String name;

    /**
     * Número de cédula profissional do Enfermeiro
     */
    private int cardNumber;

    /**
     * Número de telefone
     */
    private int phoneNumber;

    /**
     * Metodo construtor vazio
     */
    public Nurse() {

    }

    /**
     * Método que permite criar um novo Enfermeiro
     *
     * @param name Nome do Enfermeiro
     * @param cardNumber Número da Cédula Profissional do Enfermeiro
     * @param phoneNumber Número de Telefone do Enfermeiro
     */
    public Nurse(String name, int cardNumber, int phoneNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Método que permite obter o nome do Enfermeiro
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Método que permite definir o nome do Enfermeiro
     *
     * @param name Nome do Enfermeiro
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método que permite obter o número da Cédula Profissional do Enfermeiro
     *
     * @return
     */
    public int getCardNumber() {
        return cardNumber;
    }

    /**
     * Método que permite definir o número da Cédula Profissional do Enfermeiro
     *
     * @param cardNumber Número da Cédula Profissional do Enfermeiro
     */
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Método que permite obter o número de telefone do Enfermeiro
     *
     * @return
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Método que permite definir o número de telefone do Enfermeiro
     *
     * @param phoneNumber Número de Telefone do Enfermeiro
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Método que retorna os atributos de uma classe em forma de texto
     *
     * @return
     */
    @Override
    public String toString() {
        return getName() + "|" + getCardNumber() + "|" + getPhoneNumber();
    }

}
