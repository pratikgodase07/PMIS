package october_15th.Generics;


class Box<T> {
    private T value;

    public void set(T value) 
    {
        this.value = value;
    }

    public T get() 
    {
        return value;
    }
}
public class Gen {
	
	public static void main(String[] args) {
		Box<String> box =new Box<>();
		
		box.set("Hello");
		String s=box.get();
		System.out.println(s);
	}

}
