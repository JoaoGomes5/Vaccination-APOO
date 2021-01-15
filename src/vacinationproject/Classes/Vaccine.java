/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacinationproject;

/**
 *
 * @author Gustavo Reis
 */
public class Vaccine {
    private String brand;
    private String lot;
    
    public void create(
    String brand, 
    String lot,
    ){
    this.brand = brand;
    this.lot = lot;        
    }
    
}
