import java.util.Random;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        // Part 1

        // Step 1
        int[] dataPoints = new int[100];
        System.out.println("The array has a " + dataPoints.length + " amount.");

        // Step 2
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        } System.out.println("The array has " + dataPoints.length + " values from 1 to 100.");

        // Step 3
        System.out.println("The value is: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        } System.out.println();

        // Step 4
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("\nThe sum is: " + sum);
        System.out.printf("The average is: %.2f%n", average);

        // Part 2

        // Step 1
        int target = SafeInput.getRangedInt(in, "\nEnter a value to search", 1, 100);

        // Step 2
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == target){
                count++;
            }
        } System.out.println("The value " + target + " was found " + count + " time(s).");

        // Step 3
        int target2 = SafeInput.getRangedInt(in, "\nEnter another value for ", 1, 100);
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == target2) {
                position = i;
                break;
            }
        } if (position != -1) {
            System.out.println("The value " + target2 + " was found " + position + ".");
        } else {
            System.out.println("The value " + target2 + " was not found.");
        }

        // Step 4
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            } if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        } System.out.println("\nThe minimum value is: " + min);
        System.out.println("The maximum value is: " + max);
    }
}
