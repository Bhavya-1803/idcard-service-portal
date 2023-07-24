package com.myprojects.idcardservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(name="e_no")
private int e_no;
@Column(name="e_name")
private String e_name;
@Column(name="e_password")
private String e_password;
@Column(name="e_location")
private String e_location;
@Column(name = "psa_code")
private String psa_code;
@Column(name = "e_design")
private String e_design;
@Column(name = "grade")
private String grade;
@Column(name="role")
private String role;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "idCard_no", referencedColumnName = "id_no")
private IdCard idCardNo;

    public Employee() {
    }

    public Employee(int e_no, String e_name, String e_password, String e_location, String psa_code, String e_design, String grade, String role) {
        this.e_no = e_no;
        this.e_name = e_name;
        this.e_password = e_password;
        this.e_location = e_location;
        this.psa_code = psa_code;
        this.e_design = e_design;
        this.grade = grade;
        this.role = role;
    }

    public int getE_no() {
        return e_no;
    }

    public void setE_no(int e_no) {
        this.e_no = e_no;
    }

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public String getE_password() {
        return e_password;
    }

    public void setE_password(String e_password) {
        this.e_password = e_password;
    }

    public String getE_location() {
        return e_location;
    }

    public void setE_location(String e_location) {
        this.e_location = e_location;
    }

    public String getPsa_code() {
        return psa_code;
    }

    public void setPsa_code(String psa_code) {
        this.psa_code = psa_code;
    }

    public String getE_design() {
        return e_design;
    }

    public void setE_design(String e_design) {
        this.e_design = e_design;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
