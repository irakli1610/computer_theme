package computerTheme;

import java.util.Objects;

public class Mouse {
	//------fields
	private String mouseBrand;
	private int dpiCount;
	private boolean wireless;

	//-------constructors
	Mouse()
	{
		
	}
	Mouse(String mouseBrand, int dpiCount, boolean wireless )
	{
		this.mouseBrand = mouseBrand;
		this.dpiCount = dpiCount;
		this.wireless = wireless;

	}

	//------setters and getters
	public String getMouseBrand()
	{
		return mouseBrand;
	}
	public void setMouseBrand(String mouseBrand)
	{
		this.mouseBrand=mouseBrand;
	}
	public int getDpiCount()
	{
		return dpiCount;
	}
	public void setDpiCount(int dpiCount)
	{
		this.dpiCount=dpiCount;
	}
	public boolean getWireless()
	{
		return wireless;
	}
	public void setWireless(boolean wireless)
	{
		this.wireless=wireless;
	}

	//------methods
	public void rightClick()
	{
		System.out.println("clicking right button of the mouse");
	}
	public void lefttClick()
	{
		System.out.println("clicking left button of the mouse");
	}
	public void scroll()
	{
		System.out.println("scrolling mouse");
	}
	@Override
	public String toString() {
		return "Mouse "+"\n"+"   mouseBrand=" + mouseBrand +"\n "+ "  dpiCount=" + dpiCount +"\n "+ "  wireless=" + wireless +"\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dpiCount, mouseBrand, wireless);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mouse other = (Mouse) obj;
		return dpiCount == other.dpiCount && Objects.equals(mouseBrand, other.mouseBrand) && wireless == other.wireless;
	}

	
}
