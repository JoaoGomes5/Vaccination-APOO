/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacinationproject;

/**
 *
 * @author João Gomes
 */
public class Nurse {
    
    private String name;
    private int cardNumber;
    private int phoneNumber;

    /**
     * Contructor method
     */
    public Nurse() {
        
    }
    
    /**
     * 
     * @param name
     * @param cardNumber
     * @param phoneNumber 
     */
    public void create(String name, int cardNumber, int phoneNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.phoneNumber = phoneNumber;
    }
    
    
}

