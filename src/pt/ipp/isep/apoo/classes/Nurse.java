/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo.classes;

/**
 *
 * @author João Gomes
 */
public class Nurse {
    
    /**
     * Nome 
     */
    private String name;
    
    /**
     * Número de cédula profissional 
     */
    private int cardNumber;
    
    /**
     * Número de telefone
     */
    private int phoneNumber;

    
    /**
     * Metodo construtor
     */
    public Nurse() {
        
    }
    
    /**
     * 
     * Metedo que permite criar um novo enfermeiro
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
    
    
}

