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
public class HealthCenter extends VaccinationLocation {
   /**
     * 
     * Método construtor
     * 
     */
    public HealthCenter () {
        super();
    }   
    
      public HealthCenter (String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
      }
      
      public String toString(){
          return super.toString();
      }
}
