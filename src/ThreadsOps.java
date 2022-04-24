public class ThreadsOps {
    public static void main(String[] args) {
        System.out.println("Runtime.getRuntime().availableProcessors() = " + Runtime.getRuntime().availableProcessors());
        System.out.println("Thread.MAX_PRIORITY = " + Thread.MAX_PRIORITY);
        System.out.println("Thread.NORM_PRIORITY = " + Thread.NORM_PRIORITY);
        System.out.println("Thread.MIN_PRIORITY = " + Thread.MIN_PRIORITY);
        System.out.println("Thread.currentThread() = " + Thread.currentThread().getPriority());
    }
}
