public class MathAppTwo {

	double numberOne = 5;
	double numberTwo = 2;

	public double operatorCollector(char operator){
		if(operator == '*'){
	return multiplication(numberOne, numberTwo);
}
	        else if(operator == '-'){
	return subtraction(numberOne, numberTwo);

}

		else if(operator  == '+'){
	return addition(numberOne, numberTwo);
}

		else if(operator == '/'){
	return division(numberOne, numberTwo);

}
		else{
	throw new IllegalArgumentException("Invalid Operator");


}
}

	public static double multiplication(double numberOne, double numberTwo){
 
	return numberOne * numberTwo;
	

}

	public static double subtraction(double numberOne, double numberTwo){
 
	return numberOne - numberTwo;
	

}

	public static double addition(double numberOne, double numberTwo){
 
	return numberOne + numberTwo;
	

}

	public static double division(double numberOne, double numberTwo){
 
	return numberOne / numberTwo;
	

}






















}