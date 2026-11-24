class A implements showable
{
void show()
{
System.out.println("Welcome");
}
public static void main(String []args)
{
A a=new A();
 a.show();
}

}
interface showable
{
void show();
}
interface printable extends showable
{
void print();
}
class Main implements Printable
{
void show()
{
System.out.println("Welcome");
}
void print()
{
System.out.println("Hello");
}
public static void main(String args[])
{
Main m1=new Main();
m1.show();
m1.print();
}
}
