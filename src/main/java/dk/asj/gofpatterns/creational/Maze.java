package dk.asj.gofpatterns.creational;

import java.util.ArrayList;
import java.util.List;

public class Maze {

    private List<Room> rooms;

    public Maze() {
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room roomNo(int roomNo) {
        if (roomNo > rooms.size() || roomNo < 0) {
            return null;
        }
        return rooms.get(roomNo);
    }
}
