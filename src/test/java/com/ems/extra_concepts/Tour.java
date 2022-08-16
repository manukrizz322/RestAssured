package com.ems.extra_concepts;

public class Tour {

	private String place;

	public String getPlace() {
		return place;
	}

	public Tour setPlace(String place) {
		this.place = place;
		
		return this;
	}

	public String getModeofTravel() {
		return modeofTravel;
	}

	public Tour setModeofTravel(String modeofTravel) {
		this.modeofTravel = modeofTravel;
		
		return this;
	}
	public void heyManWhereAreYouGoing() {
 
		System.out.println(getPlace());
		System.out.println("Oh Enjoy "+getModeofTravel()+" that "+getPlace());
	}

	private String modeofTravel;
	
	public static void main(String[] args) {
		Tour tour=new Tour();
		tour.setPlace("ooty");
		tour.setModeofTravel("Car");
		tour.heyManWhereAreYouGoing();
		
		tour.setPlace("Denver").setModeofTravel("Flight").heyManWhereAreYouGoing();
		
	}

}
