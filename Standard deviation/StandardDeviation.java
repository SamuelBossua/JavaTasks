public class StandardDeviation {

    public static double calculateMean(double[] numbers) {
        double sum = 0;

        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }

    public static double calculateVariance(double[] numbers) {
        double mean = calculateMean(numbers);
        double total = 0;

        for (double number : numbers) {
            total += (number - mean) * (number - mean);
        }

        return total / numbers.length;
    }

    public static double calculateStandardDeviation(double[] numbers) {
        return Math.sqrt(calculateVariance(numbers));
    }
}