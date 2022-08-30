package ödev2808;

import java.util.Arrays;

public class University {

	private Department[] departments=new Department[2];
			
	
	private  String name;
	
	

	public University(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public Department[] getDepartments() {
		return departments;
	}

	public void setDepartments(Department[] departments) {
		this.departments = departments;
	}



	int sayac=0;
	
	public void addDepartment(Department department) {
		if(sayac>department.getMaxDepartmentCount()) {
			System.out.println("departman kapasitesi dolu");
			return;
		}
		else {
			departments[sayac]=department;
			sayac++;
			
		}
	}

	@Override
	public String toString() {
		return "University [departments=" + Arrays.toString(departments) + ", name=" + name + "]";
	}
	
	
	
}
