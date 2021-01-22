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
public class Hospital extends VaccinationLocation {

    /**
     * Nome do edificio
     */
    private String buildingName;

    /**
     * Extensão telefónica
     */
    private String extension;
    
     /**
     * Metodo construtor
     */
    public Hospital() {
        
    }
    
    /**
     * 
     * Método que permite criar um novo hospital
     * 
     * @param buidingName
     * @param extension
     */
    public Hospital (String name, String address, String phoneNumber, String buildingName, String extension) {
        super(name, address, phoneNumber);
        this.buildingName = buildingName;
        this.extension = extension;
      
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

}
