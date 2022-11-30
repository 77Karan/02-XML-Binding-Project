package in.ashokit.beans.Address;
import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
public class Address 
{
	@XmlElement(name="mycity")
	private String city;
	@XmlAttribute(name="justpin")
	private Integer pinCode;
	private String country;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	

}
