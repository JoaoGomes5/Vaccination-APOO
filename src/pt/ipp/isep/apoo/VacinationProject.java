/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo;

import pt.ipp.isep.apoo.classes.*;
import java.util.*;




/**
 *
 * @author João e Gustavo
 */
public class VacinationProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int option = 0;
        Scanner reader = new Scanner(System.in);
        
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


        System.out.println("Seja bem-vindo!!");
        System.out.println("O que deseja fazer?");
        
        System.out.println(" 2 - Fazer marcação");
        System.out.println(" 3 - Pesquisar marcação por Utente");
        System.out.println(" 4 - Alterar uma marcação");
        System.out.println(" 5 - Pesquisar marcações de utentes por idade");
        System.out.println(" 6 - Pesquisar marcações por marca");   
        System.out.println(" 7 - Pesquisar marcações por lote");
        System.out.println(" 8 - Pesquisar marcações por marca e por lote");
        
        option = reader.nextInt();

        switch(option){
            case 1:
                System.out.println("Escolha o local de vacinação");
                    for (Patient patient : patientsList) {
                        System.out.println(patient.getName());
                    }
                break;


            default:
                break;
        }
        
        
        
        

       
    }
    
}
