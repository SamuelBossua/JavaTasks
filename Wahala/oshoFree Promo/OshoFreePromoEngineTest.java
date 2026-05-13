import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OshoFreePromoEngineTest{

@Test

public void testThatThePromoEngineWorksifPromoCodeIsStarterTenButLessThanFiveThousand(){
	double cartTotal = 4000;
	String promoCode = "STARTER10";
	
	double actual = OshoFreePromoEngine.promoCalculator(cartTotal, promoCode);
	double expected = 4000;
	assertEquals(expected, actual);

}


public void testThatThePromoEngineWorksifPromoCodeIsStarterTen(){
	double cartTotal = 6000;
	String promoCode = "STARTER10";
	
	double actual = OshoFreePromoEngine.promoCalculator(cartTotal, promoCode);
	double expected = 5400;
	assertEquals(expected, actual);

}

public void testThatThePromoEngineWorksifPromoCodeIsBigBoyTwenty(){
	double cartTotal = 15000;
	String promoCode = "BIGBOY20";
	
	double actual = OshoFreePromoEngine.promoCalculator(cartTotal, promoCode);
	double expected = 12000;
	assertEquals(expected, actual);

}

public void testThatThePromoEngineWorksifPromoCodeIsOshoFreeThirtyFive(){
	double cartTotal = 30000;
	String promoCode = "OSHOFREE35";
	
	double actual = OshoFreePromoEngine.promoCalculator(cartTotal, promoCode);
	double expected = 19500;
	assertEquals(expected, actual);

}





















}