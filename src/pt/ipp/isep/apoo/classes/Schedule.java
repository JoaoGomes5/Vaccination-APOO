/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo.classes;

/**
 *
 * @author Gustavo Reis e João Gomes
 */
public class Schedule {

    private VaccinationLocation vaccinationLocation;
    private String date;
    private String time;
    private Nurse nurse;
    private Patient patient;
    private Vaccine vacccine;
    private String typeOfLocation;

    /**
     * Metodo contrutor vazio
     */
    public Schedule() {

    }

    /**
     *
     * Metodo construtor da Classe Schedule
     *
     * @param vaccinationLocation Local de Vacinação
     * @param date Data da Marcação
     * @param time Hora da Marcação
     * @param nurse Enfermeiro
     * @param patient Utente
     * @param vaccine Vacina
     */
    public Schedule(
            VaccinationLocation vaccinationLocation,
            String date,
            String time,
            Nurse nurse,
            Patient patient,
            Vaccine vaccine,
            String typeOfLocation
    ) {

        this.vaccinationLocation = vaccinationLocation;
        this.date = date;
        this.time = time;
        this.nurse = nurse;
        this.patient = patient;
        this.vacccine = vaccine;
        this.typeOfLocation = typeOfLocation;

    }

    /**
     * Método que permite obter o Local de Vacinação
     *
     * @return Retorna o Local de Vacinação
     */
    public VaccinationLocation getVaccinationLocation() {
        return vaccinationLocation;
    }

    /**
     * Método que permite definir o Local de Vacinação
     *
     * @param vaccinationLocation Local de Vacinação
     */
    public void setVaccinationLocation(VaccinationLocation vaccinationLocation) {
        this.vaccinationLocation = vaccinationLocation;
    }

    /**
     * Método que permite obter a data da Marcação
     *
     * @return Retorna a Data da Marcação
     */
    public String getDate() {
        return date;
    }

    /**
     * Método que permite definir a Data da Marcação
     *
     * @param date Data da Marcação
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Método que permite obter a hora da Marcação
     *
     * @return Retorna a Hora da Marcação
     */
    public String getTime() {
        return time;
    }

    /**
     * Método que permite definir a Hora da Marcação
     *
     * @param time Hora da Marcação
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Método que permite obter o Enfermeiro
     *
     * @return Retorna o Enfermeiro
     */
    public Nurse getNurse() {
        return nurse;
    }

    /**
     * Método que permite definir o Enfermeiro
     *
     * @param nurse Enfermeiro
     */
    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    /**
     * Método que permite obter o Utente
     *
     * @return Retorna o Utente
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Método que permite definir o Utente
     *
     * @param patient Utente
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * Método que permite obter a Vacina
     *
     * @return Retorna a Vacina
     */
    public Vaccine getVacccine() {
        return vacccine;
    }

    /**
     * Método que permite definir a Vacina
     *
     * @param vacccine Vacina
     */
    public void setVacccine(Vaccine vacccine) {
        this.vacccine = vacccine;
    }

    /**
     * Método que permite obter o Tipo de Local de Vacinação
     *
     * @return Retorna o Tipo de Local de Vacinação
     */
    public String getTypeOfLocation() {
        return typeOfLocation;
    }

    /**
     * Método que permite definir o Tipo de Local de Vacinação
     *
     * @param typeOfLocation Tipo de Local de Vacinação
     */
    public void setTypeOfLocation(String typeOfLocation) {
        this.typeOfLocation = typeOfLocation;
    }

    /**
     * Método que retorna os atributos de uma classe em forma de texto
     *
     * @return Retorna os atributos de uma classe em forma de texto
     */
    @Override
    public String toString() {
        return " # Data da marcação # |" + getDate().trim() + "| # Hora da marcação # |" + getTime().trim() + "| # Local de vacinação # |" + getVaccinationLocation().toString().trim() + "| # Enfermeiro # |" + getNurse().toString().trim() + "| # Vacina # |" + getVacccine().toString().trim() + "| # Utente # |" + getPatient().toString().trim();
    }

}
