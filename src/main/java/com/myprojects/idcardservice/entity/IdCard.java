package com.myprojects.idcardservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "idcarddetails")
public class IdCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_no;
    @Column(name = "e_no")
    private int e_no;
    @Column(name = "blood_group")
    private String blood_group;
    @Column(name = "e_pic")
    private String e_pic;
    @Column(name = "img")
    private byte[] img;
    @Column(name = "e_sign")
    private String e_sign;
    @Column(name = "sign_img")
    private byte[] sign_img;
    @OneToOne(mappedBy = "idCardNo")
    private Employee employee;
}
