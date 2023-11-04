package labtask21;
public class Question3 {
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        myRunnable.run();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Counter: " + i);
            }
        }
    }
}

