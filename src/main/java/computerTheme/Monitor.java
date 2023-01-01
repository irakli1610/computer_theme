package computerTheme;

import java.util.Objects;

public class Monitor {
	// ----fields
	private String resolution;
	private int Hz;
	private String brandName;

	// -----constructors------------
	Monitor() {

	}

	Monitor(String resolution, int Hz, String brandName) {
		this.resolution = resolution;
		this.Hz = Hz;
		this.brandName = brandName;
	}

	// -------setters and getters----------
	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public int getHz() {
		return Hz;
	}

	public void setHz(int Hz) {
		this.Hz = Hz;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	// -----methods----------
	public void displayMessage(String message) {
		System.out.println(message);
	}

	@Override
	public String toString() {
		return "Monitor " + "\n" + "  resolution=" + resolution + "\n" + "  Hz=" + Hz + "\n" + "  brandName="
				+ brandName + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Hz, brandName, resolution);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Monitor other = (Monitor) obj;
		return Hz == other.Hz && Objects.equals(brandName, other.brandName)
				&& Objects.equals(resolution, other.resolution);
	}

}
