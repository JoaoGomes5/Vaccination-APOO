/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo.classes;

/**
 *
 * @author Gustavo Reis e João Gomes
 */
public class Pavilion extends VaccinationLocation {

    /**
     * Numero da Secção do Pavilhão
     */
    private int sectionNumber;

    /**
     * Metodo construtor
     */
    public Pavilion() {

    }

    /**
     *
     * Método que permite criar um Pavilhão Municipal
     *
     * @param name Nome do Pavilhão Municipal
     * @param address Morada do Pavilhão Municipal
     * @param phoneNumber Número de Telefone do Pavilhão Municipal
     * @param sectionNumber Número da Secção do Pavilhão Municipal
     */
    public Pavilion(String name, String address, String phoneNumber, int sectionNumber) {
        super(name, address, phoneNumber);
        this.sectionNumber = sectionNumber;

    }

    /**
     * Método que permite obter o Número da Secção do Pavilhão Municipal
     *
     * @return Retorna o Número da Secção do Pavilhão Municipal
     */
    public int getSectionNumber() {
        return sectionNumber;
    }

    /**
     * Método que permite definir a secção do Pavilhão Municipal
     *
     * @param sectionNumber Número da Secção do Pavilhão Municipal
     */
    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    /**
     * Método que retorna os atributos de uma classe em forma de texto
     *
     * @return Retorna os atributos de uma classe em forma de texto
     */
    @Override
    public String toString() {
        return super.toString() + "|" + getSectionNumber();
    }

}
