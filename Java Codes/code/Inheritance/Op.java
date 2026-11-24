class First
{
void Hello()
{
System.out.println("Hello java");
}
}
class Second extends First
{
void Welcome()
{
System.out.println("welcome java");
}
}
class Third Extends First
{
void Info()
{
System.out.println("welcome sy class ");
}
}
class Main{
public static void main(String args[])
{
Second s1=new Second();
s1.Hello();
s1.Welcome();
s.Info();
}
}