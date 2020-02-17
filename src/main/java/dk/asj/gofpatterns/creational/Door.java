package dk.asj.gofpatterns.creational;

public class Door implements MapSite {

    private boolean isOpen;
    private Room room1;
    private Room room2;

    public Room otherSideFrom(Room room) {
        if (room == room1) {
            return room2;
        } else if (room == room2) {
            return room1;
        }
        return null;
    }

    @Override
    public void enter() {

    }
}
