package ConstrructorofEmployee;

import java.lang.reflect.Constructor;

public class Address {
	String socityName, Area;
	int pincode;
	
	//no parameter wise constructor
	public Address() {
		socityName = "xyz";
		Area = "erty";
		pincode = 345;
	}
	
	//parameter wise constructor
	public Address(String socityName, String area, int pincode) {
		super();
		this.socityName = socityName;
		Area = area;
		this.pincode = pincode;
	}
	
	public String getSocityName() {
		return socityName;
	}
	public void setSocityName(String socityName) {
		this.socityName = socityName;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [socityName=" + socityName + ", Area=" + Area + ", pincode=" + pincode + "]";
	}
	
	
	
}
