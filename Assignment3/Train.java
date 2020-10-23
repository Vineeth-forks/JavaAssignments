package Assignment3;

public class Train {
    private String source;
    private String destination;

    public Train(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getSource() {
        return this.source;
    }
    public String getDestination() {
        return this.destination;
    }
    public void displaySourceAndDestination() {
        System.out.println("Source: "+this.source);
        System.out.println("Destination: "+this.destination);
    }
}
