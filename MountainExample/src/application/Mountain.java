package application;

public class Mountain {

	private int heightMeters;
	private double peakTemperature;
	private String name;

	public Mountain(int heightMeters, double peakTemperature, String name) {
		this.heightMeters = heightMeters;
		this.peakTemperature = peakTemperature;
		this.name = name;
	}

	public int getHeightMeters() {
		return heightMeters;
	}

	public void setHeightMeters(int heightMeters) {
		this.heightMeters = heightMeters;
	}

	public double getPeakTemperature() {
		return peakTemperature;
	}

	public void setPeakTemperature(double peakTemperature) {
		this.peakTemperature = peakTemperature;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Mountain [heightMeters=" + heightMeters + ", peakTemperature=" + peakTemperature + ", name=" + name
				+ "]";
	}
	

}
