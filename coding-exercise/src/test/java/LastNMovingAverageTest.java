import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LastNMovingAverageTest {

    @Test
    void shouldCalculateMovingAverage_whenElementsAdded() {
        List<Integer> testData = Arrays.asList(5,3,6);
        int sum = testData.stream().mapToInt(Integer::intValue).sum();
        double expectedAverage = (double) sum/testData.size();

        LastNMovingAverage<Integer> lastNMovingAverage = new IntegerLastNMovingAverage(testData.size());
        testData.forEach(lastNMovingAverage::addElement);
        double actualAverage = lastNMovingAverage.getAverage();

        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void shouldRetrieveLastNElements_whenElementsAdded() {
        List<Integer> testData = Arrays.asList(5,2,7,2,3);
        List<Integer> expectedList = Arrays.asList(7,2,3);

        LastNMovingAverage<Integer> integerLastNMovingAverage = new IntegerLastNMovingAverage(3);
        testData.forEach(integerLastNMovingAverage::addElement);

        assertEquals(expectedList, integerLastNMovingAverage.getElements());
    }

    @Test
    void shouldCalculateMovingAverageOfLastNElements_whenMoreElementsAddedThenWindowSize() {
        List<Integer> testData = Arrays.asList(5,3,6);
        double expectedAverage = 4.5;

        LastNMovingAverage<Integer> lastNMovingAverage = new IntegerLastNMovingAverage(2);
        testData.forEach(lastNMovingAverage::addElement);
        double actualAverage = lastNMovingAverage.getAverage();

        assertEquals(expectedAverage, actualAverage);
    }

}