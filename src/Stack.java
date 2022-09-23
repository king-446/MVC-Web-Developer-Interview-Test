import java.util.Deque;
import java.util.ArrayDeque;

public class Stack {
    
    private static Deque<String> queue = new ArrayDeque<>();
    
    public String enqueue(String value) {
        queue.push(value);
        return value;
    }
    
    public String dequeue() {
        if (size() != 0)
            return queue.pop();
        return null;
    }
    
    public Deque<String> getQueue() {
        return queue;
    }
    
    public int size() {
        return queue.size();
    }
    
}
