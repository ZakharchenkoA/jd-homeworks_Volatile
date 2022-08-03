public class Box implements Runnable {

    public static final int WAITING = 1000;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (Main.toggle) {
                Main.toggle = false;
                System.out.println("Кот из коробки выключил тумблер");
                try {
                    Thread.sleep(WAITING);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}