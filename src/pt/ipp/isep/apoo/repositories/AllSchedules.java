/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.ipp.isep.apoo.repositories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import pt.ipp.isep.apoo.classes.Patient;
import pt.ipp.isep.apoo.classes.Schedule;
import pt.ipp.isep.apoo.classes.Nurse;
import pt.ipp.isep.apoo.classes.Vaccine;
import pt.ipp.isep.apoo.classes.HealthCenter;
import pt.ipp.isep.apoo.classes.Hospital;
import pt.ipp.isep.apoo.classes.Pavilion;

/**
 *
 * @author Gustavo Reis e João Gomes
 */
public class AllSchedules {

    private static ArrayList<Schedule> schedules = new ArrayList<Schedule>();
    private static int count = 0;

    /**
     *
     * Metodo que permite adicionar uma nova marcação ao ArrayList que contem
     * todas as marcações
     *
     * @param newSchedule Marcação
     */
    public static void addScheduleToAllSchedules(Schedule newSchedule) {
        schedules.add(newSchedule);
    }

    /**
     * Metodo que permite listar todas as marcações em memória
     */
    public static void listAllSchedules() {
        int counter = 1;
        System.out.println("O número total de marcações é : " + schedules.size());

        for (Schedule schedule : schedules) {
            System.out.println(
                    "Marcação numero - " + (counter++) + "\n"
                    + " # Local de vacinação #" + "\n"
                    + schedule.getVaccinationLocation().getName() + " | " + schedule.getVaccinationLocation().getAddress() + " | " + schedule.getVaccinationLocation().getPhoneNumber() + "\n"
                    + " # Data #" + "\n"
                    + schedule.getDate() + "\n"
                    + " # Hora #" + "\n"
                    + schedule.getTime() + "\n"
                    + " # Enfermeiro #" + "\n"
                    + schedule.getNurse().getName() + " | " + schedule.getNurse().getCardNumber() + " | " + schedule.getNurse().getPhoneNumber() + "\n"
                    + " # Utente #" + "\n"
                    + schedule.getPatient().getName() + " | " + schedule.getPatient().getGender() + " | " + schedule.getPatient().getYearOfBirth() + " | " + schedule.getPatient().getPatientNumber() + " | " + schedule.getPatient().getPhoneNumber() + "\n"
                    + " # Vacina #" + "\n"
                    + schedule.getVacccine().getBrand() + " | " + schedule.getVacccine().getLot() + "\n"
            );
        }

    }

    /**
     *
     * Metodo que permite ler de um ficheiro a informação das marcações e
     * passa-las para um array (ficheiro -> array)
     *
     * @throws FileNotFoundException Tratamento de erros
     */
    public static void readfromFile() throws FileNotFoundException {
        File file = new File("Marcacoes.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] splitedLine = line.split("\\|");

//                       if(splitedLine[0].trim().equals("P")){
//                   for (int i = 0; i < splitedLine.length; i++) {
//                        
//                      System.out.println(i + " " + splitedLine[i].trim());
//                 }
//            }
            if (splitedLine[0].trim().equals("C")) {
                HealthCenter healthCenter = new HealthCenter(splitedLine[6].trim(), splitedLine[7].trim(), splitedLine[8].trim());
                Nurse nurse = new Nurse(splitedLine[10], Integer.parseInt(splitedLine[11]), Integer.parseInt(splitedLine[12]));
                Patient patient = new Patient(splitedLine[17], splitedLine[18].trim(), Integer.parseInt(splitedLine[19]), Integer.parseInt(splitedLine[20]), Integer.parseInt(splitedLine[21]));
                Vaccine vaccine = new Vaccine(splitedLine[14].trim(), splitedLine[15].trim());

                Schedule schedule = new Schedule(healthCenter, splitedLine[2], splitedLine[4], nurse, patient, vaccine, splitedLine[0]);
                AllSchedules.addScheduleToAllSchedules(schedule);
            }
            if (splitedLine[0].trim().equals("H")) {
                Hospital hospital = new Hospital(splitedLine[6].trim(), splitedLine[7].trim(), splitedLine[8].trim(), splitedLine[9], splitedLine[10]);
                Nurse nurse = new Nurse(splitedLine[12], Integer.parseInt(splitedLine[13]), Integer.parseInt(splitedLine[14]));
                Patient patient = new Patient(splitedLine[19], splitedLine[20], Integer.parseInt(splitedLine[21]), Integer.parseInt(splitedLine[22]), Integer.parseInt(splitedLine[23]));
                Vaccine vaccine = new Vaccine(splitedLine[16], splitedLine[17]);

                Schedule schedule = new Schedule(hospital, splitedLine[2], splitedLine[4], nurse, patient, vaccine, splitedLine[0]);
                AllSchedules.addScheduleToAllSchedules(schedule);
            }
            if (splitedLine[0].trim().equals("P")) {
                Pavilion pavilion = new Pavilion(splitedLine[6].trim(), splitedLine[7].trim(), splitedLine[8].trim(), Integer.parseInt(splitedLine[9]));
                Nurse nurse = new Nurse(splitedLine[11], Integer.parseInt(splitedLine[12]), Integer.parseInt(splitedLine[13]));
                Patient patient = new Patient(splitedLine[18], splitedLine[19], Integer.parseInt(splitedLine[20]), Integer.parseInt(splitedLine[21]), Integer.parseInt(splitedLine[22]));
                Vaccine vaccine = new Vaccine(splitedLine[15], splitedLine[16]);

                Schedule schedule = new Schedule(pavilion, splitedLine[2], splitedLine[4], nurse, patient, vaccine, splitedLine[0]);
                AllSchedules.addScheduleToAllSchedules(schedule);
            }
        }
        scan.close();
    }

