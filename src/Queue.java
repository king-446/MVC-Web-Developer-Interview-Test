import java.util.Deque;
import java.util.ArrayDeque;

public class Queue {
    
    private static Deque<String> queue = new ArrayDeque<>();
    
    public String enqueue(String value) {
        queue.add(value);
        return value;
    }
    
    public String dequeue() {
        if (size() != 0)
            return queue.remove();
        return null;
    }
    
    public Deque<String> getQueue() {
        return queue;
    }
    
    public int size() {
        return queue.size();
    }
    
}
