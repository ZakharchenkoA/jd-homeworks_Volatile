public class Main {

    public static volatile boolean toggle;

    public static void main(String[] args) {

        Thread user = new Thread(new User());
        Thread box = new Thread(new Box());

        user.start();
        box.start();

        try {
            user.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        box.interrupt();
    }
}