package ödev2808;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department d1 = new Department("Fizik ");
		Department d2=new Department("Matematik ");
		University u1 = new University("Ankara Üniversitesi");
		Student s1=new Student("irem","özyurt",123);
		Student s2=new Student("alperen","kaya",321);
		Student s3=new Student("emel","aslan",456);
		Instructor i=new Instructor("mehmet","yılmaz",52);
		
		
		
		u1.addDepartment(d1);
	    u1.addDepartment(d2);
		
	    d1.addStudent(s1);
        d1.addStudent(s2);
        d1.addStudent(s3);	
	    
		d1.getStudents()[0]=s1;
		d1.getStudents()[1]=s2;
		d1.getStudents()[2]=s3;
		
		
		System.out.println(d1);
		
		
      	
	   
			}
			
		
		
	

}
