public class Main {
    public static void main(String[] args) throws InterruptedException {
        LazyPrimeFactoriztion Lazy = new LazyPrimeFactoriztion(11);
        OptimizedPrimeFactoriation Optimized = new OptimizedPrimeFactoriation(11);
        Thread th1 = new Thread(Lazy);
        Thread th2 = new Thread(Optimized);
        th1.start();
        th1.join();
        th2.start();

    }
}