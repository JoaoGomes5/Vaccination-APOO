/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo;

import pt.ipp.isep.apoo.classes.*;
import pt.ipp.isep.apoo.classes.Utilities.*;
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
        
        ArrayList<Patient> patientsList = Utilities.generateArrayWithDefaultPatients();
        
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

        switch (option) {
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
