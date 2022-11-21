import java.util.ArrayList;
import java.util.Scanner;

class Students {
    String name;
    int rollno;
    String addno;
    String collname;

    public Students(String name, int rollno, String addno, String collname) {
        this.name = name;
        this.rollno = rollno;
        this.addno = addno;
        this.collname = collname;
    }
}

public class Student {
    public static void main(String[] args) {
        ArrayList<Students> studarr = new ArrayList<Students>();

        while (true){

            System.out.println("Select an option \n 1 - Add Student  \n 2 - View Student \n 3 - Search student\n 4 - Delete student \n 5 - Exit");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();

                switch(n) {

                }




        }




    }
}
