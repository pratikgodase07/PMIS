package spring_pratik.entity;

public class Employee {
	
	private String name;
	private int id;
	private Nation nation;
	
	
	 public  Employee()
	 {
		 super();
	 }
	 
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Nation getNation() {
		return nation;
	}
	public void setNation(Nation nation) {
		this.nation = nation;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", nation=" + nation + "]";
	}
	
	
}