package console;

import api.AdminResource;
import com.sun.tools.javac.Main;
import model.RoomType;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class AdminMenu {
    public static int navigateToMenu = 6;
    public static Scanner input;
    private static AdminResource adminResource;

    public static void display_Menu(){
        System.out.println("Admin Menu");
        System.out.println("1 - All Customer List");
        System.out.println("2 - All Room List");
        System.out.println("3 - All Reservations");
        System.out.println("4 - Add a Room");
        System.out.println("5 - Retrun to Main");
    }
    public static void addAHotelRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Room Number of the Room you wish to add:");
        String roomID = scanner.next();
        System.out.println("Enter the Room Typr Single/Double of the Room");
        String roomType = scanner.next();
        System.out.println("Enter the Room Price per Night");
        Double roomCost = scanner.nextDouble();
        System.out.println("This room free?");
        Boolean isFree = scanner.nextBoolean();

        AdminResource.createRooms(roomID, roomCost, roomType, isFree);
    }

    public static void startAdmin(){
        input=new Scanner(System.in);
        int selection = 0 ;
        while (selection != navigateToMenu){
            switch (selection){
                case 1:
                    System.out.println("Request all customers");
                    System.out.println(adminResource.getAllCustomer());
                    break;
                case 2:
                    System.out.println("Request all rooms");
                    System.out.println(adminResource.getAllRooms());
                    break;
                case 3:
                    System.out.println("Request all reservations");
                    System.out.println(adminResource.getAllReservations());
                    break;
                case 4:
                    System.out.println("Add a room to the Hotel Reservation System");
                    addAHotelRoom();
                case 5:
                    MainMenu.mainMenu();
                    return;
            }
            display_Menu();
            selection=input.nextInt();
        }

    }
}
