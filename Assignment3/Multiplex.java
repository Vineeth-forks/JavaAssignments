import java.util.Scanner;
public class Multiplex {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Auditorium a[] = new Auditorium[3];
        a[0] = new Auditorium("MainLand");
        a[1] = new Auditorium("Crazy cone");
        a[2] = new Auditorium("lava done");

        System.out.println("Movies playing now: ");
        for(int i=0;i<3;i++) {
            System.out.println("Auditorium " + (i+1) + ": " + a[i].getMovie());
        }
        
        boolean esc=false;
        do {
            System.out.print("Choice: ");
            int ch = s.nextInt();
            if(ch>=1 && ch<=3) {
                System.out.print("Enter number of seats: ");
                int nos = s.nextInt();
                a[ch-1].display();
                for(int i=0;i<nos;i++) {
                    System.out.print("Enter position of seat" + (i+1) + ": ");
                    int row,column;
                    row = s.nextInt();
                    column = s.nextInt();
                    if(!a[ch-1].setSeats(row, column)) {
                        System.out.println("Seat Booked!!");
                        i--;
                    }
                    a[ch-1].display();
                }
                esc=true;
            }
            else {
                System.out.println("Wrong Choice!!!!!");
            }
        }while(!esc);
    }
}
