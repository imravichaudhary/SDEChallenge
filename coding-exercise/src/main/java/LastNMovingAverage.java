import java.util.List;

/**
 * A LastNMovingAverage will return average of the last N elements which where added.
 *
 * @param <E> the type of elements held in the collection
 */
public interface LastNMovingAverage<E extends Number> {
    /**
     * Inserts the element into this LastNMovingAverage
     *
     * @param item the element to add
     */
    void addElement(E item);

    /**
     * Return list of elements for calculating the average
     *
     * @return the last N elements which are used for calculating the average
     */
    List<E> getElements();

    /**
     * Return the average value of last N elements
     *
     * @return last N average
     */
    Double getAverage();
}
