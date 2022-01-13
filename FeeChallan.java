import java.time.LocalDate;
import java.util.Scanner;
public class FeeChallan {
    private int AdmissionFees=10000;
    private int PrimaryFees=3000;
    private int SecondaryFees=3500;
    private int Upper_SecondaryFees=4500;
    String name;
    String father;
    int Class;
    char section;
    private int ID=123;

    int choice;
    Scanner sc=new Scanner(System.in);
    public void Fee_Challan_display()
    {
        System.out.println("\n\n\t\t\t\t  USMAN PUBLIC SCHOOL");
        System.out.println("\t\t\t\t========================");
        System.out.println("\t\t______________________________________");
        System.out.print("\t\t Enter a Student Name : ");
        name=sc.nextLine();
        System.out.print("\t\t Enter a Father Name : ");
        father=sc.nextLine();
        System.out.print("\t\t Enter a Class : ");
        Class=sc.nextInt();
        System.out.print("\t\t Enter a Section : ");
        section=sc.next().charAt(0);
        System.out.println("\t\t______________________________________");
        System.out.println("\n\n\t\t\t\t\t\t  FEE CHALLAN");
        System.out.println("\t\t\t\t\t\tUsman Public School");
        System.out.println("\t\t\t\t=================================");
        ID++;
        System.out.print("\t\t\t\t|Deposit Slip No :  0"+ID+"\t\t\t|");

        System.out.print("\n\t\t\t\t|Name : " + name+"\t\t\t\t\t|");

        System.out.print("\n\t\t\t\t|Father Name : " + father+"\t\t\t|");
;
        System.out.print("\n\t\t\t\t|Class " + Class+"\t\t\t\t\t\t|");

        System.out.println("\n\t\t\t\t|Section " + section+"\t\t\t\t\t\t|");

        System.out.println("\t\t\t\t=================================");
    }
    public void FeeChallan(){
        System.out.println("\t\t\t\t------------------------------------------");
        System.out.println("\t\t\t\t1 )MONTHLY FEE CHALLAN");
        System.out.println("\t\t\t\t2 )ADMISSION FESS CHALLAN");
        System.out.print("\t\t\t\tPress 1 or 2  ");
        choice=Integer.parseInt(sc.nextLine());
        System.out.println("\t\t\t\t------------------------------------------");

        Fee_Challan_display();
        System.out.println("\t\t\t\t---------------------------------");
        switch (choice) {
            case 1:
            {
                if (Class == 1 || Class == 2 || Class == 3 || Class == 4 || Class == 5) {
                    System.out.println("\t\t\t\tFees " +PrimaryFees);
                    System.out.println("\t\t\t\tTotal Fees "+PrimaryFees);
                } else if (Class == 8 || Class == 6 || Class == 7) {
                    System.out.println("\t\t\t\tFees " + SecondaryFees);
                    System.out.println("\t\t\t\tTotal Fees " + SecondaryFees);
                } else if (Class == 9 || Class == 10) {
                    System.out.println("\t\t\t\tFees " + Upper_SecondaryFees);
                    System.out.println("\t\t\t\tTotal Fees" + SecondaryFees);
                }
            }
            System.out.println("\t\t\t\t---------------------------------");
             Date();
            break;
            case 2:
            {
                if (Class == 1 || Class == 2 || Class == 3 || Class == 4 || Class == 5) {
                    System.out.println("\t\t\t\tFees " + PrimaryFees );
                    System.out.println("\t\t\t\tAdmission Fees " +AdmissionFees );
                    System.out.println("\t\t\t\tTotal Fees " + (PrimaryFees+AdmissionFees));
                } else if (Class == 8 || Class == 6 || Class == 7) {
                    System.out.println("\t\t\t\tFees " +SecondaryFees );
                    System.out.println("\t\t\t\tAdmission Fees " +AdmissionFees );
                    System.out.println("\t\t\t\tTotal Fees " + (SecondaryFees+AdmissionFees));
                } else if (Class == 9 || Class == 10) {
                    System.out.println("\t\t\t\tFees " +Upper_SecondaryFees);
                    System.out.println("\t\t\t\tAdmission Fees " +AdmissionFees );
                    System.out.println("\t\t\t\tTotal Fees " + (Upper_SecondaryFees+AdmissionFees));
                }
            }
            System.out.println("\t\t\t\t---------------------------------");
            Date();
            break;
            default:
                System.out.println("Wrong Output");
                break;
        }
    }
    public void Date(){
    LocalDate currentDate1 =  LocalDate.now();
        System.out.println("\t\t\t\t---------------------------------");
        System.out.println("\t\t\t\tIssue Date : "+LocalDate.now());
    LocalDate currentDatePlus1 = currentDate1.plusDays(7);
        System.out.println("\t\t\t\tValid Date : "+currentDatePlus1);
        System.out.println("\t\t\t\t---------------------------------");
}}
