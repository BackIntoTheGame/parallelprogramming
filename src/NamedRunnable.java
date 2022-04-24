public class NamedRunnable implements Runnable{
    private String name;

    public NamedRunnable(String name){
        this.name = name;
    }

    public void run(){
        System.out.println("The runnable thread is called :" + name);
    }
}

class TestNamedRunnable{
    public static void main(String[] args) {
        NamedRunnable nr = new NamedRunnable("RunningLOL");
        Thread thr = new Thread(nr);
        thr.start();

        // Runnable is a functional interface.
        // lambda expression
        Thread lambdaR = new Thread(() ->
                System.out.println("Greeting from lambda Runnable"));
        lambdaR.start();
    }
}