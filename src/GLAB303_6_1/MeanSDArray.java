package bootcamp6.Assignments.GLAB303_6_1;

public class MeanSDArray {
    public static void main(String[] args) {

        // Declare variable
        int[] marks = {74, 43, 58, 60, 90, 64, 70};
        int sum = 0;
        int sumSq = 0;
        double mean, stdDev;

        // Compute sum and square-sum using loop
        for (int i = 0; i < marks.length; ++i) {
            sum += marks[i];
            sumSq += marks[i] * marks[i];
        }
        mean = (double) sum / marks.length;
        stdDev = Math.sqrt((double)sumSq / marks.length - mean * mean);

        // Print result
        System.out.printf("Mean is: %.2f%n", mean);                 // Mean is: 65.57
        System.out.printf("Standard deviation is: %.2f%n", stdDev); // Standard deviation is: 13.56
    }
}
