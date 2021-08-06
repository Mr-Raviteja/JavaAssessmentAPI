package com.assessment.Employee.entities;

import javax.persistence.*;

@Entity
@Table(name = "employeedetails")
public class EmployeeDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EmpId")
    private Long empId;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "Mobile", nullable = true)
    private String mobile;
    @Column(name = "Email")
    private String emailAddress;
    @Column(name = "Password")
    private String password;
    @Column(name = "PostCode", nullable = true)
    private String postCode;
    @Column(name = "City", nullable = true)
    private String city;
    @Column(name = "Country", nullable = true)
    private String country;

    public EmployeeDetailsEntity() {
    }

    public EmployeeDetailsEntity(String firstName, String lastName, String mobile, String emailAddress, String password, String postCode, String city, String country) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.emailAddress = emailAddress;
        this.password = password;
        this.postCode = postCode;
        this.city = city;
        this.country = country;
    }

  /*  public Long getId() {
        return id;
    }*/

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "EmployeeDetailsEntity{" +
                // "id=" + id +
                ", empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", postCode='" + postCode + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
