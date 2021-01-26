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

import pt.ipp.isep.apoo.classes.*;

/**
 *
 * @author João e Gustavo
 */


public class Schedule {

    private VaccinationLocation vaccinationLocation;
    private String date;
    private String time;
    private Nurse nurse;
    private Patient patient;
    private Vaccine vacccine;

    /**
     * Metodo contrutor vazio
     */
    public Schedule() {

    }

    /**
     *
     * Metodo construtor com parametros
     *
     * @param vaccinationLocation
     * @param date
     * @param time
     * @param nurse
     * @param patient
     * @param vaccine
     */
    public Schedule(
            VaccinationLocation vaccinationLocation,
            String date,
            String time,
            Nurse nurse,
            Patient patient,
            Vaccine vaccine
    ) {

        this.vaccinationLocation = vaccinationLocation;
        this.date = date;
        this.time = time;
        this.nurse = nurse;
        this.patient = patient;
        this.vacccine = vaccine;

    }
    
    @Override
    public String toString(){
        return "A marcação para o dia " + getDate()+" às "+getTime()+" horas, será administrada no local "+getVaccinationLocation().toString()+" pelo enfermeiro "+getNurse().toString()+" com a vacina "+ getVacccine().toString()+ "ao utente "+getPatient().toString();
    }

    public VaccinationLocation getVaccinationLocation() {
        return vaccinationLocation;
    }

    public void setVaccinationLocation(VaccinationLocation vaccinationLocation) {
        this.vaccinationLocation = vaccinationLocation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Vaccine getVacccine() {
        return vacccine;
    }

    public void setVacccine(Vaccine vacccine) {
        this.vacccine = vacccine;
    }
    
    
    

    

/**Método que permite actualizar os dados da marcação
 *
 */
 public void update () {
}

 
/**Método que permite pesquisar marcação do utente por ano de nascimento
 * 
 */
public void searchByAge () {
    System.out.println("");
}


/**Método que permite pesquisar marcações para uma data indicada pelo utilizador
 * 
 */
public void searchByDate () {
    System.out.println("");
}


/**Método que permite pesquisar marcações para um local indicado pelo utilizador
 * 
 */
public void searchByLocal () {
    System.out.println("");
}


/**
 * Método que permite pesquisar marcações por marca da vacina
 */
public void searchByBrand() {
    System.out.println("");
    }


/**
 * Método que permite pesquisar marcações por lote da vacina
 */
public void searchByLot () {
    System.out.println("");
}


/**
 * Método que permite pesquisar marcações por marca e lote da vacina
 */
public void searchByBrandAndLot () {
    System.out.println("");
}
}


/**
 * Método que transforma todos os objectos guardados em memória no array "Schedules" para String
 */
//public void allScheduleToString () {
//}
//}

