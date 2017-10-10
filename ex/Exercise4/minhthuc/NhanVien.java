package Excercise_4;

import java.util.Collections;
import java.util.Comparator;

/**
 * Created by minht on 4/27/2017.
 */
public class NhanVien implements Comparable<NhanVien>, Comparator<NhanVien>{
    private String maSV;
    private String tenNV;
    private int soSP;
    private long luong;

    public NhanVien(String maSV, String tenNV) {
        this.maSV = maSV;
        this.tenNV = tenNV;
    }
    public NhanVien(){}

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    @Override
    public int compareTo(NhanVien o) {
        return this.soSP-o.getSoSP();
    }

    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        return o1.getSoSP()-o2.getSoSP();
    }
}