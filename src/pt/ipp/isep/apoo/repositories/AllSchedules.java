/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo.repositories;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import pt.ipp.isep.apoo.classes.Patient;
import pt.ipp.isep.apoo.classes.Schedule;
import java.util.stream.IntStream; 



/**
 *
 * @author João Gomes e Gustavo Reis
 */
public class AllSchedules {

    private static Schedule[] schedules = new Schedule[100];
    private static int count = 0;
    

    public static void addScheduleToAllSchedules(Schedule s) {
        System.out.println(s.toString());
        schedules[count] = s;
        count++;
        
    }

    // itera o array de Schedules e quando encontrar uma instância do objecto Schedule com Paciente igual ao parâmetro, devolve a instância do Schedule.
    public static Schedule getScheduleByPatiente(Patient p) {
        for (int i = 0; i < count; i++) {
            if (schedules[i].getPatient().equals(p)) {
                System.out.println(schedules[i].toString());
                return schedules[i];
            }
        }
        return null;
    }

    /*
    ArrayList<Schedule> allSchedules = new ArrayList<>(); 
     
      public void addScheduleToAllSchedules(Schedule schedule){
        this.allSchedules.add(schedule);
       }
      
     */
    public static void listAllSchedules() {
        int counter = 1;
        System.out.println("O número total de marcações é : " + count);

        for (int i = 0; i < count; i++) {
            System.out.println(
                    "Marcação numero - " + (counter++) + "\n"
                    + " # Local de vacinação #" + "\n"
                    + schedules[i].getVaccinationLocation().getName() + " | " + schedules[i].getVaccinationLocation().getAddress() + " | " + schedules[i].getVaccinationLocation().getPhoneNumber() + "\n"
                    + " # Data #" + "\n"
                    + schedules[i].getDate() + "\n"
                    + " # Hora #" + "\n"
                    + schedules[i].getTime() + "\n"
                    + " # Enfermeiro #" + "\n"
                    + schedules[i].getNurse().getName() + " | " + schedules[i].getNurse().getCardNumber() + " | " + schedules[i].getNurse().getPhoneNumber() + "\n"
                    + " # Utente #" + "\n"
                    + schedules[i].getPatient().getName() + " | " + schedules[i].getPatient().getGender() + " | " + schedules[i].getPatient().getYearOfBirth() + " | " + schedules[i].getPatient().getPatientNumber() + " | " + schedules[i].getPatient().getPhoneNumber() + "\n"
                    + " # Vacina #" + "\n"
                    + schedules[i].getVacccine().getBrand() + " | " + schedules[i].getVacccine().getLot() + "\n"
            );
        }

    }
    
    
    public static void saveSchedulesToFile() throws IOException {
       
        FileWriter fw = new FileWriter("Marcacoes.txt");
        for (int i = 0; i < count; i++) {
		fw.write(schedules[i].getTypeOfLocation() + " - " + schedules[i].toString()+"\n");
//                fw.write("\n");
	}
	fw.close();
    }
    

    // Itera o array de Schedules e procura por um Schedule para o paciente com o número introduzido
    public static void searchScheduleByPatientNumber(int patientNumber) {
        for (int i = 0; i < count; i++) {
            if (schedules[i].getPatient().getPatientNumber() == patientNumber) {
                System.out.println(schedules[i]);
            }
        }
        
    }
    
    public static void deleteScheduleByPatientNnumber(int patientNumber){
            for (int i = 0; i < count; i++) {
            if (schedules[i].getPatient().getPatientNumber() == patientNumber) {
                // to do, delete from array
            }
        }
                 
   
        
    }
    
    public static void searchScheduleByPatientÀge(int age) {
        
        List<Schedule> sharedList = new ArrayList<>();
        int currentYear = 2021;
        int ageYear = currentYear - age;
        
        for (int i = 0; i < count; i++) {
           
            if (schedules[i].getPatient().getYearOfBirth() == ageYear) {
                    sharedList.add(schedules[i]);
            }

           
        }
         for(Schedule s : sharedList){
                System.out.println(s.toString());
            }
    }
    
    /**
     * 
     * @param date 
     */
    // imprime o toString de todas as marcações com a data pretendida.
    public static void searchByDate(String date) {
        List<Schedule> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (schedules[i].getDate().equals(date) ) {
                list.add(schedules[i]);
            }
            
        }
        for(Schedule s : list){
            System.out.println(s.toString());
        }

    }
    
    public static void searchByBrand(String brand) {
        List<Schedule> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (schedules[i].getVacccine().getBrand().equals(brand)){
                list.add(schedules[i]);
            }
        }
        for(Schedule s : list){
            System.out.println(s.toString());
        }

    }
    
    public static void searchByLot(String lot) {
        List<Schedule> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (schedules[i].getVacccine().getLot().equals(lot)){
                list.add(schedules[i]);
            }
        }
        for(Schedule s : list){
           System.out.println(s.toString());
        }

    }
    
    public static void searchByBrandAndLot (String brand, String lot) {
        List<Schedule> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (schedules[i].getVacccine().getLot().equals(lot) && schedules[i].getVacccine().getBrand().equals(brand) ){
                list.add(schedules[i]);
            }
        }
        for(Schedule s : list){
          System.out.println(s.toString());
        }

    }
    
    public static void findByVaccinationLocation(String name){
         List<Schedule> list = new ArrayList<>();
         System.out.println(name);
  
         
        for (int i = 0; i < count; i++) {
            if(schedules[i].getVaccinationLocation().getName().equals(name)){
                list.add(schedules[i]);
            }
        }
        for(Schedule s : list){
          System.out.println(s.toString());
        }
        
    }
    
   

}

	
