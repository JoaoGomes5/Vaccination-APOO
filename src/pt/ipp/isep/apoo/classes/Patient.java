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
public class Patient {

    /**
     * Nome do utente
     */
    private String name;

    /**
     * Sexo do Utente
     */
    private String gender;

    /**
     * Data de nascimento do Utente
     */
    private int yearOfBirth;

    /**
     * Numero de Utente
     */
    private int patientNumber;

    /**
     * Numero de telefone do Utente
     */
    private int phoneNumber;

    /**
     * Método construtor vazio
     */
    public Patient() {

    }

    /**
     * Método que permite criar um novo paciente
     *
     * @param name Nome do Utente
     * @param gender Sexo do Utente
     * @param yearOfBirth Ano de Nascimento do Utente
     * @param patientNumber Número de Utente
     * @param phoneNumber Número de Telefone do Utente
     */
    public Patient(
            String name,
            String gender,
            int yearOfBirth,
            int patientNumber,
            int phoneNumber
    ) {
        this.name = name;
        this.gender = gender;
        this.yearOfBirth = yearOfBirth;
        this.patientNumber = patientNumber;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Método que permite obter o nome do Utente
     *
     * @return Retorna o nome do Utente
     */
    public String getName() {
        return name;
    }

    /**
     * Método que permite obter o sexo do Utente
     *
     * @return Retorna o genero do Utente
     */
    public String getGender() {
        return gender;
    }

    /**
     * Método que permite obter o ano de nascimento do Utente
     *
     * @return Retorna o ano de nascimento do Utente
     */
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Método que permite obter o número de Utente
     *
     * @return Retorna o número de Utente
     */
    public int getPatientNumber() {
        return patientNumber;
    }

    /**
     * Método que permite obter o número de telefone do Utente
     *
     * @return Retorna o número de telefone do Utente
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Método que permite definir o nome do Utente
     *
     * @param name Nome do Utente
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método que permite definir o sexo do Utente
     *
     * @param gender Sexo do Utente
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Método que permite definir o ano de nascimento do Utente
     *
     * @param yearOfBirth Ano de Nascimento do Utente
     */
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    /**
     * Método que permite definir o Número de Utente
     *
     * @param patientNumber Número de Utente
     */
    public void setPatientNumber(int patientNumber) {
        this.patientNumber = patientNumber;
    }

    /**
     * Método que permite definir o Número de Telefone do Utente
     *
     * @param phoneNumber Número de Telefone do Utente
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Método que retorna os atributos de uma classe em forma de texto
     *
     * @return Retorna os atributos de uma classe em forma de texto
     */
    @Override
    public String toString() {
        return getName() + "|" + getGender() + "|" + getYearOfBirth() + "|" + getPatientNumber() + "|" + getPhoneNumber();
    }

}
