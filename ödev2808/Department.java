package ödev2808;

import java.util.Arrays;

public class Department {

	private String name;
	
	private Student[] students=new Student[3];
	
	
	
	public Department(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static final int MAX_DEPARTMENT_COUNT = 2;

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public static int getMaxDepartmentCount() {
		return MAX_DEPARTMENT_COUNT;
	}

	int sayac=0;
	
	public void addStudent(Student student) {
		if(sayac>student.getMaxStudentCount()) {
			System.out.println("öğrenci kapasitesi dolu");
			return;
		}
		else {
			students[sayac]=student;
			sayac++;
			
		}
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", students=" + Arrays.toString(students) + "]";
	}

	
	
	
	
	
}
