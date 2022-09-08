

import java.util.ArrayList;

public class Bedroom extends Room {
    private int roomNumber;

    private double nightlyRate;

    public Bedroom(RoomType roomType, int roomNumber, double nightlyRate) {
        super(roomType);
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
    }

    public int getBedroomNumber() {
        return this.roomNumber;
    }

    public double getNightlyRate() {
        return this.nightlyRate;
    }
}
