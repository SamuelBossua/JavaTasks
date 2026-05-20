import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathAppTest{

@Test
public void testThatMultiplicationFunctionWorks(){


	String operation = "*";
	double number = 3;
	double numberTwo = 4;

	double actual = MathApp.multiplication(operation, number, numberTwo);
	double expected = 12;
	assertEquals(expected, actual);


}



@Test
public void testThatSubtractionFunctionWorks(){

	String operation = "-";
	double number = 5;
	double numberTwo = 2;

	double actual = MathApp.subtraction(operation, number, numberTwo);
	double expected = 3;
	assertEquals(expected, actual);


}


@Test
public void testThatAdditionFunctionWorks(){

	String operation = "+";
	double number = 5;
	double numberTwo = 2;

	double actual = MathApp.addition(operation, number, numberTwo);
	double expected = 7;
	assertEquals(expected, actual);


}

@Test
public void testThatDivisionFunctionWorks(){
	
	String operation = "/";
	double number = 5;
	double numberTwo = 2;

	double actual = MathApp.division(operation, number,numberTwo);
	double expected = 2.5;
	assertEquals(expected, actual);


}


























}