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
import pt.ipp.isep.apoo.classes.Patient;
import pt.ipp.isep.apoo.classes.Schedule;

/**
 *
 * @author João Gomes
 */
public class AllSchedules {

    private static Schedule[] schedules = new Schedule[100];
    private static int count = 0;
    

    public static void addScheduleToAllSchedules(Schedule s) {
        System.out.println(count);
        System.out.println("ppppppppppppppppp");
        s.toString();
        schedules[count] = s;
        count++;
    }

    // itera o array de Schedules e quando encontrar uma instância do objecto Schedule com Paciente igual ao parâmetro, devolve a instância do Schedule.
    public static Schedule GetSchByPatiente(Patient p) {
        for (int i = 0; i < schedules.length; i++) {
            if (schedules[i].getPatient().equals(p)) {
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
        System.out.println("O número total de marcações é :" + schedules.length);

        for (int i = 0; i < schedules.length; i++) {
            System.out.println(
                    "Marcação numero" + (counter++) + "\n"
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
    
    
    public static void SaveSchedulesToFile() throws IOException {
       
        FileWriter fw = new FileWriter("Marcacoes.txt");
        for (int i = 0; i < schedules.length; i++) {
		fw.write(schedules[i].toString()+"\n");
	}
	fw.close();
    }
    

    // Itera o array de Schedules e procura por um Schedule para o paciente com o número introduzido
    public static Schedule SearchScheduleByPatientNumber(int number) {
        for (int i = 0; i < schedules.length; i++) {
            if (schedules[i].getPatient().getPatientNumber() == number) {
                return schedules[i];
            }
        }
        return null;
    }
    
    
    // imprime o toString de todas as marcações com a data pretendida.
    public static void SearchByDate(String date) {
        List<Schedule> list = new ArrayList<>();
        for (int i = 0; i < schedules.length; i++) {
            if (schedules[i].getDate().equals(date)) {
                list.add(schedules[i]);
            }
        }
        for(Schedule s : list){
            s.toString();
        }

    }
    
    public static void SearchByBrand(String brand) {
        List<Schedule> list = new ArrayList<>();
        for (int i = 0; i < schedules.length; i++) {
            if (schedules[i].getVacccine().getBrand().equals(brand)){
                list.add(schedules[i]);
            }
        }
        for(Schedule s : list){
            s.toString();
        }

    }
    
    public static void SearchByLot(String lot) {
        List<Schedule> list = new ArrayList<>();
        for (int i = 0; i < schedules.length; i++) {
            if (schedules[i].getVacccine().getLot().equals(lot)){
                list.add(schedules[i]);
            }
        }
        for(Schedule s : list){
            s.toString();
        }

    }
    
    public static void SearchByBrandAndLot (String brand, String lot) {
        List<Schedule> list = new ArrayList<>();
        for (int i = 0; i < schedules.length; i++) {
            if (schedules[i].getVacccine().getLot().equals(lot) && schedules[i].getVacccine().getBrand().equals(brand) ){
                list.add(schedules[i]);
            }
        }
        for(Schedule s : list){
            s.toString();
        }

    }
    
    public static void FindByVaccinationLocation(String name){
        for (int i = 0; i < schedules.length; i++) {
            if(schedules[i].getVaccinationLocation().getName().equals(name)){
             schedules[i].toString();
            }
        }
        
    }
    
   

}

	
