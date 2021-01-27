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
public class HealthCenter extends VaccinationLocation {
   /**
     * 
     * Método construtor vazio
     * 
     */
    public HealthCenter () {
    }   
    
    /**
     * Método que permite criar um Centro de Saúde
     * @param name Nome do Centro de Saúde
     * @param address Morada do Centro de Saúde
     * @param phoneNumber Número telefónico do Centro de Saúde
     */
      public HealthCenter (String name, String address, String phoneNumber) {
        super(name, address, phoneNumber);
      }
      
      
      /**
       * Método que retorna os atributos de uma classe em forma de texto
       * @return 
       */     
    @Override
      public String toString(){
          return super.toString();
      }
}
