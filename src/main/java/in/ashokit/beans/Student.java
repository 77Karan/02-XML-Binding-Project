package in.ashokit.beans;
import in.ashokit.beans.Address.Address;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student 
{
	@XmlElement(name="name")
	private String studentName;
	@XmlElement(name="id")
	private int studentId;
	@XmlElement(name="rank")
	private int studentRank;
	@XmlAttribute(name="marks")
	private int studnetMarks;
	@XmlElement(name="addrr")
	private Address address;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getStudentRank() {
		return studentRank;
	}
	public void setStudentRank(int studentRank) {
		this.studentRank = studentRank;
	}
	public int getStudnetMarks() {
		return studnetMarks;
	}
	public void setStudnetMarks(int studnetMarks) {
		this.studnetMarks = studnetMarks;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentRank=" + studentRank
				+ ", studnetMarks=" + studnetMarks + ", address=" + address + "]";
	}
	
	
	
	

}
