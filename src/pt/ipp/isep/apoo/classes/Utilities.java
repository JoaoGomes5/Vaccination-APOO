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
    
    public static ArrayList<Nurse> generateArrayWithDefaultPatients(){
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
    
     public static ArrayList<Nurse> generateDefaultNurses(){
          ArrayList<Nurse> nursesList = new ArrayList<Nurse>();
        
        nursesList.add(new Nurse("Gustavo Reis", 
                                  81218, 
                                  919990099
                                )
                                
                            );
        nursesList.add(new Nurse("Diana Ribeiro", 
                                  90000, 
                                  935678899
                                )
                             
                            );
        nursesList.add(new Nurse("Jorge Monteiro", 
                                  60000, 
                                  927891234)
                               
                                
                            );
      
        return nursesList;
}
}