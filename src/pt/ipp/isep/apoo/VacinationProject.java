/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo;

import java.io.IOException;
import pt.ipp.isep.apoo.classes.*;

/**
 *
 * @author Gustavo Reis e João Gomes
 */
public class VacinationProject {

    /**
     * Método principal responsável por iniciar o programa
     *
     * @param args Argumentos
     * @throws IOException Tratamento de Erro
     */
    public static void main(String[] args) throws IOException {

        Menu menu = new Menu();

        menu.run();

    }

}
