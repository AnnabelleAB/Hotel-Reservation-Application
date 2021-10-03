package model;

//Class
public class Room implements IRoom {
    private final String roomNumber;
    protected Double price;
    private final String roomType;
    private final boolean isFree;

//Constructor
    public Room(String roomNumber, Double price, String enumeration, boolean isFree){
        super();
        this.roomNumber=roomNumber;
        this.price=price;
        this.roomType = enumeration;
        this.isFree=isFree;
    }

    //Getter Method
    @Override
    public String getRoomNumber(){
        return roomNumber;
    }
    @Override
    public Double getRoomPrice(){
        return price;
    }
    @Override
    public RoomType getRoomType(){
        return this.roomType;
    }
    @Override
    public Boolean isFree(){
        return isFree;
    }
    @Override
    public String toString(){
        return "Room No."+roomNumber + "price $"+ price +", room type "+ roomType ;
    }
}
