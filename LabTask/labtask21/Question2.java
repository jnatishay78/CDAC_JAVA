package labtask21;
import java.util.Arrays;
public class Question2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6, 3, 7, 8, 4};
        int no_of_Threads = 4;
        Thread[] threads = new Thread[no_of_Threads];
        int s = arr.length / no_of_Threads;
        for (int i = 0; i < no_of_Threads; i++) {
            final int start = i * s;
            final int end = (i == no_of_Threads - 1) ? arr.length : start + s;
            threads[i] = new Thread(new Sort(arr, start, end));
            threads[i].start();
        }

        for (int i = 0; i < no_of_Threads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {}
        }

        merge(arr, no_of_Threads);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static class Sort implements Runnable {
        private int[] array;
        private int start;
        private int end;

        public Sort(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            Arrays.sort(array, start, end);
        }
    }

    static void merge(int[] array, int num) {
        int[] result = new int[array.length];
        int s = array.length / num;

        for (int i = 0; i < num; i++) {
            int start = i * s;
            int end = (i == num - 1) ? array.length : start + s;
            System.arraycopy(array, start, result, start, end - start);
        }

        System.arraycopy(result, 0, array, 0, array.length);
    }
}

