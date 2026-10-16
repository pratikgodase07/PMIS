package october_16th.Consumer_Function;

import java.util.function.Consumer;

class ConsumerDemo1
{
	public static void main(String[] args)
	{
		Consumer<String> pr = message -> System.out.println(message);
		
		pr.accept("Hello, I Love Cricket");
	}
}