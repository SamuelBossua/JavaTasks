
public class OshoFreePromoEngine {
public static double promoCalculator(double cartTotal, String promoCode){
	

	
	
	double discount = 0;
	
	if(cartTotal < 5000 && promoCode == "STARTER10"){
		return cartTotal;

}
	else if(cartTotal < 5000 && promoCode != "STARTER10"){
		return cartTotal;
}

	else if(cartTotal >= 5000 && cartTotal <= 14999 && promoCode == "STARTER10"){
		discount = cartTotal - (0.1 * cartTotal);
		return discount;
}

	else if(cartTotal >= 5000 && cartTotal <= 14999 && promoCode != "STARTER10"){
		return cartTotal;
}

	else if(cartTotal >= 15000 && cartTotal <= 29999 && promoCode == "BIGBOY20"){
		discount = cartTotal - (0.2 * cartTotal);
		return discount;

}

	else if(cartTotal >= 15000 && cartTotal <= 29999 && promoCode != "BIGBOY20"){
		return cartTotal;

}

	else if(cartTotal >= 30000 && promoCode == "OSHOFREE35"){
		discount = cartTotal - (0.35 * cartTotal);
		return discount;
}

	else if(cartTotal >= 30000 && promoCode != "OSHOFREE35"){
		return cartTotal;
}



	return cartTotal;







}
}