/**
 * Person class. This is the super class
 * @author Jon Mosco
 *
 */

public class Person {
	
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String emailAddr;
	
	// person constructor
	Person() {
	}

	// set name
	public void setName(String name) {
		this.name = name;
		// System.out.println(name);
	}
	
	public String getName() {
		return name;
	}

	public Person(String name, String address, String phoneNumber, String emailAddr) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddr = emailAddr;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	/**
	 * toString method.  To be overwritten from all subclasses
	 */
	public String toString() {
		//return getClass().getName() + "\n" + name;
		//return "Person";
		return "Class: " + getClass() + "\n" + "Name: " + name;
	}

}

/**
 * Student class extends the Person class
 * @author Jon Mosco
 *
 */
class Student extends Person {

	public final String CLASS_STATUS;
	
	/**
	 * Counter for object instances
	 */
	static int count = 0;
	
	public static int getCount() {
		return count;
	}
	
	public Student(String name, String address, String phone, String email, String CLASS_STATUS) {
		super(name, address, phone, email);
		this.CLASS_STATUS = CLASS_STATUS;
		count +=1;
	}
	
	/**
	 * Override the toString() from he super class Person
	 */
	@Override
	public String toString() {
		return super.toString();
	}

}

/*
 * Employee class extends Person super class
 */
class Employee extends Person {
	
	protected String office;
	protected double salary;
	protected String dateHired;
	
	public Employee() {
	}
	
	public Employee(String name, String address, String phone, String email) {
		super(name, address, phone, email);
	}

	
	public Employee(String office, double salary, String dateHired){
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	
	
	/**
	 * Override the toString() from he super class Person
	 */
	@Override
	public String toString() {
		return super.toString();
	}

}

/**
 * Faculty class extends Employee class
 * @author jmosco
 *
 */

class Faculty extends Employee {

	public int officeHours;
	public int rank;

}

class Staff extends Employee {
	
	public String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Override the toString() from he super class Person
	 */
	@Override
	public String toString() {
		return super.toString();
	}

}