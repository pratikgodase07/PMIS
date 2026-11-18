package onetoone_218.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


public class Laptop {
	
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String name;
	 
	 public Laptop()
	 {
		 super();
	 }

	 
	 
	 public Laptop(String name) {
			super();
			
			this.name = name;
		}
	 
	 



	 public Laptop(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	 
	 @Override
		public String toString() {
			return "Laptop [id=" + id + ", name=" + name + "]";
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
}
