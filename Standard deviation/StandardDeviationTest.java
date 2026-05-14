import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest {

    @Test
    public void testCalculateMean() {
        double[] numbers = {10, 20, 30, 40, 50};
	double actual = StandardDeviation.calculateMean(numbers);
	double expected = 30;
        assertEquals(expected, actual);
    }

   
    @Test
    public void testCalculateVariance() {
        double[] numbers = {2, 4, 4, 4, 5, 5, 7, 9};
	double actual = StandardDeviation.calculateVariance(numbers);
	double expected = 4;
        assertEquals(expected, actual);
    }

     @Test
    public void testCalculateStandardDeviation() {
        double[] numbers = {2, 4, 4, 4, 5, 5, 7, 9};
	double actual = StandardDeviation.calculateStandardDeviation(numbers);
	double expected = 2;
	
        assertEquals(expected, actual);
    }

   

   }