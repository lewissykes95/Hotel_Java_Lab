public class Booking {
    Bedroom bedroom;
    private int numOfNightsBooked;

    public Booking(Bedroom bedroom, int numOfNightsBooked) {
        this.bedroom = bedroom;
        this.numOfNightsBooked = numOfNightsBooked;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNumOfNightsBooked() {
        return numOfNightsBooked;
    }

    public double totalBill(Bedroom bedroom, int numNights) {
        return bedroom.getNightlyRate() * numNights;

    }
}
