public class User implements Runnable {

    private static final int COUNT = 5;
    public static final int WAITING = 3000;

    @Override
    public void run() {
        for (int i = 0; i < COUNT; i++) {
            if (Main.toggle) {
                Main.toggle = true;
                System.out.println("Игрок включил тумблер");
                try {
                    Thread.sleep(WAITING);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}