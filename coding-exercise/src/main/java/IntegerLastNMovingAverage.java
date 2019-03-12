import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IntegerLastNMovingAverage implements LastNMovingAverage<Integer> {
    private Queue<Integer> queue;
    private double sum;
    private double average;
    private final int N;

    public IntegerLastNMovingAverage(int n) {
        assert n > 0 : "Must be a position integer";
        this.N = n;
        queue = new LinkedList<>();
    }

    public void addElement(Integer item) {
        sum += item;
        queue.add(item);
        if(queue.size() > N) {
            sum -= queue.remove();
        }

    }

    public List<Integer> getElements() {
        return new ArrayList<>(queue);
    }

    public Double getAverage() {
        if(queue.isEmpty()) {
            return (double) -1;
        }
        return sum / queue.size();
    }
}
