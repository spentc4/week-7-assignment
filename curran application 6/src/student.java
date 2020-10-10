
public class student {
	
	public String firstName;
	public String lastName;
	public String major;
	public String minor;
	public int credits;
	public int studentID;
	public int gradYear;
	
	public student(String firstName, String lastName, String major, String minor, int credits, int studentID, int gradYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
		this.minor = minor;
		this.credits = credits;
		this.studentID = studentID;
		this.gradYear = gradYear;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public String getmajor() {
		return major;
	}
	
	public String getminor() {
		return minor;
	}
	
	public float getcredits() {
		return credits;
	}
	
	public int getstudentID() {
		return studentID;
	}
	
	public int getgradYear() {
		return gradYear;
	}
	
	
}
