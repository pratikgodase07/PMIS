//multilevel inheritance
class Operation1
{
int a=5;
int b=7;
}
class Addition extends Operation1
{
int result=(a+b);
public static void main(String args[])

{
Addition result=new Addition();
System.out.println("Addition is:"+int result);
}
}
