package computerTheme;

import java.util.Objects;

public class MotherBoard {
	//--------fields
	private String brandName;
	private String model;
	
	//-----constructors
	MotherBoard(){}
	MotherBoard(String brandName, String model)
	{
		this.brandName = brandName;
		this.model = model;
	}
	
	//--------getters and setters
	public String getBrandNAme()
	{
		return brandName;
	}
	public void setBrandName(String brandName)
	{
		this.brandName= brandName;
	}
	public String getModel()
	{
		return model;
	}
	public void setModel(String model)
	{
		this.model= model;
	}

	//----methods
		@Override
	public String toString() {
		return "MotherBoard "+"\n"+"  brandName=" + brandName + "\n"+"  model=" + model + "\n";
	}
		@Override
		public int hashCode() {
			return Objects.hash(brandName, model);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MotherBoard other = (MotherBoard) obj;
			return Objects.equals(brandName, other.brandName) && Objects.equals(model, other.model);
		}
		
		
}
