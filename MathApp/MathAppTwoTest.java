import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathAppTwo {

@Test
public void testThatTheoperatorCallsOnTheFunctionMultiplication(){


	String actual = MathAppTwo.operatorCollector("*");
	double expected = MathAppTwo.multiplication;
	assertEquals(expected, actual);
}


@Test
public void testThatTheoperatorCallsOnTheFunctionSubtraction(){


	String actual = MathAppTwo.operatorCollector("-");
	double expected = MathAppTwo.subtraction;
	assertEquals(expected, actual);
}

@Test
public void testThatTheoperatorCallsOnTheFunctionAddition(){


	String actual = MathAppTwo.operatorCollector("+");
	double expected = MathAppTwo.addition;
	assertEquals(expected, actual);
}


@Test
public void testThatTheoperatorCallsOnTheFunctionDivision(){


	String actual = MathAppTwo.operatorCollector("/");
	double expected = MathAppTwo.division;
	assertEquals(expected, actual);
}






















}