package ConstrructorofEmployee;

public class Student {

	String name;

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	public Student(String name) {
		super();
		this.name = name;
	}
	
	public Student() {
		name = "Unknown";
	}
}
