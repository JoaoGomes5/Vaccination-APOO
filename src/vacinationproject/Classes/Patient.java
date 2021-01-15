/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacinationproject;

/**
 *
 * @author João Gomes
 */
public class Patient {
    
    private String name;
    private String gender;
    private String dateOfBirth;
    private int patientNumber ;
    private int phoneNumber ;


    /**
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
