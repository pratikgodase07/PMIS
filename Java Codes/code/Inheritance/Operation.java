class Operation
{
static int a=5;
static int b=2;
}
class Addition extends Operation
{
public static void main(String args[]){
int result=a+b;
System.out.println("Addition is "+result);
}
}