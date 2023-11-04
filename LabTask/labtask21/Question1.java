package labtask21;

class Even implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class Odd implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {}
            }
        }
    }

public class Question1 {
    public static void main(String[] args) {
        // Create two threads, one for even and one for odd numbers
        Thread e = new Thread(new Even());
        Thread o = new Thread(new Odd());

        e.start();
        o.start();
    }

    
}

