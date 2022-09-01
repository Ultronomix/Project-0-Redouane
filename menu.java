package project0;



import java.util.Scanner;


public class Menu extends Main {
     public String courses ="";

        public Menu(){


        }

        //enroll in course

            public void enroll () {
                // get inside a loop and user hits 0 when done enrolling
                do {
                    System.out.print("Enter name of course to enroll and enter Q anytime to quit: ");
                    Scanner in = new Scanner(System.in);
                    String course = in.nextLine();

                    if (!course.equals("Q")) {
                        courses = courses + "\n" + course;
                        setTuitionBalance(getTuitionBalance() + getCostOfCourse());

                    } else {

                        break;

                    }
                } while (1 != 0);


                System.out.println("You are Enrolled in: " + courses);
                System.out.println("Tuition balance: " + getTuitionBalance() + "$");
            }

            //view balance

            public void viewBalance () {

                System.out.println("Your Balance is: " + getTuitionBalance() + "$");
            }

            //pay tuition
            public void payTuition() {
                viewBalance();
                System.out.println("Enter your payment amount in US $:");
                Scanner in = new Scanner(System.in);
                int payment = in.nextInt();
                setTuitionBalance(getTuitionBalance() - payment);
                System.out.println("Thank you of your payment of: " + payment + "$");
                viewBalance();
                 
            }

            //show status
              public String showStatus(){
                  return "Name: " + getFirstName() + " " + getLastName() + "\n" +
                          "\nGrade level: " + getGradeYear() +
                          "\nStudent ID: " + getStudentId() +
                          "\nCourses Enrolled: " + courses +
                          "\nBalance: " + getTuitionBalance() + "$";
                }


            }





