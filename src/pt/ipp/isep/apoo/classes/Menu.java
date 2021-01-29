/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo.classes;

import java.io.IOException;
import java.util.*;
import static pt.ipp.isep.apoo.repositories.AllSchedules.readfromFile;

/**
 *
 * @author Gustavo Reis e João Gomes
 */
public class Menu {

    /**
     * Método responsável por executar o Menu
     *
     * @throws IOException
     */
    public void run() throws IOException {
        int option = 0;

        Scanner reader = new Scanner(System.in);

        System.out.println("");
        System.out.println("Seja bem-vindo!!");
        System.out.println("O que deseja fazer?");
        System.out.println("");
        System.out.println(" 1 - Fazer marcação");
        System.out.println(" 2 - Pesquisar marcação por numero de utente");
        System.out.println(" 3 - Alterar uma marcação");
        System.out.println(" 4 - Remover marcações pelo numero de utente");
        System.out.println(" 5 - Pesquisar marcações por idade do utente");
        System.out.println(" 6 - Listar indivíduos por data e local de vacinação");
        System.out.println(" 7 - Pesquisar marcações por marca de vacina");
        System.out.println(" 8 - Pesquisar marcações por lote de vacina");
        System.out.println(" 9 - Pesquisar marcações por marca e por lote de vacina");
        System.out.println(" 10 - Pesquisar marcações por data");
        System.out.println(" 11 - Pesquisar marcações por local de vacionação");
        System.out.println(" 12 - Listar todas as marcações");
        System.out.println(" 13 - Ler marcações do ficheiro");
        System.out.println(" 14 - Imprimir para ficheiro todas as marcações");
        System.out.println(" 15 - Gerar dados para teste");
        System.out.println(" 0 - Sair");
        System.out.println("");
        System.out.println("Insira a opção:");
        option = reader.nextInt();

        Utilities.menuHandler(option);
    }
}
