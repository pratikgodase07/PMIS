package onetoone_218.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import onetoone_218.entity.Employee;
import onetoone_218.entity.Laptop;

public class Operation_1 {
	private static Configuration configuration=null;
	private static SessionFactory factory=null;
	private static Session session=null;
	private static Transaction transaction =null;
	
	public static void insertData()
	{
		
		openSession();
		
		Laptop laptop1=new Laptop("HP");
		Laptop laptop2=new Laptop("Asus");
		Laptop laptop3=new Laptop("Dell");
		Laptop laptop4=new Laptop("Lenovo");
		
		Employee employee=new Employee("Pratik", "Pandharpur");
		employee.setLaptop(laptop1);
		session.persist(laptop1);
		session.persist(laptop2);
		session.persist(laptop3);
		session.persist(laptop4);
		
		session.persist(employee);
		
		closeSession();
	}
	
	public static void closeSession()
	{
		transaction.commit();
		session.close();
		
	}
	
	public static void openSession()
	{
		configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(Laptop.class);
		factory=configuration.buildSessionFactory();
		session.beginTransaction();
		transaction=session.getTransaction();
	}
	

}
