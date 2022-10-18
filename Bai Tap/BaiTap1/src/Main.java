public class Main {
    public static void main(String[] args) {
        NumberGenerator num1= new NumberGenerator("HungBeoo");
        NumberGenerator num2 = new NumberGenerator("Hung");
        Thread th1 = new Thread(num1);
//        th1.setPriority(Thread.MAX_PRIORITY);
        th1.start();
        Thread th2 = new Thread(num2);
//        th2.setPriority(Thread.MAX_PRIORITY);
        th2.start();

    }
}