import java.util.ArrayList;

public class ConferenceRoom extends Room {
    private String name;

    public ConferenceRoom(RoomType roomType, String name) {
        super(roomType);
        this.name = name;
    }
}
