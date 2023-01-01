package computerTheme;

import java.util.Objects;

public class PowerSupply {
	// -----fields
	private String brandName;
	private int watt;

	// ----constructors
	PowerSupply() {
	}

	PowerSupply(String brandName, int watt) {
		this.brandName = brandName;
		this.watt = watt;
	}

	// ----setters and getters
	public String getBrandNAme() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getWatt() {
		return watt;
	}

	public void setWatt(int watt) {
		this.watt = watt;
	}

	// methods
	@Override
	public String toString() {
		return "PowerSupply" + "\n" + "  brandName=" + brandName + "\n" + "  watt=" + watt + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brandName, watt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PowerSupply other = (PowerSupply) obj;
		return Objects.equals(brandName, other.brandName) && watt == other.watt;
	}

}
