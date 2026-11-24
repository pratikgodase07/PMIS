class Student
{
int rollno;
String name;
static String college="sveri";
Student(int r,String n);
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
class Main
{
public static void main(String []args)
{
Student s1=new Student(1,"abc");
Student s2=new Student(2,"xyz");
s1.display();
s2.display();
}
}