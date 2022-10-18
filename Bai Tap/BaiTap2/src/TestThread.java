public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        OddThread odd= new OddThread("Odd");
        EvenThread even = new EvenThread("Even");
        Thread th1 = new Thread(odd);
        Thread th2 = new Thread(even);
        th1.start();
        th1.join();
        th2.start();
    }
}