package october_16th.Lambda;

/*Built in function interfaces

Predicate<T> test(t) T -> t/f 1/0
Function<T,R> : apply(t) ; T ->R
*/

import java.util.function.*;

class Lambda1 
{
    public static void main(String[] args) 
    {
        Function<String, Integer> getLength = name -> name.length();
        System.out.println(getLength.apply("Java"));
        System.out.println(getLength.apply("Pratik"));
    }
}
