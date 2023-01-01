package computerTheme;

import java.util.Objects;

public class CPU {
	// ---fields
	private String brandName;
	private double GHz;
	private int thread;

	// -------constructors
	CPU() {
	}

	CPU(String brandName, double GHz, int thread) {
		this.brandName = brandName;
		this.GHz = GHz;
		this.thread = thread;

	}

	// ------getters and setters
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getGHz() {
		return GHz;
	}

	public void setGHz(double GHz) {
		this.GHz = GHz;
	}

	public int getThread() {
		return thread;
	}

	public void setThread(int thread) {
		this.thread = thread;
	}

	// -----methods
	@Override
	public String toString() {
		return "CPU " + "\n" + "  brandName=" + brandName + "\n" + "  GHz=" + GHz + "\n" + "  thread=" + thread + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(GHz, brandName, thread);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CPU other = (CPU) obj;
		return Double.doubleToLongBits(GHz) == Double.doubleToLongBits(other.GHz)
				&& Objects.equals(brandName, other.brandName) && thread == other.thread;
	}

}
