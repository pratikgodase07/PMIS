package october_10th.relationship;

import java.util.*;
//public class App {
//	public static void main(String[] args) {
//		Car vc= new Car();
//		
//		vc.drive();
//
//		
//	}
//
//}

//public class App
//{
//	public static void main(String[] args) {
//	
//		Address address = new Address("Pandharpur", "Maharashtra", 413304);
//
//        Student student = new Student("Pratyaa", 101, address);
//
//        student.displayProfile();
//    }
//}



//public class App
//{
//	public static void main(String[] args) {
//		Battery battery=new Battery(5000);
//		
//		Camera cam=new Camera(2);
//		
//		
//		Phone samsung=new Phone("Samsung A35", battery, cam);
//		
//		samsung.snapPicture();
//	}
//}




public class App
{
	public static void main(String[] args) {
		Student s1=new Student("Pratik ");
		Student s2=new Student("Anish ");
		
		System.out.println(Student.collegeName);
		
		s1.studcol();
		s2.studcol();
	}
}