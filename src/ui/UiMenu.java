package ui;

import Taller2.canteraSofka.DroneCraft;
import Taller2.canteraSofka.MannedCraft;
import Taller2.canteraSofka.ShuttleCraft;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Juan Carlos Gomez Jaramillo
 * Clase Ui (interfaz de usuario)
 * Genero un menu para que el usuario seleccione la opcion de la nave a crear
 *  */
public class UiMenu {
    public void showMenu() throws ParseException {
        Scanner read = new Scanner(System.in);

        System.out.println("Seleccione la nave de que desaea crear: ");

        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println("Create your ship: ");
            System.out.println("1. Shuttle vehicule");
            System.out.println("2. Drone ship");
            System.out.println("3. Manned spacecraft");
            System.out.println("4. Exit");

            response = Integer.valueOf(read.nextLine());

            switch (response){
                case 1:
                    int idShuttle = 0;
                    String nameShuttle="";
                    String nameManufacturer = "";

                    ShuttleCraft shCraf = new ShuttleCraft(idShuttle,nameShuttle,nameManufacturer);

                    System.out.println("Enter your space craft manufacturer: ");
                    nameManufacturer = read.nextLine();
                    System.out.println("Enter name of your space craft: ");
                    nameShuttle = read.nextLine();
                    System.out.println("Enter id of your space craft: ");
                    idShuttle = Integer.valueOf(read.nextLine());

                    shCraf.setName(nameShuttle);
                    shCraf.setManufacturing(nameManufacturer);
                    shCraf.setId(idShuttle);

                    shCraf.showdataCraft();

                    break;
                case 2:
/**
 * en el caso de elegir la opcion de nave no tripulada el usuario debe ingresar el nombre de la mision y la fecha
 * de la mision en este formato dd/MM/YYYY
 */
                    int idDrone = 0;
                    String nameDrone="";
                    String nameDrManufacturer = "";
                    String mission= "";
                    Date missionDate;
                    DroneCraft DrCraf = new DroneCraft(idDrone,nameDrone,nameDrManufacturer);

                    System.out.println("Enter your space craft manufacturer: ");
                    nameDrManufacturer = read.nextLine();
                    System.out.println("Enter name of your space craft: ");
                    nameDrone = read.nextLine();
                    System.out.println("Enter id of your space craft: ");
                    idDrone = Integer.valueOf(read.nextLine());
                    System.out.println("Enter name mission: ");
                    mission =read.nextLine();
                    System.out.println("Enter date of mission: ");
                    missionDate = new SimpleDateFormat("dd/MM/yyy").parse(read.nextLine());

                    DrCraf.setName(nameDrone);
                    DrCraf.setManufacturing(nameDrManufacturer);
                    DrCraf.setId(idDrone);
                    DrCraf.setMission(mission);
                    DrCraf.setDateMission(missionDate);

                    DrCraf.showdataCraft();
                    DrCraf.mission(mission,missionDate);
                    System.out.println("Mission: "+DrCraf.getMission());
                    break;
                case 3:
                    int idMannedSpCraft = 0;
                    String nameMannedSpCraft="";
                    String nameMannedSPManufacturer = "";

                    MannedCraft mannedCraft = new MannedCraft(idMannedSpCraft,nameMannedSpCraft,nameMannedSPManufacturer);

                    System.out.println("Enter your space craft manufacturer: ");
                    nameMannedSPManufacturer = read.nextLine();
                    System.out.println("Enter name of your space craft: ");
                    nameMannedSpCraft = read.nextLine();
                    System.out.println("Enter id of your space craft: ");
                    idMannedSpCraft = Integer.valueOf(read.nextLine());

                    mannedCraft.setName(nameMannedSpCraft);
                    mannedCraft.setManufacturing(nameMannedSPManufacturer);
                    mannedCraft.setId(idMannedSpCraft);

                    mannedCraft.showdataCraft();

                    break;
                case 4:
                    System.out.println("...leaving....");
                    break;
            }

        }while (response !=4);

    }
}