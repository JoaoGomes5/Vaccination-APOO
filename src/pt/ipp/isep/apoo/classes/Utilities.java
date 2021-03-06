/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo.classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import pt.ipp.isep.apoo.repositories.AllSchedules;
import static pt.ipp.isep.apoo.repositories.AllSchedules.readfromFile;

/**
 *
 * @author Gustavo Reis e João Gomes
 */
public class Utilities {

    /**
     * Método para receber a opção do Menu e efectua a respectiva função
     *
     * @param option Opção Selecionada no Menu
     * @throws IOException Tratamento de Erro
     */
    public static void menuHandler(int option) throws IOException {
        AllSchedules allSchedules = new AllSchedules();
        Menu menu = new Menu();
        ArrayList<Vaccine> vaccinesList = Utilities.generateDefaultVaccines();
        Scanner scanner = new Scanner(System.in);

        switch (option) {
            case 1:

                System.out.println("######################");
                System.out.println("#      Marcação      #");
                System.out.println("######################");
                System.out.println("");

                System.out.println("# Local de Vacinação #");

                String typeOfLocation = "";

                System.out.println("Qual o tipo de local?");
                System.out.println(" H - Hospital");
                System.out.println(" C - Centro de Saude");
                System.out.println(" P - Pavilhão Municipal");
                typeOfLocation = scanner.nextLine();

                switch (typeOfLocation) {

                    case "H":
                        String Hdate = "";
                        String Htime = "";
                        Vaccine Hvaccine = new Vaccine();
                        Patient Hpatient = new Patient();
                        Nurse Hnurse = new Nurse();

                        Hospital hospital = new Hospital();

                        System.out.println("");
                        System.out.println("Insira o nome do local");
                        hospital.setName(scanner.nextLine());

                        System.out.println("");
                        System.out.println("Insira a morada do local");
                        hospital.setAddress(scanner.nextLine());
                        System.out.println("");
                        System.out.println("Insira o contacto telefonico do local");
                        hospital.setPhoneNumber(scanner.nextLine());
                        System.out.println("");
                        System.out.println("Insira o nome do edificio");
                        hospital.setBuildingName(scanner.nextLine());
                        System.out.println("");
                        System.out.println("Insira a extensão telefonica do local");
                        hospital.setExtension(scanner.nextLine());

                        System.out.println("");
                        System.out.println("# Data de marcação #");
                        System.out.println("Insira a data da marcação - Digite o data no formato DD-MM-AAAA");
                        Hdate = scanner.nextLine();

                        System.out.println("# Hora de Vacinação #");
                        System.out.println("Insira a hora da marcação - Digite a hora no formato HH:MM");
                        Htime = scanner.nextLine();

                        System.out.println("");
                        System.out.println("# Enfermeiro #");
                        System.out.println("");
                        System.out.println("Insira o nome do enfermeiro");
                        Hnurse.setName(scanner.nextLine());
                        System.out.println("");
                        System.out.println("Insira o número de cédula profissional");
                        Hnurse.setCardNumber(scanner.nextInt());
                        System.out.println("");
                        System.out.println("Insira o contacto telefonico do enfermeiro");
                        Hnurse.setPhoneNumber(scanner.nextInt());
                        scanner.nextLine();

                        System.out.println("# Utente #");
                        System.out.println("Insira o nome do utente");
                        Hpatient.setName(scanner.nextLine());
                        System.out.println("");
                        System.out.println("Insira o sexo do utente");
                        Hpatient.setGender(scanner.nextLine());
                        System.out.println("");
                        System.out.println("Insira o ano de nascimento do utente");
                        Hpatient.setYearOfBirth(scanner.nextInt());
                        System.out.println("");
                        System.out.println("Insira o numero de utente");
                        Hpatient.setPatientNumber(scanner.nextInt());
                        System.out.println("");
                        System.out.println("Insira o contacto telefonico do utente");
                        Hpatient.setPhoneNumber(scanner.nextInt());

                        System.out.println("");
                        System.out.println("# Vacina #");
                        System.out.println("Escolha a vacina");
                        int Hcounter = 1;
                        for (Vaccine vac : vaccinesList) {
                            System.out.println(" " + (Hcounter++) + " - " + vac.getBrand());
                        }
                        int HvaccineOption = scanner.nextInt();

                        switch (HvaccineOption) {
                            case 1:
                                Hvaccine.setBrand("Pfizer / BioNTech");
                                Hvaccine.setLot("AB010203");
                                break;
                            case 2:
                                Hvaccine.setBrand("Moderna");
                                Hvaccine.setLot("CD010203");
                                break;
                            case 3:
                                Hvaccine.setBrand("Oxford / AstraZeneca");
                                Hvaccine.setLot("EF010203");
                                break;

                            default:
                                break;
                        }

                        try {
                            Schedule Hschedule = new Schedule(hospital, Hdate, Htime, Hnurse, Hpatient, Hvaccine, "H");

                            allSchedules.addScheduleToAllSchedules(Hschedule);

                            System.out.println(" # Marcação realizada com sucesso # ");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                        menu.run();

                        break;

                    case "P":
                        String Pdate = "";
                        String Ptime = "";
                        Vaccine Pvaccine = new Vaccine();
                        Patient Ppatient = new Patient();
                        Nurse Pnurse = new Nurse();

                        Pavilion pavilion = new Pavilion();

                        System.out.println("");
                        System.out.println("Insira o nome do local");
                        pavilion.setName(scanner.nextLine());
                        System.out.println("");
                        System.out.println("Insira a morada do local");
                        pavilion.setAddress(scanner.nextLine());
                        System.out.println("");
                        System.out.println("Insira o contacto telefonico do local");
                        pavilion.setPhoneNumber(scanner.nextLine());
                        System.out.println("");
                        System.out.println("Insira o numero da secção");
                        pavilion.setSectionNumber(scanner.nextInt());
                        scanner.nextLine();
                        System.out.println("");
                        System.out.println("# Data de marcação #");
                        System.out.println("Insira a data da marcação - Digite o data no formato DD-MM-AAAA");
                        Pdate = scanner.nextLine();

                        System.out.println("");
                        System.out.println("# Hora de Vacinação #");
                        System.out.println("Insira a hora da marcação - Digite a hora no formato HH:MM");
                        Ptime = scanner.nextLine();

                        System.out.println("");
                        System.out.println("# Enfermeiro #");
                        System.out.println("");
                        System.out.println("Insira o nome do enfermeiro");
                        Pnurse.setName(scanner.nextLine());
                        System.out.println("");
                        System.out.println("Insira o número de cédula profissional");
                        Pnurse.setCardNumber(scanner.nextInt());
                        System.out.println("Insira o contacto telefonico do enfermeiro");
                        Pnurse.setPhoneNumber(scanner.nextInt());
                        scanner.nextLine();

                        System.out.println("# Utente #");
                        System.out.println("Insira o nome do utente");
                        Ppatient.setName(scanner.nextLine());
                        System.out.println("");
                        System.out.println("Insira o sexo do utente");
                        Ppatient.setGender(scanner.nextLine());
                        System.out.println("");
                        System.out.println("Insira o ano de nascimento do utente");
                        Ppatient.setYearOfBirth(scanner.nextInt());
                        System.out.println("");
                        System.out.println("Insira o numero de utente");
                        Ppatient.setPatientNumber(scanner.nextInt());
                        System.out.println("");
                        System.out.println("Insira o contacto telefonico do utente");
                        Ppatient.setPhoneNumber(scanner.nextInt());

                        System.out.println("");
                        System.out.println("# Vacina #");
                        System.out.println("Escolha a vacina");
                        int Pcounter = 1;
                        for (Vaccine vac : vaccinesList) {
                            System.out.println(" " + (Pcounter++) + " - " + vac.getBrand());
                        }
                        int PvaccineOption = scanner.nextInt();

                        switch (PvaccineOption) {
                            case 1:
                                Pvaccine.setBrand("Pfizer / BioNTech");
                                Pvaccine.setLot("AB010203");
                                break;
                            case 2:
                                Pvaccine.setBrand("Moderna");
                                Pvaccine.setLot("CD010203");
                                break;
                            case 3:
                                Pvaccine.setBrand("Oxford / AstraZeneca");
                                Pvaccine.setLot("EF010203");
                                break;

                            default:
                                break;
                        }

                        try {
                            Schedule Pschedule = new Schedule(pavilion, Pdate, Ptime, Pnurse, Ppatient, Pvaccine, "P");

                            allSchedules.addScheduleToAllSchedules(Pschedule);

                            System.out.println(" # Marcação realizada com sucesso # ");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                        menu.run();
                        break;

                    case "C":
                        String Cdate = "";
                        String Ctime = "";
                        Vaccine Cvaccine = new Vaccine();
                        Patient Cpatient = new Patient();
                        Nurse Cnurse = new Nurse();

                        HealthCenter center = new HealthCenter();

                        System.out.println("");
                        System.out.println("Insira o nome do local");
                        center.setName(scanner.nextLine());
                        System.out.println("");
                        System.out.println("Insira a morada do local");
                        center.setAddress(scanner.nextLine());
                        System.out.println("");
                        System.out.println("Insira o contacto telefonico do local");
                        center.setPhoneNumber(scanner.nextLine());

                        System.out.println("");
                        System.out.println("# Data de marcação #");
                        System.out.println("Insira a data da marcação - Digite o data no formato DD-MM-AAAA");

                        Cdate = scanner.nextLine();

                        System.out.println("");
                        System.out.println("# Hora de Vacinação #");
                        System.out.println("Insira a hora da marcação - Digite a hora no formato HH:MM");
                        Ctime = scanner.nextLine();

                        System.out.println("");
                        System.out.println("# Enfermeiro #");
                        System.out.println("");
                        System.out.println("Insira o nome do enfermeiro");
                        Cnurse.setName(scanner.nextLine());
                        System.out.println("");
                        System.out.println("Insira o número de cédula profissional");
                        Cnurse.setCardNumber(scanner.nextInt());
                        System.out.println("Insira o contacto telefonico do enfermeiro");
                        Cnurse.setPhoneNumber(scanner.nextInt());
                        scanner.nextLine();

                        System.out.println("# Utente #");
                        System.out.println("Insira o nome do utente");
                        Cpatient.setName(scanner.nextLine());
                        System.out.println("");
                        System.out.println("Insira o sexo do utente");
                        Cpatient.setGender(scanner.nextLine());
                        System.out.println("");
                        System.out.println("Insira o ano de nascimento do utente");
                        Cpatient.setYearOfBirth(scanner.nextInt());
                        System.out.println("");
                        System.out.println("Insira o numero de utente");
                        Cpatient.setPatientNumber(scanner.nextInt());
                        System.out.println("");
                        System.out.println("Insira o contacto telefonico do utente");
                        Cpatient.setPhoneNumber(scanner.nextInt());

                        System.out.println("");
                        System.out.println("# Vacina #");
                        System.out.println("Escolha a vacina");
                        int Ccounter = 1;
                        for (Vaccine vac : vaccinesList) {
                            System.out.println(" " + (Ccounter++) + " - " + vac.getBrand());
                        }
                        int CvaccineOption = scanner.nextInt();

                        switch (CvaccineOption) {
                            case 1:
                                Cvaccine.setBrand("Pfizer / BioNTech");
                                Cvaccine.setLot("AB010203");
                                break;
                            case 2:
                                Cvaccine.setBrand("Moderna");
                                Cvaccine.setLot("CD010203");
                                break;
                            case 3:
                                Cvaccine.setBrand("Oxford / AstraZeneca");
                                Cvaccine.setLot("EF010203");
                                break;

                            default:
                                break;
                        }

                        try {
                            Schedule Cschedule = new Schedule(center, Cdate, Ctime, Cnurse, Cpatient, Cvaccine, "C");

                            allSchedules.addScheduleToAllSchedules(Cschedule);

                            System.out.println(" # Marcação realizada com sucesso # ");

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }

                        menu.run();
                        break;

                    default:
                        System.out.println("Insira uma opção valida");
                        menu.run();
                        break;
                }

                break;
            case 2:
                System.out.println("Introduza o número de utente");
                int number = scanner.nextInt();
                try {
                    AllSchedules.searchScheduleByPatientNumber(number);
                } catch (Exception e) {
                }
                menu.run();
                break;
            case 3:
                System.out.println("Introduza o número de utente");
                int selectedNumber = scanner.nextInt();

                System.out.println("Quais indormações pertende alterar?");
                System.out.println(" 1 - Local");
                System.out.println(" 2 - Data");
                System.out.println(" 3 - Hora");
                System.out.println(" 4 - Enfermeiro ");

                int selectedOption = scanner.nextInt();

                try {
                    AllSchedules.updateScheduleByPatientNumber(selectedNumber, selectedOption);

                } catch (Exception e) {
                }

                menu.run();

                break;
            case 4:
                System.out.println("Introduza o numero de utente");
                int patientNumber = scanner.nextInt();

                AllSchedules.deleteScheduleByPatientName(patientNumber);
                System.out.println("# Marcação removida com sucesso #");

                menu.run();
                break;

            case 5:
                System.out.println("Introduza a idade");
                int age = scanner.nextInt();
                AllSchedules.searchScheduleByPatientÀge(age);

                menu.run();
                break;
            case 6:
                System.out.println("Introduza a data");
                String sDate = scanner.nextLine();
                System.out.println("Introduza o nome do local");
                String local = scanner.nextLine();
                try {
                    AllSchedules.listPeopleByDateAndLocation(sDate, local);
                } catch (Exception e) {

                }

                menu.run();
                break;
            case 7:
                System.out.println("Introduza a Marca da Vacina para pesquisar por Marcações");
                String marca = scanner.nextLine();

                try {
                    AllSchedules.searchByBrand(marca);
                } catch (Exception e) {
                }

                menu.run();

                break;
            case 8:
                System.out.println("Introduza o lote da Vacina para pesquisar por Marcações");
                String lote = scanner.nextLine();

                try {
                    AllSchedules.searchByLot(lote);
                } catch (Exception e) {
                }

                menu.run();
                break;
            case 9:
                System.out.println("Introduza a marca da Vacina para pesquisar por Marcações");
                String marca1 = scanner.nextLine();
                System.out.println("Introduza o lote da Vacina para pesquisar por Marcações");
                String lote1 = scanner.nextLine();

                try {
                    AllSchedules.searchByBrandAndLot(marca1, lote1);
                } catch (Exception e) {
                }

                menu.run();
                break;

            case 10:
                System.out.println("Introduza a data");
                String date = scanner.nextLine();

                try {
                    System.out.println("");
                    AllSchedules.searchByDate(date);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                menu.run();
                break;
            case 11:
                System.out.println("Introduza o nome do estabelecimento");
                String location = scanner.nextLine();
                try {
                    AllSchedules.findByVaccinationLocation(location);
                } catch (Exception e) {
                }

                menu.run();
                break;

            case 12:
                try {
                    AllSchedules.listAllSchedules();
                } catch (Exception e) {
                }

                menu.run();
                break;
            case 13:
                try {
                    readfromFile();

                } catch (Exception e) {
                }

                menu.run();
                break;
            case 14:
                try {
                    AllSchedules.saveSchedulesToFile();
                    System.out.println(" # Guardado com sucesso #");
                } catch (Exception e) {
                }

                menu.run();
                break;
            case 15:
                try {
                    generateData();
                } catch (Exception e) {
                }

                menu.run();
                break;
            case 0:
                break;

            default:
                System.out.println("Insira uma opção valida");
                menu.run();
                break;

        }

    }

    /**
     * Método para gerar Marcações para teste
     *
     * @return Retorna a lista de Marcações para teste
     */
    public static ArrayList<Schedule> generateDefaultSchedules() {

        ArrayList<Schedule> schedulesList = new ArrayList<Schedule>();

        ArrayList<Patient> patientsList = new ArrayList<Patient>();
        patientsList = generateDefaultPatients();

        ArrayList<Nurse> nursesList = new ArrayList<Nurse>();
        nursesList = generateDefaultNurses();

        ArrayList<VaccinationLocation> locationsList = new ArrayList<VaccinationLocation>();
        locationsList = generateDefaultVaccinationLocations();

        ArrayList<Vaccine> vaccineList = new ArrayList<Vaccine>();
        vaccineList = generateDefaultVaccines();

        try {
            Schedule a = new Schedule(locationsList.get(0), "28-01-2021", "10:00", nursesList.get(0), patientsList.get(0), vaccineList.get(0), "C");
            schedulesList.add(a);
            AllSchedules.addScheduleToAllSchedules(a);

            Schedule b = new Schedule(locationsList.get(1), "28-01-2021", "10:30", nursesList.get(1), patientsList.get(1), vaccineList.get(1), "H");
            schedulesList.add(b);
            AllSchedules.addScheduleToAllSchedules(b);

            Schedule c = new Schedule(locationsList.get(2), "28-01-2021", "11:00", nursesList.get(2), patientsList.get(2), vaccineList.get(2), "C");
            schedulesList.add(c);
            AllSchedules.addScheduleToAllSchedules(c);

            Schedule d = new Schedule(locationsList.get(3), "28-01-2021", "11:30", nursesList.get(0), patientsList.get(3), vaccineList.get(0), "P");
            schedulesList.add(d);
            AllSchedules.addScheduleToAllSchedules(d);

            Schedule e = new Schedule(locationsList.get(4), "28-01-2021", "12:00", nursesList.get(1), patientsList.get(4), vaccineList.get(1), "H");
            schedulesList.add(e);
            AllSchedules.addScheduleToAllSchedules(e);

            Schedule f = new Schedule(locationsList.get(4), "18-02-2021", "10:00", nursesList.get(2), patientsList.get(5), vaccineList.get(2), "H");
            schedulesList.add(f);
            AllSchedules.addScheduleToAllSchedules(f);

            Schedule g = new Schedule(locationsList.get(3), "18-02-2021", "10:30", nursesList.get(0), patientsList.get(6), vaccineList.get(0), "P");
            schedulesList.add(g);
            AllSchedules.addScheduleToAllSchedules(g);

            Schedule h = new Schedule(locationsList.get(2), "18-02-2021", "11:00", nursesList.get(1), patientsList.get(7), vaccineList.get(1), "C");
            schedulesList.add(h);
            AllSchedules.addScheduleToAllSchedules(h);

            Schedule i = new Schedule(locationsList.get(1), "18-02-2021", "11:30", nursesList.get(2), patientsList.get(8), vaccineList.get(2), "H");
            schedulesList.add(i);
            AllSchedules.addScheduleToAllSchedules(i);

            Schedule j = new Schedule(locationsList.get(2), "18-02-2021", "12:00", nursesList.get(0), patientsList.get(9), vaccineList.get(0), "C");
            schedulesList.add(j);
            AllSchedules.addScheduleToAllSchedules(j);

        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
        return schedulesList;

    }

    /**
     * Método para gerar Utentes para teste
     *
     * @return Retorna a lista de Utentes para teste
     */
    public static ArrayList<Patient> generateDefaultPatients() {
        ArrayList<Patient> patientsList = new ArrayList<Patient>();

        patientsList.add(new Patient(
                "João",
                "Masculino",
                2002,
                1,
                911111111
        )
        );
        patientsList.add(new Patient(
                "Jonh Cena",
                "Masculino",
                1973,
                2,
                911111111
        )
        );
        patientsList.add(new Patient(
                "Margarida Sá Cordeiro",
                "Feminino",
                2000,
                3,
                918654329
        )
        );
        patientsList.add(new Patient(
                "Henrique Buenadicha",
                "Masculino",
                1980,
                4,
                919876243
        )
        );
        patientsList.add(new Patient(
                "Maria Salgado",
                "Feminino",
                2007,
                5,
                93564790
        )
        );
        patientsList.add(new Patient(
                "Jorge Calado",
                "Masculino",
                1983,
                6,
                931234873
        )
        );
        patientsList.add(new Patient(
                "Cristiana Martins",
                "Feminino",
                2000,
                7,
                911665544
        )
        );
        patientsList.add(new Patient(
                "Dara Lopes",
                "Feminino",
                2001,
                8,
                915789654
        )
        );
        patientsList.add(new Patient(
                "Manuel Novo",
                "Masculino",
                1999,
                9,
                912456789
        )
        );
        patientsList.add(new Patient(
                "Joaquim Gomes",
                "Masculino",
                2000,
                10,
                931123123
        )
        );

        return patientsList;
    }

    /**
     * Método para gerar Locais de Vacinação para teste
     *
     * @return Retorna a lista de Locais de Vacinação para teste
     */
    public static ArrayList<VaccinationLocation> generateDefaultVaccinationLocations() {
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
        locationsList.add(new Pavilion("Pavilhão Rosa Mota", "Rua D.Afonso Henriques, numero 5", "22 399 1230", 2));

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

    /**
     * Método para gerar Vacinas para teste
     *
     * @return Retorna a lista de Vacinas para teste
     */
    public static ArrayList<Vaccine> generateDefaultVaccines() {
        ArrayList<Vaccine> vaccinesList = new ArrayList<>();

        vaccinesList.add(new Vaccine("Pfizer / BioNTech", "AB010203"));
        vaccinesList.add(new Vaccine("Moderna", "CD010203"));
        vaccinesList.add(new Vaccine("Oxford / AstraZeneca", "EF010203"));

        return vaccinesList;
    }

    /**
     * Método para gerar Enfermeiros para teste
     *
     * @return Retorna a lista de Enfermeiros para teste
     */
    public static ArrayList<Nurse> generateDefaultNurses() {
        ArrayList<Nurse> nursesList = new ArrayList<>();

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

    /**
     * Método para gerar toda a informação para teste
     */
    public static void generateData() {
        Utilities.generateDefaultNurses();
        Utilities.generateDefaultPatients();
        Utilities.generateDefaultVaccinationLocations();
        Utilities.generateDefaultVaccines();
        Utilities.generateDefaultSchedules();

    }

}
