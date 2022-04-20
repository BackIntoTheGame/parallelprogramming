public class NamedThread extends Thread{
    private String name;

    public NamedThread(String name){
        this.name = name;
    }

    public void run(){
        System.out.println("The thread you run is called : " + name);
    }
}

class TestDrive {
    public static void main(String[] args) {
        NamedThread nt = new NamedThread("funfunfun");
        nt.start();
    }
}
