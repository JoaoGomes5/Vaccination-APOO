/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo.repositories;

import java.util.ArrayList;
import pt.ipp.isep.apoo.classes.Schedule;

/**
 *
 * @author João Gomes
 */
public class AllSchedules {
     ArrayList<Schedule> allSchedules = new ArrayList<>(); 
     
      public void addScheduleToAllSchedules(Schedule schedule){
        this.allSchedules.add(schedule);
      }
      
      public void listAllSchedules(){
          int counter = 1;
          System.out.println(allSchedules.size());
          for (Schedule schedule : this.allSchedules) {
              System.out.println(
                     "Marcação numero" + (counter++) + "\n"
                      + " # Local de vacinação #" + "\n"
                      + schedule.getVaccinationLocation().getName() + " | " + schedule.getVaccinationLocation().getAddress()  + " | " + schedule.getVaccinationLocation().getPhoneNumber() + "\n"
                      + " # Data #" + "\n"
                      + schedule.getDate() + "\n"
                      + " # Hora #" + "\n"
                      + schedule.getTime() + "\n"
                      + " # Enfermeiro #" + "\n"
                      + schedule.getNurse().getName() + " | " + schedule.getNurse().getCardNumber() + " | " + schedule.getNurse().getPhoneNumber() + "\n"
                      + " # Utente #" + "\n"
                      +  schedule.getPatient().getName() + " | " + schedule.getPatient().getGender() + " | " + schedule.getPatient().getYearOfBirth() + " | " + schedule.getPatient().getPatientNumber() + " | " + schedule.getPatient().getPhoneNumber() + "\n"
                      + " # Vacina #" + "\n"
                      + schedule.getVacccine().getBrand() + " | " + schedule.getVacccine().getLot() +"\n"
              );
          }
          
      } 
}
