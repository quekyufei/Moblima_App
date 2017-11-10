package moblima;

import java.util.Date;

public class ShowDigital extends Show {
	private static float basePrice;
	
	public ShowDigital(Movie movie, Date showTime, GeneralLayout bookedLayout) {
		super(movie, showTime, bookedLayout);
	}

	public static void setBasePrice(float newBasePrice){
		ShowDigital.basePrice = newBasePrice; 
	}

}
