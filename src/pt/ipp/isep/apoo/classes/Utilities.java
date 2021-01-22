/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo.classes;

import java.util.ArrayList;

/**
 *
 * @author João e Gustavo
 */
public class Utilities  {
    
    public void menuHandler(int option){
        
       
    }
    
    public static ArrayList<Patient> generateDefaultPatients(){
          ArrayList<Patient> patientsList = new ArrayList<Patient>();
        
        patientsList.add(new Patient(
                                "João",
                                "Masculino", 
                                "15-02-2002",
                                1,
                                911111111
                                )
                            );
        patientsList.add(new Patient(
                                "Jonh Cena",
                                "Masculino", 
                                "10-10-1973",
                                2,
                                911111111
                                )
                            );
        patientsList.add(new Patient(
                                "Margarida Sá Cordeiro",
                                "Feminino", 
                                "25-09-2000",
                                3,
                                918654329
                                )
                            );
        patientsList.add(new Patient(
                                "Henrique Buenadicha",
                                "Masculino", 
                                "19-04-1980",
                                4,
                                919876243
                                )
                            );
        patientsList.add(new Patient(
                                "Maria Salgado",
                                "Feminino", 
                                "16-07-2007",
                                1,
                                93564790
                                )
                            );
        
        
        return patientsList;
    }
    
    public static ArrayList<VaccinationLocation> generateDefaultVaccinationLocations(){
        ArrayList<VaccinationLocation> locationsList = new ArrayList<VaccinationLocation>();
        
        locationsList.add(new HealthCenter(
                              "Centro de Saude de Silvalde",
                              "Av. Albergarias 23, 4500-643 Silvalde",
                              "22 734 3642"
                                )
                            );
        locationsList.add(new Hospital(
                                "Hospital de S.João", 
                                "Alameda Prof. Hernâni Monteiro, 4200-319 Porto", 
                                "22 551 2100", 
                                "Edificio A3", 
                                "226"
                                 )
                            );
        locationsList.add(new HealthCenter(
                              "Centro de Saúde de Mafamude/Soares dos Reis",
                              "R. Bartolomeu Dias 316, 4430-999 Vila Nova de Gaia",
                              "22 002 2540"
                                )
                            );
        locationsList.add(new Pavilion("Pavilhão Rosa Mota", "", "22 399 1230", 2));
        
        locationsList.add(new Hospital(
                                "Centro Hospitalar de Entre Douro e Vouga", 
                                "R. Dr. Cândido Pinho 5, 4520-211 Santa Maria da Feira", 
                                "256 379 700", 
                                "Edificio B3", 
                                "256"
                                 )
                            );
                            
        
        
        return locationsList;
    }

    public static ArrayList<Vaccine> generateDefaultVaccines(){
        ArrayList<Vaccine> vaccinesList = new ArrayList<Vaccine>();
        
        vaccinesList.add(new Vaccine( "Pfizer / BioNTech", "AB010203"));
        vaccinesList.add(new Vaccine( "Moderna", "CD010203"));
        vaccinesList.add(new Vaccine( "Oxford / AstraZeneca", "EF010203"));
      
        return vaccinesList;
    }
}
    
