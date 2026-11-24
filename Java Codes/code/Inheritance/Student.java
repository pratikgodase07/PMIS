//static keyword
class Student
{
int rollno;
String name;
static String college="kawathekar prashala";
static void change()
{
college="khp";
}
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+""+name+""+college);
}
}
class Main
{
public static void main(String args[])
{
//for s1
Student s1=new Student(1,"abc");
s1.display();
Student.change();

//for s2
Student s2=new Student(2,"xyz");
s2.display();
}
}
