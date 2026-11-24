//static keyword
//in this code only ++ found of digits from 1 to 3
class Counter
{
static int Count=0;
Counter()
{
Count++;
System.out.println(Count);
}
public static void main(String args[])
{
Counter c1=new Counter();
Counter c2=new Counter();

Counter c3=new Counter();
}
}
