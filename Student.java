import java.util.Scanner;

public class Student implements Display {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int id=1;
    private static String studentID;
    private String courses;
    private int costOfCourse = 1000;
    private int tutionBalance;
    private char grade;
    private int feesPaid=0;

    public Student()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t__________________________________________");
        System.out.print("\t\t\t\tEnter Student First Name : ");
        this.firstName = sc.nextLine();

        System.out.print("\t\t\t\tEnter Student Last Name :");
        this.lastName = sc.nextLine();
        System.out.println("\t\t\t\t__________________________________________");

        System.out.println("\t\t\t\t******************************************");
        System.out.print("\t\t\t\tEnter your Class Level \n\t\t\t\t1)Class 9 \n\t\t\t\t2)Class 10 " );
        this.gradeYear = sc.nextInt();
        System.out.println("\t\t\t\t******************************************");

        setStudentID();

    }
    public void setStudentID()
    {

        this.studentID = "UPS-"+id;
        id++;

    }
    public void enroll()
    {
        Scanner sc = new Scanner(System.in);
            System.out.println("\t\t\t\t__________________________________________");
            System.out.println("\t\t\t\tYou Can Choose Only One");
            System.out.println("\t\t\t\t1 - Biology");
            System.out.println("\t\t\t\t2 - Computer Science");
            System.out.println("\t\t\t\t3 - Commerce");
            System.out.println("\t\t\t\t4 - To Quit ");
            System.out.print("\t\t\t\tSelect any One : ");
            String choice = sc.nextLine();
            System.out.println("\t\t\t\t__________________________________________");
            if((choice.equals("Biology"))||(choice.equals("Computer Science"))||(choice.equals("Commerce"))){
                courses = choice;
                this.tutionBalance=costOfCourse;
            }


    }
    public void viewBalance()
    {
        System.out.println("\t\t\t\tYour Balance is Rs: " + tutionBalance);
    }
    public void payTution() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t__________________________________________");
        viewBalance();
        System.out.print("\t\t\t\tEnter your payment RS: ");
        int payment = sc.nextInt();
        tutionBalance = tutionBalance - payment;
        System.out.println("\t\t\t\tThank you for purchasing the course of RS: " + payment);
        viewBalance();
        System.out.println("\t\t\t\t__________________________________________");
    }

    public void setGrade()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t__________________________________________");
        System.out.print("\t\t\t\tEnter your Percentage: ");
        int percentage = sc.nextInt();
        System.out.println("\t\t\t\t__________________________________________");
        if(percentage > 100)
        {
            System.out.println("Wrong Input");
        }
        else if(percentage >=90 && percentage <= 100)
        {
            this.grade = 'A';
        }
        else if(percentage >=80 && percentage <= 89)
        {
            this.grade = 'B';
        }
        else if(percentage >=70 && percentage <= 79)
        {
            this.grade = 'C';
        }
        else if(percentage >=60 && percentage <= 69) {
            this.grade = 'D';
        }
        else
            this.grade = 'F';
    }
    public void feesUpdate(int fees)
    {
        feesPaid = fees + feesPaid;
    }
    public void display(){
        System.out.println("\t\t\t\t--------------------------------------");
        System.out.println("\t\t\t\t  ID :"+studentID);
        System.out.println("\t\t\t\t  First Name: "+firstName);
        System.out.println("\t\t\t\t  Last Name: "+lastName);
        System.out.println("\t\t\t\t  Class Level: "+gradeYear);
        System.out.println("\t\t\t\t  Courses : "+courses);
        System.out.println("\t\t\t\t  Your Remaining Fees :"+tutionBalance);
        System.out.println("\t\t\t\t__________________________________________");

    }
    public void display2(){
        System.out.println("\t\t\t\t--------------------------------------");
        System.out.println("\t\t\t\t  ID :"+studentID);
        System.out.println("\t\t\t\t  First Name: "+firstName);
        System.out.println("\t\t\t\t  Last Name: "+lastName);
        System.out.println("\t\t\t\t  Grade : "+grade);
        System.out.println("\t\t\t\t__________________________________________");
    }
}
