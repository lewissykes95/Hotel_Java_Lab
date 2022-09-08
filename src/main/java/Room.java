import java.util.ArrayList;

public abstract class Room {
    private RoomType roomType;
    protected  ArrayList<Guest> guests;

    public Room(RoomType roomType) {
        this.roomType = roomType;
        this.guests = new ArrayList<Guest>();
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public int getGuests() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }


}
