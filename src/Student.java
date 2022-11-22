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

                    case 1:
                        System.out.println("Enter the name of student");
                        String sname = input.next();
                        System.out.println("Enter the roll no");
                        int roll = input.nextInt();
                        System.out.println("Enter the admission number");
                        String adm = input.next();
                        System.out.println("Enter college name");
                        String cname = input.next();

                        Students s = new Students(sname,roll,adm,cname);
                        studarr.add(s);
                    break;

                    case 2:
                        System.out.println("Student details :");
                        for(Students st :studarr){
                            System.out.println(st.name);
                            System.out.println(st.rollno);
                            System.out.println(st.addno);
                            System.out.println(st.collname);
                        }
                        break;
                    case 3:
                        System.out.println("Enter student admission number");
                        String admno = input.next();
                        for (Students std : studarr){
                            if(admno.equals( std.addno)){
                                System.out.println("Details of student with "+admno);
                                System.out.println(std.name);
                                System.out.println(std.rollno);
                                System.out.println(std.addno);
                                System.out.println(std.collname);
                                break;
                            }
                            else {
                                System.out.println("Student not found");
                            }

                        }
                        break;
                    case 4:
                        System.out.println("Enter admission number");
                        String adno = input.next();
                        for(Students std : studarr) {
                            if (std.addno.equals(adno)) {
                                studarr.remove(std);
                                break;
                            }
                        }
                    break;
                    case 5:
                        System.exit(0);

                    default:
                        System.out.println("invalid input");



                }




        }




    }
}
