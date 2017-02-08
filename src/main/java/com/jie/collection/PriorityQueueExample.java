import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Comparator<String> ascendingComparator = (String x, String y) -> x.compareTo(y);
        Comparator<String> descendingComparator = (String x, String y) -> y.compareTo(x);
        PriorityQueue<String> ascendingPriorityQueue = new PriorityQueue<String>(10, ascendingComparator);
        PriorityQueue<String> descendingPriorityQueue = new PriorityQueue<String>(10, descendingComparator);

        ascendingPriorityQueue.add("orange");
        ascendingPriorityQueue.add("fig");
        ascendingPriorityQueue.add("watermelon");
        ascendingPriorityQueue.add("lemon");

        descendingPriorityQueue.add("orange");
        descendingPriorityQueue.add("fig");
        descendingPriorityQueue.add("watermelon");
        descendingPriorityQueue.add("lemon");

        String s = ascendingPriorityQueue.remove();
        System.out.println("ascendingPriorityQueue size=" + ascendingPriorityQueue.size());
        while (ascendingPriorityQueue.size() != 0) {
            System.out.println(ascendingPriorityQueue.remove());
        }
        System.out.println();

        descendingPriorityQueue.remove(s);
        System.out.println("descendingPriorityQueue size=" + descendingPriorityQueue.size());
        while (descendingPriorityQueue.size() != 0) {
            System.out.println(descendingPriorityQueue.remove());
        }
        System.out.println();

    }
}
