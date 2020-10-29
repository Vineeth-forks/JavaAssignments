import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the choice: ");
        System.out.println("Press 1 for question 1,6,11,16,18");
        System.out.println("Press 2 for question 2,7,12,17,18");
        System.out.println("Press 3 for question 3,8,13,18");
        System.out.println("Press 4 for question 4,9,14,18");
        System.out.println("Press 5 for question 5,10,15,18");
        System.out.println("Press 6 for question 19");
        System.out.println("Press 7 for question 20");
        int choice = input.nextInt();
        switch(choice) {
            case 1: Box box = new Box(10,15,5);
                    box.displayDimension();
                    break;
            case 2: Student student1 = new Student("Vineeth",85,90,80,"Basic science","MUJ","2019",55);
                    Student student2 = new Student("Random",88,55,99,"Law","MUJ","2017",69);
                    student1.DisplayStudentname();
                    System.out.println(student1.percentage());
                    student2.DisplayStudentname();
                    System.out.println(student2.percentage());
                    break;
            case 3: Car car = new Car(20);
                    car.displayMileage();
                    break;
            case 4: Train train = new Train("Bengaluru","Simhla");
                    train.displaySourceAndDestination();
                    break;
            case 5: Hotel hotel = new Hotel("alice","chruch street",40,3000);
                    hotel.displayHotelNameAndAddress();
                    break;
            case 6: Hotel hotel2 = new Hotel("alice","chruch street",40,3000);
                    System.out.println("Enter the room number");
                    int roomNumber = input.nextInt();
                    hotel2.setStatus(true, roomNumber);
                    System.out.println("enter your check in date");
                    input.next();
                    String checkIn = input.nextLine();
                    hotel2.setCheckIn(checkIn);
                    System.out.println("Enter your check out date");
                    String checkOut = input.nextLine();
                    hotel2.setCheckOut(checkOut);
                    System.out.println(hotel2.showStatus(roomNumber));
                    break;
            case 7: Student student3 = new Student("Vineeth",85,90,80,"Basic science","MUJ","2019",55);
                    System.out.print("CGPA: ");
                    System.out.println(student3.cgpa());
                    break;
        default: System.out.println("Enter again");

        }
    }
}
