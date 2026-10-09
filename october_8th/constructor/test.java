package october_8th.constructor;

class Car
{
    String color;
    String Brand;
    int speed;

    Car(String color, String Brand, int speed)
    {
        this.color = color;
        this.Brand = Brand;
        this.speed = speed;
    }

    //method-1
    void displayInfo()
    {
        System.out.println(Brand +"\n"+ color+ "\n"+ speed);
          
    }

    void accelerate(int incr)
    {
        int or_speed=speed;
        speed+=incr;

        System.out.println("Original speed:"+ or_speed);
        System.out.println(Brand + "accelerated by" +speed + "km/hr");

    }
}

public class test
{
    public static void main(String[] args)
     {
        Car c1 = new Car("Blue", "Jaguar", 360);
        c1.displayInfo();
        c1.accelerate(100);
    }
}