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
public class SinhVien {

    private String maSV, tenSV, email, maLop, avatar;
    private LocalDate dob;
    private String gender;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, LocalDate dob, String email, String maLop, String avatar, String gender) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.dob = dob;
        this.email = email;
        this.maLop = maLop;
        this.avatar = avatar;
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
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

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
