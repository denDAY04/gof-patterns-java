package dk.asj.gofpatterns.creational;

public class Room implements MapSite {

    private MapSite[] sides;
    private int roomNumber;

    public Room(int roomNo) {
        roomNumber = roomNo;
        sides = new MapSite[4];
    }

    @Override
    public void enter() {
    }

    public MapSite getSide(Direction direction) {
        return sides[direction.ordinal()];
    }

    public void setSide(Direction direction, MapSite mapSite) {
        sides[direction.ordinal()] = mapSite;
    }
}
