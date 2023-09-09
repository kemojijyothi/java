package Arraysprograms;

public class average {
    public static void main(String[] args) {

                int[] numbers = {7,6,4,9,7,3};
                double average = calculateAverage(numbers);

                // prints the average
                System.out.println("The average is: " + average);
            }

            public static double calculateAverage(int[] numbers) {
                double sum = 0;

                // Calculating the average of an array
                for (int i = 0; i < numbers.length; i++) {
                    sum += numbers[i];
                }

                // returning the average to the main class
                return sum / numbers.length;
            }
        }




