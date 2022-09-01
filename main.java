package project0;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private static int tuitionBalance;
	private static int costOfCourse = 600;
    private static int id = 1000;

    public static void main(String[] args) throws SQLException{
    	
    	String jdbcURL = "jdbc:postgresql://java-angular-220815.cdb0vm5qrtgl.us-east-2.rds.amazonaws.com:5432/postgres";
		String username="postgres";
		String password="Cold2day!";
		try {
			@SuppressWarnings("unused")
			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
		    System.out.println("Connected to PostgreSQL server");
		    
		   
		    //connection.close();
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error in connecting to PostgreSQL server");
			e.printStackTrace();
			
			 String sql = "CREATE TABLE student (\r\n"
			 		+ "\r\n"
			 		+ "	id PRIMARY KEY,\r\n"
			 		+ "	firstName VARCHAR ( 50 ) NOT NULL,\r\n"
			 		+ "	lastName VARCHAR ( 50 ) NOT NULL,\r\n"
			 		+ "	gradeYear VARCHAR ( 50 ) NOT NULL,\r\n"
			 		+ "    ";
			    
			    Connection connection = null;
				Statement statement = connection.createStatement();
			    int rows = statement.executeUpdate(sql);
			    if (rows > 0) {
			    	System.out.println("A new student profile has been created.");
			    }
			
		}

        // ask how many users we want to add
        System.out.println("Enter number of students to enroll: ");
        try {
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Menu[] students = new Student[numOfStudents];
        
        

        // create n number of new students
        for (int n = 0; n < numOfStudents; n++){

            students[n] = new Student();

            students[n].enroll(); // calling enroll method
            students[n].payTuition();
            //Email.randomPassword(int length);(Students Email is not implemented)
            System.out.println(students[n].showStatus());
        }
        }
       
        catch(InputMismatchException e1){
        	
        	System.out.println("please entre a number and try again!");
        	
        }
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Menu[] students = new Student[numOfStudents];
        
        

        // create n number of new students
        for (int n = 0; n < numOfStudents; n++){

            students[n] = new Student();

            students[n].enroll(); // calling enroll method
            students[n].payTuition();
            //Email.randomPassword(integer length) students Email implementation (coming soon);
            System.out.println(students[n].showStatus());
        
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

	public static int getTuitionBalance() {
		return tuitionBalance;
	}

	public static void setTuitionBalance(int tuitionBalance) {
		Main.tuitionBalance = tuitionBalance;
	}

	public static int getCostOfCourse() {
		return costOfCourse;
	}

	public static void setCostOfCourse(int costOfCourse) {
		Main.costOfCourse = costOfCourse;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Main.id = id;
	} 
}
