package computerTheme;

import java.util.Objects;

public class FAN {
	// --fields
	private String brandName;
	private int fanSpeed;

	// --constructors
	FAN() {
	}

	FAN(String brandName, int fanSpeed) {
		this.brandName = brandName;
		this.fanSpeed = fanSpeed;
	}

	// ----getters and setters
	public String getBrandNAme() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getFanSpeed() {
		return fanSpeed;
	}

	public void setFanSpeed(int fanSpeed) {
		this.fanSpeed = fanSpeed;
	}

	// ----methods
	@Override
	public String toString() {
		return "FAN " + "\n" + "  brandName=" + brandName + "\n" + "  fanSpeed=" + fanSpeed + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brandName, fanSpeed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FAN other = (FAN) obj;
		return Objects.equals(brandName, other.brandName) && fanSpeed == other.fanSpeed;
	}

}
