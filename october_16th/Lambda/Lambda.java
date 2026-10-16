package october_16th.Lambda;


//Lambda
@FunctionalInterface
interface Greeter
{
 void greet(String name);
}

public class Lambda 
{
 public static void main(String[] args) 
 {
     Greeter g = name -> System.out.println("Hello, " + name);
     g.greet("Pratik...");
 }
}
