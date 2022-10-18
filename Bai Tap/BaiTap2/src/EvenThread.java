public class EvenThread implements Runnable {
    private Thread T;
    private final String name;

    public EvenThread(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println( "Even : " + i);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
