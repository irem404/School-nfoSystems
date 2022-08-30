package ödev2808;

public class Instructor extends Person {

	public Instructor(String name, String surname, int id) {
		super(name, surname, id);
		// TODO Auto-generated constructor stub
	}
	
	private Department d;

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
}
