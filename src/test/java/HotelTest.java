import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Guest guest;
    Guest guest2;
    Guest guest3;

    Bedroom bedroom;
    Bedroom bedroom2;
    Bedroom bedroom3;

    ConferenceRoom conferenceRoom;

    Hotel hotel;

    Booking booking;


    @Before
    public void before() {
        guest = new Guest("John");
        guest2 = new Guest("Ian");
        guest3 = new Guest("Sarah");
        bedroom = new Bedroom(RoomType.DOUBLE, 10, 50.00);
        bedroom2 = new Bedroom(RoomType.SINGLE, 15, 70.00);
        bedroom3 = new Bedroom(RoomType.DOUBLE, 12, 30.00);
        conferenceRoom = new ConferenceRoom(RoomType.BOARDROOM, "Board Room");
        hotel  = new Hotel();
    }


    @Test
    public void canGetBedrooms () {
        assertEquals(0, hotel.getBedrooms());
    }

    @Test
    public void canAddBedroomsToHotel() {
        hotel.addBedroomToHotel(bedroom);
        hotel.addBedroomToHotel(bedroom2);
        assertEquals(2, hotel.getBedrooms());
    }
//
    @Test
    public void howManyGuestsInBedroom() {
        assertEquals(0, hotel.getBedroomGuests());
    }


    @Test
    public void canAddGuestToBedroom1() {
        hotel.addBedroomToHotel(bedroom);
        hotel.addGuestToBedroom(guest);
        assertEquals(1, hotel.getBedroomGuests());
    }

    @Test
    public void canAddGuestToBedroom2() {
        hotel.addBedroomToHotel(bedroom2);
        hotel.addGuestToBedroom(guest);
        assertEquals(15, bedroom2.getBedroomNumber());
        System.out.println(bedroom2.getBedroomNumber());
        assertEquals(1, hotel.getBedroomGuests());
    }

    @Test
    public void canRemoveGuestFromBedroom() {
        hotel.addBedroomToHotel(bedroom);
        hotel.addGuestToBedroom(guest);
        hotel.removeGuestFromBedroom(bedroom);
        assertEquals(0, bedroom.getGuests());
    }

    @Test
    public void canGetConferenceRooms () {
        assertEquals(0, hotel.getConferenceRooms());
    }

    @Test
    public void canAddConferenceRoomToHotel() {
        hotel.addConferenceRoomToHotel(conferenceRoom);
        assertEquals(1, hotel.getConferenceRooms());
    }

    @Test
    public void howManyGuestsInConferenceRoom() {
        assertEquals(0, hotel.getConferenceGuests());
    }

    @Test
    public void canAddGuestToConferenceRoom() {
        hotel.addConferenceRoomToHotel(conferenceRoom);
        hotel.addGuestToConferenceRoom(guest);
        assertEquals(1, hotel.getConferenceGuests());
    }

    @Test
    public void canRemoveGuestFromConferenceRoom() {
        hotel.addConferenceRoomToHotel(conferenceRoom);
        hotel.addGuestToConferenceRoom(guest);
        hotel.removeGuestFromConferenceRoom(conferenceRoom);
        assertEquals(0, conferenceRoom.getGuests());
    }

    @Test
    public void canCreateBooking() {
        Booking booking = hotel.bookRoom(bedroom2, 5);
        assertEquals(5, booking.getNumOfNightsBooked());
    }

//    @Test
//    public void getTotalBill() {
//        assertEquals(350));
//    }

}
