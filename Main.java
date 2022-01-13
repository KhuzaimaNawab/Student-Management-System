import java.util.Scanner;
    public class Main {


        public void Menu(){

            System.out.println("\t\t\t\t _______    ______  ");
            System.out.println("\t\t\t\t|          |      |  |      |   ______   ______  |         ");
            System.out.println("\t\t\t\t|_______   |         |______|  |      | |      | |         ");
            System.out.println("\t\t\t\t        |  |         |      |  |      | |      | |         ");
            System.out.println("\t\t\t\t________|  |______|  |      |  |______| |______| |______|  ");
            System.out.println("\t\t\t\t|\\  /|  _____         _____   ____   ");
            System.out.println("\t\t\t\t| \\/ | |     | |\\  | |     | |    |  |\\  /| ____ |\\  | _____");
            System.out.println("\t\t\t\t|    | |_____| | \\ | |_____| |    __ | \\/ ||____ | \\ |   |");
            System.out.println("\t\t\t\t|    | |     | |  \\| |     | |____|| |    ||____ |  \\|   |");
            System.out.println("\t\t\t\t\t\t_________________________");
            System.out.println("\t\t\t\t\t\t1)LOGIN                 ");
            System.out.println("\t\t\t\t\t\t2)EXIT                  ");
            System.out.println("\t\t\t\t\t\t_________________________");

        }
        public void LoginOption()
        {

            System.out.println("\t\t\t\t\t ________________________");
            System.out.println("\t\t\t\t\t|1)Admission Form        |");
            System.out.println("\t\t\t\t\t|2)Enroll Student         |");
            System.out.println("\t\t\t\t\t|3)Set Student Grade     |");
            System.out.println("\t\t\t\t\t|4)Student Challan       |");
            System.out.println("\t\t\t\t\t|5)Faculty Information   |");
            System.out.println("\t\t\t\t\t|6)Exit                  |");
            System.out.println("\t\t\t\t\t|________________________|");
        }
        public void out()
        {
            System.out.println("\n*****************************************");
            System.out.println("$ Thank You For Using my Software :) ");
            System.out.println("*****************************************");
            System.out.println("\t\t by Usman & Khuzaima\n");
            System.exit(0);
        }
        public static void main(String[] args) {
            Main main = new Main();

            int Choice;
            int value;

            Scanner sc = new Scanner(System.in);
            main.Menu();
            int l = 0;
            while (l < 2) {
                System.out.print("\t\t\t\t\t\tPress Any One : ");
                int choice_login;
                choice_login = sc.nextInt();
                switch (choice_login) {
                    case 1:
                        Login login = new Login();
                    {

                        final String Email = "usman.edu.pk";
                        final String Password = "pas123";

                        System.out.print("\t\t\tEmail: ");
                        String email = sc.next();
                        System.out.print("\t\t\tPassword: ");
                        String pass = sc.next();
                        boolean bolLogin = false;
                        do {
                            if (email.equals(Email) && pass.equals(Password)) {
                                System.out.println("Successfully Login");
                                System.out.println("Press any Key to continue.....");
                                bolLogin = true;
                                try {
                                    System.in.read();
                                } catch (Exception e) {
                                    System.out.println(e);
                                }
                            } else {
                                System.out.println("Wrong Credential");
                                System.exit(0);
                            }
                        } while (bolLogin == false);


                      int i = 0;
                      while (i < 6) {
                          main.LoginOption();
                          System.out.print("\t\t\t\t\tSelect Any One : ");
                          value = sc.nextInt();
                          switch (value) {
                              case 1:
                                  Admission admission = new Admission();
                                  admission.admissionForm();
                                  admission.Display();
                                  System.out.print("\nPress Enter to Continue...\n");
                                  sc.nextLine();
                                  break;
                              case 2:
                                  System.out.print("\t\tHow many Student do you want to enroll : ");
                                  int numOfStudent = sc.nextInt();
                                  Student[] student = new Student[numOfStudent];

                                  for (int j = 0; j < numOfStudent; j++) {
                                      Student student1 = new Student();
                                      student1.enroll();
                                      student1.setStudentID();
                                      student1.payTution();
                                      student1.viewBalance();
                                      student1.display();
                                      System.out.print("\nPress Enter to Continue...\n");
                                      sc.nextLine();
                                  }
                                  break;
                              case 3:
                                  System.out.print("\t\tHow many Student do you want to Update the Grade : ");
                                  int num = sc.nextInt();
                                  Student[] st1 = new Student[num];

                                  for (int k = 0; k < num; k++) {
                                      Student st = new Student();
                                      st.setGrade();
                                      st.setStudentID();
                                      st.display2();
                                      System.out.print("\nPress Enter to Continue...\n");
                                      sc.nextLine();



                                  }
                                  break;
                                      case 4:
                                       FeeChallan challan=new FeeChallan();
                                       challan.FeeChallan();
                                          System.out.print("\nPress Enter to Continue...\n");
                                          sc.nextLine();

                                       break;
                              case 5:
                                  System.out.print("\t\tHow many Faculty do you want to enroll: ");
                                  int Faculty = sc.nextInt();
                                  Faculty[] faculty = new Faculty[Faculty];

                                  for(int n=0; n<Faculty;n++)
                                  {

                                      Faculty faculty1= new Faculty();
                                      faculty1.BonusSalary();
                                      faculty1.display();
                                      System.out.print("\nPress Enter to Continue...\n");
                                      sc.nextLine();

                                      break;
                                  }
                              case 6:
                                  main.out();
                                  System.out.print("\nPress Enter to Continue...\n");
                                  sc.nextLine();
                                  break;

                              default:
                                  System.out.println("\t\t\t\tWrong Input");
                                  break;
                          }
                      }
                    }
                  case 2:
                      main.out();
                      System.out.print("\nPress Enter to Continue...\n");
                      sc.nextLine();
                      main.Menu();
                      break;

                  default:
                      System.out.println("Wrong Output");
                      break;
                }

            }
        }
    }


