package model;

public class Seat {
//private Long id;
private String deskNumber;
private String location;
private String empId;
private String empName;
 

public Seat(String deskNumber, String location, String empId, String empName) {
	super();
	this.deskNumber = deskNumber;
	this.location = location;
	this.empId = empId;
	this.empName = empName;
}
/*public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}*/
public String getDeskNumber() {
	return deskNumber;
}
public void setDeskNumber(String deskNumber) {
	this.deskNumber = deskNumber;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}

}
