import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathAppTwoTest {

MathAppTwo myMathApp = new MathAppTwo();

@Test
public void testThatTheoperatorCallsOnTheFunctionMultiplication(){
	double numberOne = 5;
	double numberTwo = 2;
	double actual = myMathApp.operatorCollector('*');
	double expected = 10;
	assertEquals(expected, actual);
}


@Test
public void testThatTheoperatorCallsOnTheFunctionSubtraction(){

	double numberOne = 5;
	double numberTwo = 2;
	double actual = myMathApp.operatorCollector('-');
	double expected = 3;
	assertEquals(expected, actual);
}

@Test
public void testThatTheoperatorCallsOnTheFunctionAddition(){

	double numberOne = 5;
	double numberTwo = 2;
	double actual = myMathApp.operatorCollector('+');
	double expected = 7;
	assertEquals(expected, actual);
}


@Test
public void testThatTheoperatorCallsOnTheFunctionDivision(){

	double numberOne = 5;
	double numberTwo = 2;
	double actual = myMathApp.operatorCollector('/');
	double expected = 2.5;
	assertEquals(expected, actual);
}






















}