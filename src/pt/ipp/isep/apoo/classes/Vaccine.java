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
     
    /**
     * Marca da Vacina
     */
    private String brand;
    
    /**
     * Lote da Vacina
     */
    private String lot;
    
    /**
     * Metodo construtor vazio
     */
    public Vaccine() {
        
    }
    
    /**
     * 
     * Método que permite criar uma vacina
     * @param brand Marca da Vacina
     * @param lot Lote da Vacina
     */
     public Vaccine(String brand, String lot) {
        this.brand = brand;
        this.lot = lot;
    }
    
   /**
     * Método que permite obter a Marca da Vacina
     * @return 
     */
    public String getBrand() {
        return brand;
    }

     /**
     * Método que permite definir a Marca da Vacina
     * @param brand Marca da Vacina
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Método que permite obter o Lote da Vacina
     * @return 
     */
    public String getLot() {
        return lot;
    }

    /**
     * Método que permite definir o Lote da Vacina
     * @param lot Lote da Vacina
     */
    public void setLot(String lot) {
        this.lot = lot;
    }
    
    /**
    * Método que retorna os atributos de uma classe em forma de texto
    * @return 
    */
      @Override
    public String toString(){
        return "|com a vacina da marca |"+getBrand()+"| e com o lote |"+getLot();
        
    }
    
}
