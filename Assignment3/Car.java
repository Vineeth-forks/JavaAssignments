package Assignment3;

public class Car {
    private double mileage;
    
    public Car(double mileage){
        this.mileage = mileage<0?0:mileage;
    }
    public void setMileage(double mileage) {
        this.mileage = mileage<0?0:mileage;
    } 
    public double getMileage() {
        return this.mileage;
    }
    public void displayMileage() {
        System.out.println("Car mileage = "+this.mileage);
    } 
}
