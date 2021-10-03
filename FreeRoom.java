package model;
//This is the FreeRoom class extends Room
public class FreeRoom extends Room {
    // add the boolean type of the variable

    public FreeRoom(String roomNumber,Double price,RoomType enumeration) {
        super(roomNumber,0.00,enumeration,true);

    }

    @Override
    public String toString(){
        return "this room is free!";
    }
}
