package ua.lviv.iot.dwelling.model;

public class Flat extends AbstractDwellingInHouse {

	private int neighboringApartmentsOnFloorCount;

	public Flat(double areaInSquareMeters, double priceInUSD, Location location) {
		super(areaInSquareMeters, priceInUSD, location);
	}

	public int getNeighboringApartmentsOnFloorCount() {
		return neighboringApartmentsOnFloorCount;
	}

	public void setNeighboringApartmentsOnFloorCount(int neighboringApartmentsOnFloorCount) {
		this.neighboringApartmentsOnFloorCount = neighboringApartmentsOnFloorCount;
	}
}
