package com.flp.ems.domain;

public class Employee {

private int empid;
private String kinid;
private  String empname;
private String mail;
private String phoneNo;
private String address;
private String dob;
private String doj;
private Department department;
private Project project;
private Role role;

public int getEmpid() {
	return empid;
	}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}

public String getKinid() {
	return kinid;
}
public void setKinid(String kinid) {
	this.kinid = kinid;
}
public String getPhonNo() {
	return phoneNo;
}
public void setPhoneNo(String phno) {
	this.phoneNo = phno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getDoj() {
	return doj;
}
public void setDoj(String doj) {
	this.doj = doj;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public Project getProject() {
	return project;
}
public void setProject(Project project) {
	this.project = project;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}
@Override
public String toString() {
	return "Employee [kinid=" + kinid +",empid=" + empid + ", empname=" + empname + ", mail=" + mail + ", phoneNo=" + phoneNo + ", address="
			+ address + ", dob=" + dob + ", doj=" + doj + ", department=" + department + ", project=" + project
			+ ", role=" + role + "]\n";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (empname == null) {
		if (other.empname != null)
			return false;
	} else if (!empname.equals(other.empname))
		return false;
	if (kinid == null) {
		if (other.kinid != null)
			return false;
	} else if (!kinid.equals(other.kinid))
		return false;
	return true;
}




}
