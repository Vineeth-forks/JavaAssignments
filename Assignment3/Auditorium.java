class Auditorium {
    private char seats[][] = new char[10][10];
    private String movie;

    Auditorium(String movie) {
        this.movie = movie;
        for(int i=0;i<10;i++) {
            for(int j=0;j<10;j++)
                seats[i][j] = '_'; 
        }
    }

    String getMovie() {
        return movie;
    }

    boolean setSeats(int row,int column) {
        if(seats[row][column]=='_') {
            seats[row][column] = 'O';
            return true;
        }
        else {
            return false;
        }
    }

    void display() {
        for(char i[]:seats) {
            for(char j:i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