    /**
     * Metodo que permite registar em ficheiro a informação das marcações
     * presentes em memória(array → ficheiro)
     *
     * @throws IOException Tratamento de erros
     */
    public static void saveSchedulesToFile() throws IOException {

        FileWriter fw = new FileWriter("Marcacoes.txt");

        for (Schedule schedule : schedules) {
            fw.write(schedule.getTypeOfLocation() + " | " + schedule.toString() + "\n");
        }
        fw.close();
    }

    /**
     *
     * Metodo que permite pesquisar marcação por Utente
     *
     * @param patientNumber Numero de Utente
     */
    public static void searchScheduleByPatientNumber(int patientNumber) {
        for (Schedule schedule : schedules) {
            if (schedule.getPatient().getPatientNumber() == patientNumber) {
                System.out.println(schedule);
            }
        }

    }

    /**
     * Alterar uma marcação (Local, data, hora ou Enfermeiro) pelo numero de
     * utente
     *
     * @param patientNumber Numero de Utente
     * @param option Opção selecionada pelo utilizador
     */
    public static void updateScheduleByPatientNumber(int patientNumber, int option) {
        Scanner scanner = new Scanner(System.in);
        if (option == 1) {
            for (Schedule schedule : schedules) {
                if (schedule.getPatient().getPatientNumber() == patientNumber) {

                    System.out.println("");
                    System.out.println("Insira o novo nome do local");
                    schedule.getVaccinationLocation().setName(scanner.nextLine());
                    System.out.println("");
                    System.out.println("Insira a nova morada do local");
                    schedule.getVaccinationLocation().setAddress(scanner.nextLine());
                    System.out.println("");
                    System.out.println("Insira o novo contacto telefonico do local");
                    schedule.getVaccinationLocation().setPhoneNumber(scanner.nextLine());

                    System.out.println(" # GEditado com sucesso #");
                }
            }

        }

        if (option == 2) {
            for (Schedule schedule : schedules) {
                if (schedule.getPatient().getPatientNumber() == patientNumber) {
                    System.out.println("");
                    System.out.println("Insira a nova  data da marcação - Digite o data no formato DD-MM-AAAA");
                    schedule.setDate(scanner.nextLine());

                    System.out.println(" # GEditado com sucesso #");
                }

            }
        }

        if (option == 3) {
            for (Schedule schedule : schedules) {
                if (schedule.getPatient().getPatientNumber() == patientNumber) {
                    System.out.println("Insira a hora da marcação - Digite a hora no formato HH:MM");
                    schedule.setTime(scanner.nextLine());

                    System.out.println(" # GEditado com sucesso #");
                }

            }
        }

        if (option == 4) {
            for (Schedule schedule : schedules) {
                if (schedule.getPatient().getPatientNumber() == patientNumber) {
                    System.out.println("Insira o nome do enfermeiro");
                    schedule.getNurse().setName(scanner.nextLine());
                    System.out.println("");
                    System.out.println("Insira o número de cédula profissional");
                    schedule.getNurse().setCardNumber(scanner.nextInt());
                    System.out.println("Insira o contacto telefonico do enfermeiro");
                    schedule.getNurse().setPhoneNumber(scanner.nextInt());

                    System.out.println(" # GEditado com sucesso #");

                }

            }

        }
    }

