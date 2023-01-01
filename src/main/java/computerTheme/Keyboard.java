package computerTheme;

import java.util.Objects;

public class Keyboard {
	// ------fields
	private String keyboardBrand;
	private int numberofKeys;
	private boolean wireless;
	private boolean hasLight;

	// -----constructors
	Keyboard(String KeyboardBrand, int numberofKeys, boolean wireless, boolean hasLight) {
		this.hasLight = hasLight;
		this.keyboardBrand = KeyboardBrand;
		this.numberofKeys = numberofKeys;
		this.wireless = wireless;
	}

	Keyboard() {
	}

	// ------getters and setters
	public String getKeyboardBrand() {
		return keyboardBrand;
	}

	public void setKeyboardbrand(String KeyboardBrand) {
		this.keyboardBrand = KeyboardBrand;
	}

	public int getNumberofKeys() {
		return numberofKeys;
	}

	public void setNumberofKeys(int numberofKeys) {
		this.numberofKeys = numberofKeys;
	}

	public boolean getWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	public boolean getHasLight() {
		return hasLight;
	}

	public void setHasLight(boolean hasLight) {
		this.hasLight = hasLight;
	}

	// -----methods
	public void buttonClick() {
		System.out.println("clicking the button on the keyboard");
	}

	@Override
	public String toString() {
		return "Keyboard" + "\n" + "  keyboardBrand=" + keyboardBrand + "\n" + "  numberofKeys=" + numberofKeys + "\n"
				+ "  wireless=" + wireless + "\n" + "  hasLight=" + hasLight + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(hasLight, keyboardBrand, numberofKeys, wireless);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Keyboard other = (Keyboard) obj;
		return hasLight == other.hasLight && Objects.equals(keyboardBrand, other.keyboardBrand)
				&& numberofKeys == other.numberofKeys && wireless == other.wireless;
	}

}
