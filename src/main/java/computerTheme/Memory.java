package computerTheme;

import java.util.Objects;

public class Memory {
	//----fields
	private String brandName;
	private String memoryType;   //better would be to   make it with boolean type.
	
	//-----constructors
	Memory(){}
	Memory(String brandname, String memoryType)
	{
		this.brandName = brandname;
		this.memoryType = memoryType;
	}
	
	//------getters and setters
	public String getBrandNAme()
	{
		return brandName;
	}
	public void setBrandName(String brandName)
	{
		this.brandName= brandName;
	}
	public String getMemoryType()
	{
		return memoryType;
	}
	public void setMemoryType(String memoryType)
	{
		this.memoryType= memoryType;
	}
	
	
	@Override
	public String toString() {
		return "Memory "+"\n"+"  brandName=" + brandName + "\n"+"  memoryType=" + memoryType +"\n" ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(brandName, memoryType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Memory other = (Memory) obj;
		return Objects.equals(brandName, other.brandName) && Objects.equals(memoryType, other.memoryType);
	}
	
	
	
}
