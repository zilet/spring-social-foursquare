package org.springframework.social.foursquare.api;

public class VenueHistoryItem {
	
	private Boolean beenHere;
	private Venue venue;
	
	public VenueHistoryItem(Boolean beenHere, Venue venue) {
		this.beenHere = beenHere;
		this.venue = venue;
	}

	public Boolean getBeenHere() {
		return beenHere;
	}

	public Venue getVenue() {
		return venue;
	}
	
}
