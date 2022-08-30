package �dev2808;

public class Person {

	protected String name;
	private String surname;
	protected int id;
	
	public Person(String name, String surname, int id) {
		super();
		this.name = name;
		this.surname = surname;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", id=" + id + "]";
	}
	
	
	
	
	
	
	
}