    /**
     * Metodo que remove uma marcação do ArrayList onde se encontram todas as
     * marcações
     *
     * @param patientNumber Numero de Utente
     */
    public static void deleteScheduleByPatientName(int patientNumber) {
        try {
            for (Schedule schedule : schedules) {
//                 
                if (schedule.getPatient().getPatientNumber() == patientNumber) {
                    schedules.remove(schedule);
                }
            }
        } catch (Exception e) {
        }

    }

    /**
     * Metodo que lista todas as marcações dos utentes por idade
     *
     * @param age Idade
     */
    public static void searchScheduleByPatientÀge(int age) {

        List<Schedule> sharedList = new ArrayList<>();
        int currentYear = 2021;
        int ageYear = currentYear - age;

        for (Schedule schedule : schedules) {

            if (schedule.getPatient().getYearOfBirth() == ageYear) {
                sharedList.add(schedule);
            }

        }
        for (Schedule s : sharedList) {
            System.out.println(s.toString());
        }
    }

    /**
     *
     * Metodo que lista todas as marcações por data de marcação
     *
     * @param date Data de marcação
     */
    public static void searchByDate(String date) {
        List<Schedule> list = new ArrayList<>();
        for (Schedule schedule : schedules) {
            if (schedule.getDate().equals(date)) {
                list.add(schedule);
            }

        }
        for (Schedule s : list) {
            System.out.println(s.toString());
        }

    }

    /**
     *
     * Metodo que lista individuos que vão estar numa determinada data num
     * determinado local de vacinação
     *
     * @param date Data de marcação
     * @param location Local de Marcação
     */
    public static void listPeopleByDateAndLocation(String date, String location) {

        for (Schedule schedule : schedules) {
            if (schedule.getDate().equals(date)
                    && schedule.getVaccinationLocation().getName().equals(location)) {
                System.out.println("Enfermeiro - " + schedule.getNurse().getName() + " - " + schedule.getNurse().getPhoneNumber());
                System.out.println("Utente - " + schedule.getPatient().getName() + " - " + schedule.getPatient().getPhoneNumber());
            }
        }

    }

    /**
     * Metodo que pesquisa marcações por marca de vacinação
     *
     * @param brand Marca da vacina
     */
    public static void searchByBrand(String brand) {
        List<Schedule> list = new ArrayList<>();
        for (Schedule schedule : schedules) {
            if (schedule.getVacccine().getBrand().equals(brand)) {
                list.add(schedule);
            }
        }
        for (Schedule s : list) {
            System.out.println(s.toString());
        }

    }

    /**
     * Metodo que pesquisa marcações por lote de vacinação
     *
     * @param lot Lote da vacina
     */
    public static void searchByLot(String lot) {
        List<Schedule> list = new ArrayList<>();
        for (Schedule schedule : schedules) {
            if (schedule.getVacccine().getLot().equals(lot)) {
                list.add(schedule);
            }
        }
        for (Schedule s : list) {
            System.out.println(s.toString());
        }

    }

    /**
     *
     * Metodo que pesquisa marcações por marca e lote de vacinação
     *
     * @param brand Marca da vacina
     * @param lot Lote da Vacina
     */
    public static void searchByBrandAndLot(String brand, String lot) {
        List<Schedule> list = new ArrayList<>();
        for (Schedule schedule : schedules) {
            if (schedule.getVacccine().getLot().equals(lot) && schedule.getVacccine().getBrand().equals(brand)) {
                list.add(schedule);
            }
        }
        for (Schedule s : list) {
            System.out.println(s.toString());
        }

    }

    /**
     *
     * Metodo que pesquisa marcações por local de vacinação
     *
     * @param name Nome do local de vacinação
     */
    public static void findByVaccinationLocation(String name) {
        List<Schedule> list = new ArrayList<>();
        System.out.println(name);

        for (Schedule schedule : schedules) {
            if (schedule.getVaccinationLocation().getName().equals(name)) {
                list.add(schedule);
            }
        }
        for (Schedule s : list) {
            System.out.println(s.toString());
        }

    }

}
