public class Hotel extends Room {
    private String hotelName;
    private String address;
    public Hotel(String hotelName, String address, int capacity, int rent) {
        super(capacity, rent);
        this.hotelName = hotelName;
        this.address = address;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getHotelName() {
        return this.hotelName; 
    }
    public String getAddress() {
        return this.address;
    }
    public void displayHotelNameAndAddress() {
        System.out.println("Hotel Name: "+this.hotelName);
        System.out.println("Address: "+this.address);
    }
    
}
