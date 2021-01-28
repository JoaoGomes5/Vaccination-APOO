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
public class Vaccine {
    private String brand;
    private String lot;
    
    /**
     * Metodo construtor
     */
    public Vaccine() {
        
    }
    /**
     * 
     * Método que permite criar uma vacina
     * @param brand
     * @param lot
     */
   
    public Vaccine(String brand, String lot) {
        this.brand = brand;
        this.lot = lot;
    }
    
    @Override
    public String toString(){
        return getBrand()+"|"+getLot();
        
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }
    
    
}
