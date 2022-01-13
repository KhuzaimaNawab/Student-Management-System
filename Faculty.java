import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Faculty implements Display {
    private String name, email, contactNumber, posType;
    private static int id=1;
    private static String FacultyID;
    private int Salary=50000;
    private int loopChoice;

    Scanner sc = new Scanner(System.in);
    public Faculty() {
        do{
        System.out.println("===============================================");
        System.out.println("\n\n\t\t\tPress 1 : To Add an Faculty Details");
        System.out.println("\t\t\tPress 2 : To See an Faculty Details ");
        System.out.println("\t\t\tPress 3 : To Remove an Faculty");
        System.out.println("\t\t\tPress 4 : To Exit the  Portal");
        System.out.println("===============================================");

        System.out.print("\t\t\tPlease Enter the Choice");
        int choice = sc.nextInt();
        this.loopChoice = choice;
            switch (choice) {
                case 1:
                    FacultyAdd();
                    break;
                case 2:
                    System.out.println("Enter your ID: ");
                    String id = sc.nextLine();
                    viewFile(id);
                    break;
                case 3:
                    System.out.println("Enter your ID: ");
                    String id2 = sc.nextLine();
                    removeFile(id2);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the number correctly");

            }
        }while (loopChoice != 4);
    }

    public void facultyDetail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("______________________________________________");
        System.out.print("\n\n\t\t\tEnter you Name: ");
        this.name = sc.nextLine();
        System.out.print("\t\t\tEnter your Email: ");
        this.email = sc.nextLine();
        System.out.print("\t\t\tEnter Contact Number: ");
        this.contactNumber = sc.nextLine();
        System.out.println("\t\t\tEnter your Desire Position: ");
        System.out.println("\t\t\t1 - Teacher");
        System.out.print("\t\t\t2 - Non Teaching");
        int choice = sc.nextInt();
        if (choice == 1) {
            this.posType = "TS";
        } else if (choice == 2) {
            this.posType = "NTS";
        }
        setFacultyID();
        System.out.println("______________________________________________");
    }

    private void setFacultyID() {

        FacultyID = posType + "" + id++;
    }

    public static String getFacultyID() {
        return FacultyID;
    }

    public void FacultyAdd() {
        Scanner sc = new Scanner(System.in);
        facultyDetail();
        File file = new File("File" + FacultyID + ".txt");
        try {
            if (file.createNewFile()) {
                FileWriter fileWriter = new FileWriter("File" + FacultyID + ".txt");
                fileWriter.write("Faculty ID:" + FacultyID + "\n" + "Faculty Name:" + name + "\n" +
                        "Faculty Contact  :" + this.contactNumber + "\n" +
                        "Faculty Information :" + this.email + "\n");
                fileWriter.close();
                System.out.println("\t\t\tFaculty information has been Stored\n");
                System.out.println("\t\t\tPress Enter Key to continue.....");
                sc.nextLine();
            } else {
                System.out.println("\n\t\t\tFaculty already exists.");
                System.out.print("\n\t\t\tPress Enter to Continue...");
                sc.nextLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void viewFile(String id) {
        File file = new File("File" + id + ".txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (Exception e) {
            System.out.println("\t\t\tFile Corrupt or Missing");
        }
    }

    public void removeFile(String ID) {

        File file = new File("file" + ID + ".txt");
        if (file.exists()) {
            if (file.delete()) ;
            {
                System.out.println("\n\t\t\tFaculty has been removed Successfully");
            }
        } else {
            System.out.println("\n\t\t\tFaculty does not exists :( ");
        }
    }

    public void BonusSalary() {
        System.out.println("\t\t\tIf you want to Bounus");
        System.out.print("Enter the years ");
        int Years=sc.nextInt();
        if (Years > 5)
            Salary += Salary;
    }


    public void display()
    {
        System.out.println("\n\t\t\t\t---------------------------------------------");
        System.out.println("\t\t\t\tName :"+name);
        System.out.println("\t\t\t\tName :"+email);
        System.out.println("\t\t\t\tName :"+contactNumber);
        System.out.println("\t\t\t\tName :"+getFacultyID());
        System.out.println("\t\t\t\tSalary :"+Salary);
        System.out.println("\n\t\t\t\t---------------------------------------------");
    }
}

