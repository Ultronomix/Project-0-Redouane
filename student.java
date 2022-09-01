package project0;



import java.util.Scanner;

public class Student extends Menu {

    
	
    private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	public Student() {



        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: "); //ask user for firstName
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: "); // ask user for lastName
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: "); //ask user for graduation year
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println("Name: " + firstName + " " + lastName + "\n" + "Level: "+ gradeYear + "\n" + "Student id: " + studentId);
        	
        switch(this.gradeYear) {
        
        case 1:
        	System.out.println("Write your own story with passion and determination. Success will find its way to you!");
        	break;
        	
        case 2:
        	System.out.println("Your hard work is bound to result in prosperity and fortune. Good luck for a successful life ahead!");
        	break;
        	
        case 3:
        	System.out.println("Study like there’s no tomorrow because if you keep putting off your studies for tomorrow, you’ll probably be too late");
        	break;
        	
        case 4:
        	System.out.println("Time can be your best friend and your worst enemy depending on whether you use it or waste it.");
        	break;
        	default:
        		System.out.println("Please enter your student class level");
        		
        	
        
        	
        }

    }
    public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getGradeYear() {
		return gradeYear;
	}
	public void setGradeYear(int gradeYear) {
		this.gradeYear = gradeYear;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	// generate an id
    public void setStudentID(){
        // Grade level + ID
        setId(getId() + 1); //increment id by one everytime we add new student
        this.studentId = gradeYear + "" + getId();
    }
    // enroll in courses
    
    
}


    

    // view balance
    // pay tuition
    // show status





