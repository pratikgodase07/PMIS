package onetoone_218.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity


public class Employee {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
		private String city;
		
		@OneToOne
		private Laptop laptop;
		
		public Employee()
		{
			super();
		}
		
		public Employee(String name, String city) {
			super();
			
			this.name = name;
			this.city = city;
		}

		public Employee(int id, String name, String city) {
			super();
			this.id = id;
			this.name = name;
			this.city = city;
		}

		

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", laptop=" + laptop + "]";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
		
}
