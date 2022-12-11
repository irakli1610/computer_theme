package computerTheme;

import java.util.Objects;

public class Speaker {
	//---fields
	public double db;
	public String brandName;
	public int currentVoice;
	
	//---constructors
	public Speaker() {}
	public Speaker(double db, String brandName, int currentVoice) {
		super();
		this.db = db;
		this.brandName = brandName;
		this.currentVoice = currentVoice;
	}
	
	//--setters and getters
	public double getDb() {
		return db;
	}
	public void setDb(double db) {
		this.db = db;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getCurrentVoice() {
		return currentVoice;
	}
	public void setCurrentVoice(int currentVoice) {
		this.currentVoice = currentVoice;
	}
		
	//---methods 
	public void speak() {
		System.out.println("speaker is speaking");
	}
	public void increaseVolume(int amount) {
		currentVoice+=amount;
	}
	public void decreaseVolume(int amount) {
		currentVoice-=amount;
	}
	
	//---methods
	@Override
	public String toString() {
		return "Speaker "+"\n"+"  db=" + db +"\n"+ "  brandName=" + brandName + "\n"+"  currentVoice=" + currentVoice + "\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(brandName, currentVoice, db);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Speaker other = (Speaker) obj;
		return Objects.equals(brandName, other.brandName) && currentVoice == other.currentVoice
				&& Double.doubleToLongBits(db) == Double.doubleToLongBits(other.db);
	}
	
	
	
}
