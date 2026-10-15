package october_15th.Generics.MultiTypeParameters;

class Locker<T>{
    private T item;

    void put(T item)
    {
        this.item = item;
    }

    T get(){
        return item;
    }
}

class Gen2{
    public static void main(String[] args){
        Locker<String> l1 = new Locker<>();
        l1.put("Core Java book");
        System.out.println("The locker has: " + l1.get());

        Locker<Integer> intlocker = new Locker<>();
        intlocker.put(1234);
        intlocker.put(8910);
        
        System.out.println("Intlocker has: " + intlocker.get());
    }
}