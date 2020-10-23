package Assignment3;

public class Box {
    private double width;
    private double length;
    private double height;
    
    public Box(double width, double length, double height) {
        this.width = width<0?0:width;
        this.length = length<0?0:length;
        this.height = height<0?0:height;
    }
    public void setWidth(double width) {
        this.width = width<0?0:width;
    }
    public void setLength(double length) {
        this.length = length<0?0:length;
    }
    public void setHeight(double height) {
        this.height = height<0?0:height;
    }
    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return this.length;
    }
    public double getHeight() {
        return this.height;
    }
    public double getVolume() {
        return (this.width*this.length*this.height);
    }
    public void displayDimension() {
        System.out.println("Dimensions are -");
        System.out.println("Width = "+this.width);
        System.out.println("Length = "+this.length);
        System.out.println("Height = "+this.height);
    }

}
