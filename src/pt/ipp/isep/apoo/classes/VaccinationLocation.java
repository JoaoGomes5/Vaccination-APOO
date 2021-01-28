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
public class VaccinationLocation {
    
    /**
     * Nome do Local de Vacinação
     */
    private String name;

    /**
     * Morada do Local de Vacinação
     */
    private String address;

    /**
     * Número de telefone do Local de Vacinação
     */
    private String phoneNumber;
    
    /**
     * Método construtor vazio
     */
    public VaccinationLocation() {
        
    }
    
    /**
     * Metodo responsável por criar um Local de Vacinação
     * @param name Nome do Local de Vacinação
     * @param address Morada do Local de Vacinação
     * @param phoneNumber Número de telefone do Local de Vacinação
     */
    public VaccinationLocation (String name, String address,String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Método que permite obter o nome do Local de Vacinação
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Método que permite definir o nome do Local de Vacinação
     * @param name Nome do Local de Vacinação
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método que permite obter a Morada do Local de Vacinação
     * @return 
     */
    public String getAddress() {
        return address;
    }

    /**
     * Método que permite definir a Morada do Local de Vacinação
     * @param address Morada do Local de Vacinação
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Método que permite obter o número de telefone do Local de Vacinação
     * @return 
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Método que permite definir o número de telefone do Local de Vacinação
     * @param phoneNumber Número de telefone do Local de Vacinação
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    /**
    * Método que retorna os atributos de uma classe em forma de texto
    * @return 
    */
    @Override
    public String toString(){
    return getName()+ "| sito em |"+getAddress()+ "| e contactado através de |"+getPhoneNumber();
    }
    }
    
    

