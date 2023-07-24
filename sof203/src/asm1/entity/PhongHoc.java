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
public class PhongHoc {
    private String maPhong, maLop, maGV, lichHoc;
    private LocalDate start_date, end_date;
    //lichHoc must follow syntax: "ca <ca> <buoihoc>" ex: "ca 12 246"

    public PhongHoc() {
    }

    public PhongHoc(String maPhong, String maLop, String maGV, String lichHoc, LocalDate start_date, LocalDate end_date) {
        this.maPhong = maPhong;
        this.maLop = maLop;
        this.maGV = maGV;
        this.lichHoc = lichHoc;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getLichHoc() {
        return lichHoc;
    }

    public void setLichHoc(String lichHoc) {
        this.lichHoc = lichHoc;
    }
    
    
}
