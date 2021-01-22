/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo.classes;

/**
 *
 * @author João e Gustavo
 */
public class Pavilion extends VaccinationLocation {

    /**
     * Numero da secção
     */
    private int sectionName;
 
    /**
     * Metodo construtor
     */
    public Pavilion() {
        
    }
    
    /**
     * 
     * Método que permite criar um novo pavilhão 
     * @param sectionName
     */
    public Pavilion (String name, String address, String phoneNumber, int sectionName) {
        super(name, address, phoneNumber);
        this.sectionName = sectionName;
        
    }
    public int getSectionName() {
        return sectionName;
    }

    public void setSectionName(int sectionName) {
        this.sectionName = sectionName;
    }

}
