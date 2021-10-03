package model;

import java.util.Date;

public class Reservation {
    private Customer customer;
    private IRoom room;
    private Date checkInDate;
    private Date checkOutDate;

    //Constructor
    public Reservation(String customer, IRoom room, Date checkInDate, Date checkOutDate){
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
    //Getter


    public String getCustomer() {
        return customer;
    }

    public IRoom getRoom() {
        return room;
    }
    public Date getCheckInDate(){
        return checkInDate;
    }
    public Date getCheckOutDate(){
        return checkOutDate;
    }

    //Setter
    public void setCustomer(Customer customer){
        this.customer=customer;
    }
    public void setRoom(IRoom room){
        this.room = room;
    }
    public void setCheckInDate(Date checkInDate){
        this.checkInDate=checkInDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString(){
        return "Reservation Information " +
                "Customer name: " + customer+
                "Customer check in date: " + checkInDate+
                "Customer check out date: " + checkOutDate;
    }

}
