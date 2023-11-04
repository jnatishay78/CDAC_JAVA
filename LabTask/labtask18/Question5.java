package labtask18;
import java.util.ArrayDeque;
public class Question5 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.offerFirst("Lavishay");
        System.out.println("\nElement inserted at the first position:");
        System.out.println(deque);

        deque.offerFirst("Atishay");
        deque.offerFirst("Ati");

        System.out.println("\nElements inserted at the first position:");
        System.out.println(deque);
        
        deque.offerLast("Ati");
        deque.offerLast("Atishay");
        deque.offerLast("Laveena");
        deque.offerLast("Purti");

        System.out.println("\nElements inserted at the last position:");
        System.out.println(deque);

        
    }
}
