package entities;

public class Employee {
	
	private Integer Id;
	private String Name;
	private Double Salary;
	
	public Employee() {
		
	}
	
	public Employee(Integer Id, String Name, Double Salary) {
		this.Id = Id;
		this.Name = Name;
		this.Salary = Salary;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		Salary += Salary * percentage / 100.0;
	}
	
	public String toString() {
		return Id + ", " + Name + ", " + Salary;
	}
		

}
