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
public class Hospital extends VaccinationLocation {

    /**
     * Nome do edificio do Hospital
     */
    private String buildingName;

    /**
     * Extensão telefónica do Hospital
     */
    private String extension;
    
     /**
     * Metodo construtor vazio
     */
    public Hospital() {
        
    }
    
    /**
     * Método que permite criar um novo hospital
     * @param name Nome do Hospital
     * @param address Morada do Hospital
     * @param phoneNumber Número telefónico do Hospital
     * @param buildingName Nome do edifício do Hospital
     * @param extension Extensão telefónica do Hospital
     */
    
    public Hospital (String name, String address, String phoneNumber, String buildingName, String extension) {
        super(name, address, phoneNumber);
        this.buildingName = buildingName;
        this.extension = extension;
      
    }
    
    
    /**
     * Método que permite obter o nome do edifício do Hospital
     * @return 
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * Método que permite definir o nome do edifício do Hospital
     * @param buildingName Nome do edifício do Hospital
     */
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    /**
     * Método que permite obter a extensão telefónica do Hospital
     * @return 
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Método que permite definir a extensão telefónica do Hospital
     * @param extension Extensão telefónica do Hospital
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }
    
    /**
    * Método que retorna os atributos de uma classe em forma de texto
    * @return 
    */
    @Override
    public String toString(){
        return super.toString()+ "|"+getBuildingName()+"|"+getExtension();
    }

}
