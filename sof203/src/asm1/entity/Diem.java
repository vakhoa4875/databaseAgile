/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package asm1.entity;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Diem {
    private String maSV, maMon;
    private Double diem;

    public Diem() {
    }

    public Diem(String maSV, String maMon, Double diem) {
        this.maSV = maSV;
        this.maMon = maMon;
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = (diem > 10) ? 10 : (diem < 0) ? 0 : diem;
    }
    
}
