package moblima;

import java.util.ArrayList;
import java.util.Date;

public class Cinema {
	private ArrayList<Show> shows;
	private static float premium;
	private String name;
	private char[][] seatLayout;

	public Cinema (ArrayList<Show> shows, String name)
	{
		this.shows = shows;
		this.name = name;
	}

	public float calculatePrice(float basePrice, float premium) { //change UML diagram
		return basePrice + premium;
	}
	
	public static void setPremium(float newPremium){
		Cinema.premium = newPremium;
	}
	public void createShow(Movie movie, Date showTime){
		shows.add(new Show(movie,showTime,seatLayout));
	}

}