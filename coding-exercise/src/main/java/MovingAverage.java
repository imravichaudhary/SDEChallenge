import java.util.Arrays;

public class MovingAverage {

    public static void main(String[] args) {
        Arrays.asList(3,5).forEach(size -> {
            System.out.println("Size -> " + size);
            LastNMovingAverage<Integer> integerLastNMovingAverage = new IntegerLastNMovingAverage(size);

            Arrays.asList(3,6,3,6,3,2,8,8,2,4,6).forEach(item -> {
                integerLastNMovingAverage.addElement(item);
                System.out.printf("Number = %d, Average = %.2f \n", item, integerLastNMovingAverage.getAverage());
            });

            System.out.println();
        });
    }
}
