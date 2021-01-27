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
     * 
     * Método que permite criar um novo enfermeiro
     * 
     * @param name
     * @param cardNumber
     * @param phoneNumber 
     */
    public Nurse(String name, int cardNumber, int phoneNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "| enfermeiro |" + getName() + "| com cédula profissional número |" + getCardNumber();
    }   
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
}

