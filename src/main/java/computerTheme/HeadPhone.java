package computerTheme;

import java.util.Objects;

public class HeadPhone {
	// ---- fields
	private String brandName;
	private double db; // sound measuring unit.
	private boolean hasLight;
	private double currentVoice;

	// ---constructors
	HeadPhone() {
	}

	HeadPhone(String brandName, double db, boolean hasLight, double currentVoice) {
		this.brandName = brandName;
		this.db = db;
		this.hasLight = hasLight;
		this.currentVoice = currentVoice;
	}

	// ---getters and setters
	public String getBrandNAme() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public boolean getHasLight() {
		return hasLight;
	}

	public void setHAsLight(boolean hasLight) {
		this.hasLight = hasLight;
	}

	public double getDb() {
		return db;
	}

	public void setDb(double db) {
		this.db = db;
	}

	public double getCurrentVoice() {
		return currentVoice;
	}

	public void setCurrentVoice(double currentVoice) {
		this.currentVoice = currentVoice;
	}

	// -----methods
	public void increaseVoice(double amount) {
		currentVoice += amount;
	}

	public void decreaseVoice(double amount) {
		currentVoice -= amount;
	}

	@Override
	public String toString() {
		return "HeadPhone " + "\n" + "  brandName=" + brandName + "\n" + "  db=" + db + "\n" + "  hasLight=" + hasLight
				+ "\n" + "  currentVoice=" + currentVoice + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brandName, currentVoice, db, hasLight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeadPhone other = (HeadPhone) obj;
		return Objects.equals(brandName, other.brandName)
				&& Double.doubleToLongBits(currentVoice) == Double.doubleToLongBits(other.currentVoice)
				&& Double.doubleToLongBits(db) == Double.doubleToLongBits(other.db) && hasLight == other.hasLight;
	}

}
