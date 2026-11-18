package com.tka.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
//@Table(name="student")
public class Student {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private String id;
	@Column	
	private String name;
	@Column
		private String city;
	@Column
		private int age;
		
		
		public Student( ) {
			super();
			
		}
		
		
		
		public Student( String name, String city, int age) {
			super();
			this.id = id;
			this.name = name;
			this.city = city;
			this.age = age;
		}
		
		
		public Student(String id, String name, String city, int age) {
			super();
			this.id = id;
			this.name = name;
			this.city = city;
			this.age = age;
		}
		
		
		
		
		
		
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + "]";
		}



		public String getId() {
			return id;
		}
		public void setId(String id) {
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
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
		




}