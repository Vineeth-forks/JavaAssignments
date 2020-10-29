public class Room {
    private int capacity;
    private int rent;
    private String type;
    private boolean status;
    private String checkIn;
    private String checkOut;
    private int[] rooms;
    public Room(int capacity, int rent) {
        this.capacity = capacity;
        this.rent = rent;
        this.status = false;
        rooms = new int[capacity];
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }
    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }
    public void setStatus(boolean status, int roomNumber) {
        if(status)
            rooms[roomNumber-1] = 1;
    }
    public int getRent() {
        return this.rent;
    }
    public String getType() {
        return this.type;
    }
    public boolean getStatus() {
        return this.status;
    }
    public String getCheckIn() {
        return this.checkIn;
    }
    public String getCheckOut() {
        return this.checkOut;
    }
    public String showStatus(int roomNumber) {
        if(rooms[roomNumber-1]==1)
            return "Occupied";
        return "Vacant";
    }
}
