package api;

import model.Customer;
import model.IRoom;
import model.Reservation;
import model.RoomType;
import service.CustomerService;
import service.ReservationService;

import java.util.Collection;
import java.util.List;

public class AdminResource {

    //provide a static reference, why import these two ???

    public static final CustomerService customerService = new CustomerService();
    public static final ReservationService reservationService = ReservationService.getInstance();

    public Customer getCustomer(String email){ return customerService.getCustomer(email);}
    public static void createRooms(String roomNumber, double price, String roomType, boolean isFree){
        reservationService.addRoom(roomNumber,price,roomType,isFree);
        System.out.println("The Room has been created successfully");
    }
    public static Collection<IRoom> getAllRooms(){return reservationService.allRooms();}
    public static List<Customer> getAllCustomer(){return customerService.getAllCustomers();}
    public static Collection<Reservation>getAllReservations(){
        return reservationService.getAllReservations();
    }

}
