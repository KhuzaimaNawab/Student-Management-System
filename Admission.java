import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Admission{
    private String name,fatherName,contactNo,address,gender,Class;
    private int age;
    private static int count=0;

    public void admissionForm() {
        Scanner sc = new Scanner(System.in);


        System.out.println("\t\tRequirement Of Admission Form ");
        System.out.println("\t\t=============================");
        System.out.print("\t\tEnter Your Name : ");
        name= sc.nextLine();
        System.out.print("\t\tEnter Your Father Name : ");
        fatherName= sc.nextLine();
        System.out.print("\t\tEnter Your Contact No : ");
        contactNo= sc.nextLine();
        System.out.print("\t\tEnter Your Address : ");
        address= sc.nextLine();
        System.out.print("\t\tEnter Your Age : ");
        age= sc.nextInt();
        System.out.print("\t\tEnter Your Gender : ");
        gender= sc.next();
        System.out.print("\t\tIn Which Class You Want Admission : ");
        Class= sc.next();
        try {
            File file = new File("Admission Form" + count);
            FileWriter fileWriter = new FileWriter("Admission Form" + count);
            file.createNewFile();
            fileWriter.write("Name: " + name + "\n" + "Father Name: " + fatherName + "\n" + "Contact No: " + "\n" + "Age: " + age + "\n" + "Address: " + address + "\n" + "Class: " + Class + "\n" + "Gender: " + gender);
            fileWriter.close();
            this.count++;
        }catch (Exception e)
        {
            System.out.println("Missing or Corrupt File");
        }
    }

    public void Display()
    {
        System.out.println("\t\t\t\t\tYour Form");
        System.out.println("\t\t\t\t\t---------");
        System.out.println("\t\t\t===================================");
        System.out.println("\t\t\tName : "+name);
        System.out.println("\t\t\tFather Name : "+fatherName);
        System.out.println("\t\t\tContact No : "+contactNo);
        System.out.println("\t\t\tAge : "+age);
        System.out.println("\t\t\tAddress : "+address);
        System.out.println("\t\t\tClass : "+Class);
        System.out.println("\t\t\tGender : "+gender);
        System.out.println("\t\t\t===================================");

    }
}


