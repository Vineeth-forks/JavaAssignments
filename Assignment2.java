import java.util.Scanner;

class Assignment2 {
    static Scanner input = new Scanner(System.in);

    // Used to take input of a 1D array
    public static int[] arrayInput(int n) {
        System.out.println("Enter the elements");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" element");
            arr[i] = input.nextInt();
        }
        return arr;
    
    }
    // Used to take input of a 2D array
    public static int[][] array2Input(int n, int m) {
        System.out.println("Enter the elements");
        int[][] arr = new int[n][m];
        for(int i = 0;i<n;i++) {
            System.out.println("Enter the "+(i+1)+" row elements");
            for(int j = 0;j<m;j++) {
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }
    // Used to display contents of an 1D array
    public static void arrayOutput(int[] arr,int n) {
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
    }
    // Used to display contents of an 2D array
    public static void array2Output(int[][] arr,int n, int m) {
        for(int i = 0;i<n;i++) {
            for(int j = 0;j<m;j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }

    // 1. WAP to create an array of size 10 and also take input from the user
    public static void question1() {
        int[] arr = new int[10];
        arr = arrayInput(10);
        System.out.println("The contents of the array are");
        arrayOutput(arr, 10);
    }

    // 2. WAP to create an array of size 10 and find the sum of element of array
    // I altered the question and made it general instead of initializing at the time of declaration. Excuse me for this
    public static void question2() {
        int[] arr = new int[10];
        arr = arrayInput(10);
        int sum = 0;
        for(int i = 0;i<10;i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of the elements is "+sum);
    }

    // 3. WAP to create two arrays of same size and find the element wise addition of two arrays and store it in a third array
    public static void question3() {
        System.out.println("Enter the size of both the arrays");
        int n = input.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];
        System.out.println("Enter the elements for the first array");
        arr1 = arrayInput(n);
        System.out.println("Enter the elements for the second array");
        arr2 = arrayInput(n);
        for(int i = 0;i<n;i++) {
            arr3[i] = arr1[i] + arr2[i];
        }
        System.out.println("The contents of the 3rd array are");
        arrayOutput(arr3, n);
    }

    // 4. WAP to reverse elements of array without creating any temporary array
    public static void question4() {
        System.out.println("Enter the size of the array");
        int n = input.nextInt();
        int[] arr = new int[n];
        arr = arrayInput(n);
        int i = 0;
        while((i!=(arr.length-(i+1)))&&((arr.length-(i+1))-i != 1)) {
            arr[i] = arr[i] + arr[arr.length-(i+1)];
            arr[arr.length-(i+1)] = arr[i] - arr[arr.length-(i+1)];
            arr[i] = arr[i] - arr[arr.length-(i+1)];
            i++;
        }
        System.out.println("The reversed array");
        arrayOutput(arr, n);
    }

    // 5. WAP to find the matrix multiplication of two arrays
    public static void question5() {
        System.out.println("Enter the number of rows and columns of first matrix");
        int row1 = input.nextInt();
        int column1 = input.nextInt();
        System.out.println("Enter the first matrix");
        int[][] arr1 = new int[row1][column1];
        arr1 = array2Input(row1, column1);
        System.out.println("Enter the number of rows and columns of second matrix");
        int row2 = input.nextInt();
        int column2 = input.nextInt();
        System.out.println("Enter the second matrix");
        int[][] arr2 = new int[row2][column2];
        arr2 = array2Input(row2, column2);
        int[][] arr3 = new int[row1][column2];
        int sum = 0;
        if(column1!=row2) {
            System.out.println("The matrix cant be multiplied");
        }else {
            for(int i = 0;i<row1;i++) {
                for(int j = 0;j<column2;j++) {
                    for(int k = 0;k<row2;k++) {
                        sum = sum + arr1[i][k]*arr2[k][j];
                    }
                    arr3[i][j] = sum;
                    sum = 0;
                }
            }
            System.out.println("The multiplies matrice is");
            array2Output(arr3, row1, column2);
        }
    }

    // 6. WAP to store the status of a room in a hotel. Status can be either filled or vacant. Hotel contains 10 floor and each floor can have different no of room...
    public static void question6() {
        int[][] floorRoom = new int[10][];
        for(int i = 0;i<10;i++) {
            System.out.println("Enter the number of rooms in floor "+(i+1));
            int rooms = input.nextInt();
            floorRoom[i] = new int[rooms];
        }
        while(true) {
            System.out.println("Press 1 to make an entry");
            System.out.println("Press 0 to exit");
            int choice = input.nextInt();
            if(choice==1) {
                System.out.println("Enter the floor and room number which is filled");
                int floor = input.nextInt() - 1;
                int room = input.nextInt() - 1;
                if(floor<floorRoom.length) {
                    if(room<floorRoom[floor].length) {
                        floorRoom[floor][room] = 1;
                        System.out.println("Entry successful");
                    }else {
                        System.out.println("The room number doesnt exist");
                    }
                }else {
                    System.out.println("The floor doesnt exist");
                }
            }else if(choice==0) {
                break;
            }else {
                System.out.println("Invalid Choice");
            }
        }
        int numOfRooms = 0;
        int filled = 0;
        for(int i = 0;i<floorRoom.length;i++) {
            for(int j = 0;j<floorRoom[i].length;j++) {
                numOfRooms++;
                if(floorRoom[i][j]==1) {
                    filled++;
                }
            }
        }
        System.out.println("Total number of rooms = "+numOfRooms);
        System.out.println("Number of rooms filled = "+filled);
        System.out.println("Vacant rooms = "+(numOfRooms-filled));
    }

    // 7. WAP to find maximum and minimum value in an array
    public static void question7() {
        System.out.println("Enter the number of elements");
        int n = input.nextInt();
        int[] arr = new int[n];
        arr = arrayInput(n);
        int max = arr[0];
        int min = arr[0];
        for(int i = 0;i<n;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Highest number "+max);
        System.out.println("Lowest number "+min);
    }

    // 8. WAP to sort an array in ascending order
    public static void question8() {
        System.out.println("Enter the number of elements");
        int n = input.nextInt();
        int[] arr = new int[n];
        arr = arrayInput(n);
        for(int i = 0;i<n;i++) {
            for(int j = i+1;j<n;j++) {
                if(arr[i]>arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        System.out.println("The sort array is");
        arrayOutput(arr, n);
    }

    // 9. WAP to search an element in an array
    public static void question9() {
        System.out.println("Enter the number of elements");
        int n = input.nextInt();
        int[] arr = new int[n];
        arr = arrayInput(n);
        System.out.println("Enter the element to be searched");
        int ele = input.nextInt();
        boolean result = false;
        for(int i = 0;i<n;i++) {
            if(arr[i]==ele){
                result = true;
                break;
            }
        }
        if(result) {
            System.out.println("Element found");
        }else {
            System.out.println("Element not found");
        }
    }

    // 10. WAP to create a single array to store the information of passenger travelling in a bus.
    public static void question10() {
        System.out.println("no. of seats in the bus:");
        int seat = input.nextInt();
        String stats[][] = new String[seat][3];
        for(int i = 0; i < seat; i++)
        {
            System.out.println("Enter \"F\" if seat " + (i+1) + " is filled or Enter \"V\" if seat is vacant: ");
            stats[i][0] = input.next();
            input.nextLine();
            if(stats[i][0].indexOf("F") >= 0)
            {
                System.out.print("Enter the name of the passenger: ");
                stats[i][1] = input.nextLine(); 
                System.out.print("Enter the Destination: ");
                stats[i][2] = input.next();
            }
            else
            {
                System.out.println("Seat " + (i+1) + " is vacant:");
                continue;
            }
        }
         System.out.println("Passenger information:");
        for(int i = 0; i < stats.length; i++)
        {
            
            for(int j = 0; j < 3; j++)
            {
                System.out.print(stats[i][j] + " ");  
            }
            System.out.println();
        }
    }

    // 11. WAP to find duplicate value in an array
     public static void question11() {
        System.out.println("Enter the number of elements");
        int n = input.nextInt();
        int[] arr = new int[n];
        arr = arrayInput(n);
        boolean result = false;
        for(int i = 0;i<n;i++) {
            for(int j = i+1;j<n;j++) {
                if(arr[i]==arr[j]) {
                   result = true;
                   System.out.println(arr[j]+" is the duplicate element in position "+(j+1));
                }
                
            }
        }
        if(!result) {
            System.out.println("No duplicate elements found");
        }
     }

    // 12. Snake game
    public static void question12() {
        System.out.println("Personalise your settings for the game");
        System.out.println("Enter the number of rows");
        int row = input.nextInt();
        System.out.println("Enter the number of columns");
        int column = input.nextInt();
        int[][] layer1 = new int[row][column];
        int[][] layer2 = new int[row][column];
        int boxes = row*column;
        int winner;
        int count = 0;
        while(true) {
            System.out.println("Enter the choice below");
            System.out.println("Press 1 to enter the location of the snake and its penalty");
            System.out.println("Press 2 to enter the location of the ladder and its penalty");
            System.out.println("Press 3 to exit the game personalisation and start the game");
            int choice = input.nextInt();
            if(choice==1) {
                System.out.println("Enter the location of the snake based on its row and column");
                int row1 = input.nextInt() - 1;
                int column1 = input.nextInt() - 1;
                if((layer1[row1][column1]!=2)&&(layer1[row1][column1]!=1)&&(row1<=row)&&(column1<=column)) {
                    layer1[row1][column1] = 1;
                    System.out.println("Enter the penalty for the given location");
                    int penalty = input.nextInt();
                    layer2[row1][column1] = penalty;
                }else {
                    System.out.println("This location has already been alloted to a snake or ladder or the location doesnt exist");
                    System.out.println("Try another location");
                }
            }else if(choice==2) {
                System.out.println("Enter the location of the ladder based on its row and column");
                int row1 = input.nextInt() - 1;
                int column1 = input.nextInt() - 1;
                if((layer1[row1][column1]!=2)&&(layer1[row1][column1]!=1)&&(row1<=row)&&(column1<=column)) {
                    layer1[row1][column1] = 2;
                    System.out.println("Enter the reward for the given location");
                    int reward = input.nextInt();
                    layer2[row1][column1] = reward;
                }else {
                    System.out.println("This location has already been alloted to a snake or ladder or the location doesnt exist");
                    System.out.println("Try another location");
                }
            }else if(choice==3) {
                System.out.println("Enjoy your game");
                break;
            }else {
                System.out.println("Invalid choice");
                System.out.println("Try again");
            }
        }
        int[] player = new int[4];
        outerloop:
        while(true) {
            for(int i = 0;i<4;i++) {
                System.out.println("PLAYER "+(i+1)+" TURN");
                System.out.println("Rolling dice");
                int number = (int)(Math.random()*6) + 1;
                if(player[i]>=boxes) {
                    winner = i+1;
                    break outerloop;
                }else {
                    player[i] = player[i] + number;
                }
                innerloop:
                for(int k = 0;k<row;k++) {
                    for(int j =0;j<column;j++) {
                        count++;
                        if(count==player[i]) {
                            if(layer1[k][j]==1) {
                                if(player[i]>=layer2[k][j]) {
                                    player[i] = player[i] - layer2[k][j];
                                }else {
                                    player[i] = 0;
                                }
                            }else if(layer1[k][j]==2) {
                                player[i] = player[i] + layer2[k][j];
                            }else{}
                            break innerloop;
                        }
                    }
                }
                count = 0;
            }
        }
        System.out.println("PLAYER "+winner+" WINS!!");
    }

    public static void main(String[] args) {
        // question4();
        // question5();
        // question6();
        // question8();
        // question11();
        // question10();
        question12();
    }
}