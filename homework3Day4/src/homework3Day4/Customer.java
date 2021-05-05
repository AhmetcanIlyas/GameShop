package homework3Day4;

import java.time.LocalDate;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate birthOfDay;
	private String nationalatyId;
	public Customer(int id, String firstName, String lastName, LocalDate birthOfDay, String nationalatyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDay = birthOfDay;
		this.nationalatyId = nationalatyId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthOfDay() {
		return birthOfDay;
	}
	public void setBirthOfDay(LocalDate birthOfDay) {
		this.birthOfDay = birthOfDay;
	}
	public String getNationalatyId() {
		return nationalatyId;
	}
	public void setNationalatyId(String nationalatyId) {
		this.nationalatyId = nationalatyId;
	}
}
