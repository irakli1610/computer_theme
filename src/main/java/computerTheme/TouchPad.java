package computerTheme;

import java.util.Objects;

public class TouchPad {
	// ---fields
	private double sensitivity;
	private int buttons;

	// ---constructors
	public TouchPad() {
		super();
	}

	public TouchPad(double sensitivity, int buttons) {
		this.sensitivity = sensitivity;
		this.buttons = buttons;
	}

	// -----setters and getters
	public double getSensitivity() {
		return sensitivity;
	}

	public void setSensitivity(double sensitivity) {
		this.sensitivity = sensitivity;
	}

	public int getButtons() {
		return buttons;
	}

	public void setButtons(int buttons) {
		this.buttons = buttons;
	}

	// ----methods
	public void touchpadclick() {
		System.out.println("click...");
	}

	public void zoom() {
		System.out.println("zooming");
	}

	@Override
	public String toString() {
		return "TouchPad " + "\n" + "  sensitivity=" + sensitivity + "\n" + "  buttons=" + buttons + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(buttons, sensitivity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TouchPad other = (TouchPad) obj;
		return buttons == other.buttons
				&& Double.doubleToLongBits(sensitivity) == Double.doubleToLongBits(other.sensitivity);
	}

}
