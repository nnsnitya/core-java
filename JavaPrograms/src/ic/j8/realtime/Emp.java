package ic.j8.realtime;

public class Emp {

	private int id, age, yearOfJoining;
	private String name, gender, dept;
	private double salary;
	
	public Emp(int id, String name, int age, String gender, String dept, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.age = age;
		this.yearOfJoining = yearOfJoining;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getDept() {
		return dept;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", age=" + age + ", yearOfJoining=" + yearOfJoining + ", name=" + name + ", gender="
				+ gender + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
}
