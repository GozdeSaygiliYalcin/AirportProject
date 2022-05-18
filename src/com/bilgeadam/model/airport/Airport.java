package com.bilgeadam.model.airport;

import java.util.Arrays;

public class Airport {
	
	private String name;
	private String city;
//	private BuildingPart runway;
//	private BuildingPart taxiway;
//	private BuildingPart apron;
	private BuildingPart[] parts;
	
	public Airport(String name, String city) {
		this.name= name;
		this.city =city;
//		this.runway= new BuildingPart("runway", "asphalt", 2000, 50);
//		this.taxiway= new BuildingPart("taxi1", "concrete", 200, 25);
//		this.taxiway= new BuildingPart("taxi2", "concrete", 100, 25);
//		this.apron= new BuildingPart("apron", "concrete", 200, 300);
		this.parts = new BuildingPart[5];
		this.buildAirport();
	}
		
	private void buildAirport() {
		this.parts[0] = new BuildingPart("runway", "asphalt", 2000, 50, Part.RUNWAY);
		this.parts[1] = new BuildingPart("taxi1", "concrete", 200, 25, Part.TAXI);
		this.parts[2] = new BuildingPart("taxi2", "concrete", 100, 25, Part.TAXI);
		this.parts[3] = new BuildingPart("apron", "concrete", 200, 300, Part.APRON);
	}
	public BuildingPart[] getParts() {
		return this.parts;
	}
	

	public String getName() {
		return this.name;
	}

	public String getCity() {
		return this.city;
	}

		@Override
		public String toString() {
			return "Airport [name=" + this.name + ", city=" + this.city + ", parts=" + Arrays.toString(this.parts)
					+ ", toString()=" + super.toString() + "]";
	
	}
}
