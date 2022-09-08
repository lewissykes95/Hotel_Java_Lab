import com.sun.org.apache.xpath.internal.operations.Gt;

import java.awt.print.Book;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    Booking booking;


    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public int getBedrooms() {
        return this.bedrooms.size();
    }

    public void addBedroomToHotel(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public int getBedroomGuests() {
        return this.bedrooms.size();
    }

    public void addGuestToBedroom(Guest guest) {
        if(bedrooms.size() > 0) {
            Bedroom bedroom1 = bedrooms.get(0);
            bedroom1.addGuest(guest);
        }

    }

    public void removeGuestFromBedroom(Bedroom bedroom){
        bedroom.guests.remove(0);

    }

    public int getConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void addConferenceRoomToHotel(ConferenceRoom conferenceRoom){
         this.conferenceRooms.add(conferenceRoom);
    }

    public int getConferenceGuests() {
        return this.conferenceRooms.size();
    }


    public void addGuestToConferenceRoom(Guest guest) {
        if(conferenceRooms.size() > 0) {
            ConferenceRoom conferenceRoom = conferenceRooms.get(0);
            conferenceRoom.addGuest(guest);
        }

    }

    public void removeGuestFromConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRoom.guests.remove(0);
    }

    public Booking bookRoom(Bedroom bedroom, int numNights){
        return booking = new Booking(bedroom, numNights);
    }


}
