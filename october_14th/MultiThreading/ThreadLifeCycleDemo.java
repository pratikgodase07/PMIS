package october_14th.MultiThreading;

public class ThreadLifeCycleDemo {

    public static void main(String[] args) throws InterruptedException {
        // 1. NEW STATE
        // The thread object is created, but start() has not been called.
        Thread myThread = new Thread(new MyRunnable());
        System.out.println("1. Thread state after creation (NEW): " + myThread.getState());

        // 2. RUNNABLE STATE
        // The start() method is called. The thread is now ready to run.
        myThread.start();
        System.out.println("2. Thread state after calling start() (RUNNABLE): " + myThread.getState());

        // Give the thread a tiny fraction of time to print its initial 'RUNNING' message
        Thread.sleep(100);

        // 4. BLOCKED / TIMED_WAITING STATE
        // While the main thread is sleeping here, 'myThread' hits its Thread.sleep(2000)
        // statement inside the run() method, putting it into a timed waiting state.
        System.out.println("4. Thread state while sleeping in run() (TIMED_WAITING): " + myThread.getState());

        // Wait for 'myThread' to complete its execution fully
        myThread.join();

        // 5. DEAD (TERMINATED) STATE
        // The thread has finished executing its run() method.
        System.out.println("5. Thread state after completing execution (TERMINATED): " + myThread.getState());
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        // 3. RUNNING STATE
        // The thread scheduler has allocated CPU time, and the code is executing.
        System.out.println("3. Thread is now executing code (RUNNING).");
        
        try {
            // This forces the thread to enter a temporary idle/blocked state
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted.");
        }
    }
}

