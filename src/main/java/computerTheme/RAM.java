package computerTheme;

import java.util.Objects;

public class RAM {
	//---fields
	private String brandName;
	private int GB;
	private double Hz;
	
	//-----constructors
	RAM(){}
	RAM(String brandName, int GB, double Hz)
	{
		this.brandName=brandName;
		this.GB=GB;
		this.Hz=Hz;
	}
	
	//----getters and setters
	 public double getHz() 
	 {
		 return Hz;
	 }
	 public void setHz(double Hz)
	 {
		 this.Hz=Hz;
	 }
	 public int getGB()
	 {
		return GB;
	 }
	 public void setGB(int GB)
	 {
		this.GB= GB;
	 }
 	 public String getBrandName()
 	 {
		return brandName;
	 }
	 public void setBrandName(String brandName)
	 {
		this.brandName= brandName;
	 }
	
	 //---methods
	 @Override
	public String toString() {
		return "RAM "+"\n"+"  brandName=" + brandName +"\n"+ "  GB=" + GB + "\n"+"  Hz=" + Hz +"\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(GB, Hz, brandName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RAM other = (RAM) obj;
		return GB == other.GB && Double.doubleToLongBits(Hz) == Double.doubleToLongBits(other.Hz)
				&& Objects.equals(brandName, other.brandName);
	}
	 
	 
	 
}
