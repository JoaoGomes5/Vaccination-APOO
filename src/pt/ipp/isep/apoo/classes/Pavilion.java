/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo.classes;
import pt.ipp.isep.apoo.classes.VaccinationLocation.*;

/**
 *
 * @author João e Gustavo
 */
public class Pavilion extends VaccinationLocation {
    

    /**
     * Numero da secção
     */
    private int sectionName;
    
    
   public Pavilion() {
       super();

    }
    
    /**
     * 
     * Metodo responsavel por criar um novo local de vacinação
     * 
     * 
     */
    public Pavilion (String name, String address,String phoneNumber, int sectionName) {
        super(name, address, phoneNumber);
        this.sectionName = sectionName;
        
        
    }
}
