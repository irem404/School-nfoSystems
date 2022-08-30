package ödev2808;



public class Student extends Person {

	
	
	public Student(String name, String surname, int id) {
		super(name, surname, id);
		
	}

	private Instructor instructor;
	
	public static final int MAX_STUDENT_COUNT = 3;

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public static int getMaxStudentCount() {
		return MAX_STUDENT_COUNT;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	

	

	

	
	
	
	
	
}
