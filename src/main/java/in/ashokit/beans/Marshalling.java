package in.ashokit.beans;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import in.ashokit.beans.Address.Address;

public class Marshalling
{
	public static void main(String[] args) throws JAXBException
	{
		Address address = new Address();
		address.setCity("Banagalore");
		address.setCountry("India");
		address.setPinCode(123456);
		
		
		Student s1 = new Student();
		s1.setStudentId(11111);
		s1.setStudentRank(5);
		s1.setStudentName("Ashok");
		s1.setStudnetMarks(1011);
		s1.setAddress(address);

		JAXBContext context = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(s1, System.out);
		
		
		
		
	}

}
