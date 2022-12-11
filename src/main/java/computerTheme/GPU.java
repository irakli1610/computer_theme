package computerTheme;

import java.util.Objects;

public class GPU {
	//---fields
	private String brandName;
	private int GB;
	private boolean hasLight;
	
	//--constructors
	GPU(){}
	GPU(String brandName, int GB, boolean hasLight)
	{
		this.brandName=brandName;
		this.GB=GB;
		this.hasLight=hasLight;
	}
	
	//-----getters and setters
	public String getBrandNAme()
	{
		return brandName;
	}
	public void setBrandName(String brandName)
	{
		this.brandName= brandName;
	}
	public int getGB()
	{
		return GB;
	}
	public void setGB(int GB)
	{
		this.GB= GB;
	}
	public boolean getHasLight()
	{
		return hasLight;
	}
	public void setHAsLight(boolean hasLight)
	{
		this.hasLight= hasLight;
	}
	
	
	@Override
	public String toString() {
		return "GPU"+"\n"+"  brandName=" + brandName + "\n"+"  GB=" + GB +"\n"+ "  hasLight=" + hasLight +"\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(GB, brandName, hasLight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GPU other = (GPU) obj;
		return GB == other.GB && Objects.equals(brandName, other.brandName) && hasLight == other.hasLight;
	}

	


}
