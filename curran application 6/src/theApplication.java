import java.util.*;
import java.io.IOException;
public class theApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<student> roster = new PriorityQueue<student>(6, new studentComparator());
		
		student student1 = new student("Robert","Johnson","Computer Science","cyber security",22,12345,2024);
		roster.add(student1);
		student student2 = new student("Marhsall","McGraw","Restuarant Hospitality","culinary arts",0,13819,2022);
		roster.add(student2);
		student student3 = new student("Jared","Matte","Business Administration","sports management",48,13890,2021);
		roster.add(student3);
		student student4 = new student("David","Lunch","sudoku science","mathmatics",64,94284,2020);
		roster.add(student4);
		student student5 = new student("Mark","Melancon","Communications","biology",12,38571,2023);
		roster.add(student5);
		
		System.out.println("please type the number of the item youd like to choose");
		System.out.println("1. organize the students");
		System.out.println("2. display roster");
		System.out.println("3. add custom student");
		System.out.println("4. remove student by search");
		studentComparator compare = new studentComparator();

		Scanner keyboard = new Scanner(System.in);
		int firstOption = keyboard.nextInt();
		
		switch (firstOption) {
		case 1:
			int temp;
			int p1 = student1.credits;
			int p2 = student2.credits;
			int p3 = student3.credits;
			int p4 = student4.credits;
			int p5 = student5.credits;
			
		for (int number = 0; number < 4; number++) {
			if (p2 < p1) {
				temp = p1;
				p1 = p2;
				p2 = temp;
			}
			if (p3 < p2) {
				temp = p2;
				p2 = p3;
				p3 = temp;
			}
			if (p4 < p3) {
				temp = p3;
				p3 = p4;
				p4 = temp;
			}
			if (p5 < p4) {
				temp = p4;
				p4 = p5;
				p5 = temp;
			}
		}
		System.out.println("This will now sort by credits");
		System.out.println(p1 + " " + p2 + " " + p3 + " " + p4 + " " + p5  + " " + "\n");
		int temp1;
		int q1 = student1.studentID;
		int q2 = student2.studentID;
		int q3 = student3.studentID;
		int q4 = student4.studentID;
		int q5 = student5.studentID;
		
	for (int number = 0; number < 4; number++) {
		if (q2 < q1) {
			temp1 = q1;
			q1 = q2;
			q2 = temp1;
		}
		if (q3 < q2) {
			temp1 = q2;
			q2 = q3;
			q3 = temp1;
		}
		if (q4 < q3) {
			temp1 = q3;
			q3 = q4;
			q4 = temp1;
		}
		if (q5 < q4) {
			temp1 = q4;
			q4 = q5;
			q5 = temp1;
		}
	}
	System.out.println("This will now sort by studentID");
	System.out.println(q1 + " " + q2 + " " + q3 + " " + q4 + " " + q5  + " " + "\n");
	int temp2;
	int r1 = student1.gradYear;
	int r2 = student2.gradYear;
	int r3 = student3.gradYear;
	int r4 = student4.gradYear;
	int r5 = student5.gradYear;
	
	
for (int number = 0; number < 9; number++) {
	if (r2 < r1) {
		temp2 = r1;
		r1 = r2;
		r2 = temp2;
	}
	if (r3 < r2) {
		temp2 = r2;
		r2 = r3;
		r3 = temp2;
	}
	if (r4 < r3) {
		temp2 = r3;
		r3 = r4;
		r4 = temp2;
	}
	if (r5 < r4) {
		temp2 = r4;
		r4 = r5;
		r5 = temp2;
	}
}
System.out.println("This will now sort by graduation year");
System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5  + " " + "\n");
			break;
		case 2:
			System.out.println(student1.firstName.toString()+ " " + student1.lastName.toString()+ " " + student1.major.toString()+ " " + student1.minor.toString()+ " " + student1.credits+ " " + student1.studentID+ " " + student1.gradYear+ "\n");
			System.out.println(student2.firstName.toString()+ " " + student2.lastName.toString()+ " " + student2.major.toString()+ " " + student2.minor.toString()+ " " + student2.credits+ " " + student2.studentID+ " " + student2.gradYear+ "\n");
			System.out.println(student3.firstName.toString()+ " " + student3.lastName.toString()+ " " + student3.major.toString()+ " " + student3.minor.toString()+ " " + student3.credits+ " " + student3.studentID+ " " + student3.gradYear+ "\n");
			System.out.println(student4.firstName.toString()+ " " + student4.lastName.toString()+ " " + student4.major.toString()+ " " + student4.minor.toString()+ " " + student4.credits+ " " + student4.studentID+ " " + student4.gradYear+ "\n");
			System.out.println(student5.firstName.toString()+ " " + student5.lastName.toString()+ " " + student5.major.toString()+ " " + student5.minor.toString()+ " " + student5.credits+ " " + student5.studentID+ " " + student5.gradYear+ "\n");

			break;
		case 3:
		System.out.println("Type out first name");
		Scanner keyboard1 = new Scanner(System.in);
		String studentFirstName = keyboard1.next();
		System.out.println("Type out last name");
		Scanner keyboard2 = new Scanner(System.in);
		String studentLasttName = keyboard2.next();
		System.out.println("Type out major");
		Scanner keyboard3 = new Scanner(System.in);
		String studentMajor = keyboard3.next();
		System.out.println("Type out minor");
		Scanner keyboard4 = new Scanner(System.in);
		String studentMinor = keyboard4.next();
		System.out.println("Type out credits");
		Scanner keyboard5 = new Scanner(System.in);
		int studentCredits = keyboard5.nextInt();
		System.out.println("Type out student ID");
		Scanner keyboard6 = new Scanner(System.in);
		int studentStudentID = keyboard6.nextInt();
		System.out.println("Type out grad year");
		Scanner keyboard7 = new Scanner(System.in);
		int studentGrad = keyboard7.nextInt();
		student student6 = new student(studentFirstName,studentLasttName,studentMajor,studentMinor,studentCredits,studentStudentID,studentGrad);
		roster.add(student6);
		System.out.println(student6.firstName.toString()+ " " + student6.lastName.toString()+ " " + student6.major.toString()+ " " + student6.minor.toString()+ " " + student6.credits+ " " + student6.studentID+ " " + student6.gradYear+ "\n");

			break;
		case 4:
			System.out.println("type the name of the player youd like to remove");
			Scanner playerRem = new Scanner(System.in);
			String removal = playerRem.next();
			if (removal.equals(student1.firstName)) {
				roster.remove(student1);
				System.out.println("student1 was removed");
			}
			if (removal.equals(student2.firstName)) {
				roster.remove(student2);
				System.out.println("student2 was removed");
			}
			if (removal.equals(student3.firstName)) {
				roster.remove(student3);
				System.out.println("student3 was removed");
			}
			if (removal.equals(student4.firstName)) {
				roster.remove(student4);
				System.out.println("student4 was removed");
			}
			if (removal.equals(student5.firstName)) {
				roster.remove(student5);
				System.out.println("student5 was removed");
			}
			break;
		}
		
		
		PriorityQueue<professor> staff = new PriorityQueue<professor>(4, new professorComparator());
		professorComparator compare1 = new professorComparator();

		professor professor1 = new professor("donaldson","science",12);
		staff.add(professor1);
		professor professor2 = new professor("michealson","mathmatics",3);
		staff.add(professor2);
		professor professor3 = new professor("jacobson","general studies",8);
		staff.add(professor3);
		
		System.out.println("please type the number of the item youd like to choose");
		System.out.println("1. categorize students by department");
		System.out.println("2. add professor");
		System.out.println("3. display staff");
	
		Scanner keyboard20 = new Scanner(System.in);
		int secondchoice = keyboard20.nextInt();
		String category = student1.major;
		String category1 = student2.major;
		String category2 = student3.major;
		String category3 = student4.major;
		String category4 = student5.major;

		
		switch(secondchoice) {
		case 1:
			if (category.equals("Computer Science")) {
				System.out.println(professor1.profName.toString() + " is your professor.");
			}
			if (category1.equals("Restuarant Hospitality")) {
				System.out.println(professor3.profName.toString() + " is your professor.");
			}
			if (category2.equals("Business Administration")) {
				System.out.println(professor2.profName.toString() + " is your professor.");
			}
			if (category3.equals("sudoku science")) {
				System.out.println(professor1.profName.toString() + " is your professor.");
			}
			if (category4.equals("Communications")) {
				System.out.println(professor3.profName.toString() + " is your professor.");
			}
			break;
		case 2:
			System.out.println("Type out prof name");
			Scanner keyboardA = new Scanner(System.in);
			String profName = keyboardA.next();
			System.out.println("Type out department");
			Scanner keyboardB = new Scanner(System.in);
			String profDep = keyboardB.next();
			System.out.println("Type out prof years");
			Scanner keyboardC = new Scanner(System.in);
			int profYears = keyboardC.nextInt();
			professor professor4 = new professor(profName,profDep,profYears);
			staff.add(professor4);
			System.out.println(professor4.profName.toString() + " " + professor4.department.toString() + " " + professor4.years);
			break;
		case 3:
			System.out.println(professor1.profName.toString() + " " + professor1.department.toString() + " " + professor1.years);
			System.out.println(professor2.profName.toString() + " " + professor2.department.toString() + " " + professor3.years);
			System.out.println(professor3.profName.toString() + " " + professor3.department.toString() + " " + professor3.years);



			break;
		
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
static class studentComparator implements Comparator<student>{
	public int compare (student student1,student student2,student student3,student student4,student student5) {
		return 0;
	}
	@Override
	public int compare(student o1, student o2) {
		return 0;
	}
}
static class professorComparator implements Comparator<professor>{
	public int compare (professor professor1,professor professor2, professor professor3) {
		return 0;
	}
	@Override
	public int compare(professor o1, professor o2) {
		return 0;
	}
}

}
