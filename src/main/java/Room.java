public class Room {
    private boolean occupied;

    public Room(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isAvailable() {
        boolean available = ! occupied;
        return available;
    }
}
