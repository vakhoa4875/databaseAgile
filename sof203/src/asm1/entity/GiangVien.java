/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm1.entity;

import java.time.LocalDate;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GiangVien {

    private String maGV, tenGV, email, moTa, maMon, avatar;
    private LocalDate dob;
    private String gender;

    public GiangVien() {
    }

    public GiangVien(String maGV, String tenGV, LocalDate dob, String email, String moTa, String maMon, String avatar, String gender) {
        this.maGV = maGV;
        this.tenGV = tenGV;
        this.dob = dob;
        this.email = email;
        this.moTa = moTa;
        this.maMon = maMon;
        this.avatar = avatar;
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
