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
public class VaccinationLocation {
    
    /**
     * Nome
     */
    private String name;

    /**
     * Morada
     */
    private String address;

    /**
     * Telefone
     */
    private String phoneNumber;
    
    /**
     * Método construtor
     */
    public VaccinationLocation() {
        
    }
    
    /**
     * 
     * Metodo responsavel por criar um novo local de vacinação
     * 
     * @param name
     * @param address
     * @param phoneNumber
     */
    public VaccinationLocation (String name, String address,String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    }
    
    

