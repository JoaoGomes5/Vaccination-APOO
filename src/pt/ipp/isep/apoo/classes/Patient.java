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
public class Patient {
    
    
     /**
     * Nome 
     */
    private String name;

     /**
     * Sexo
     */
    private String gender;

     /**
     * Data de nascimento
     */
    private String dateOfBirth;

     /**
     *  Numero de utente
     */
    private int patientNumber ;

     /**
     * Numero de telemovel
     */
    private int phoneNumber ;



    /**
     * 
     * Metedo que permite criar um novo paciente
     * 
     * @param name
     * @param gender
     * @param dateOfBirth
     * @param patientNumber
     * @param phoneNumber 
     */
    public void create(
            String name, 
            String gender,
            String dateOfBirth,
            int patientNumber,
            int phoneNumber
        ) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.patientNumber = patientNumber;
        this.phoneNumber = phoneNumber;
    }

}
