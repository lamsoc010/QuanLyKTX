/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class ThietBi {
    String maTB, tenTB, tinhTrang, ghiChu, maQL;
    int soLuong, maPhong;
    Date ngayBanGiao, ngayKiemTra;

    public ThietBi() {
    }

    public ThietBi(String maTB, String tenTB, String tinhTrang, String ghiChu, String maQL, int soLuong, int maPhong, Date ngayBanGiao, Date ngayKiemTra) {
        this.maTB = maTB;
        this.tenTB = tenTB;
        this.tinhTrang = tinhTrang;
        this.ghiChu = ghiChu;
        this.maQL = maQL;
        this.soLuong = soLuong;
        this.maPhong = maPhong;
        this.ngayBanGiao = ngayBanGiao;
        this.ngayKiemTra = ngayKiemTra;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getMaTB() {
        return maTB;
    }

    public void setMaTB(String maTB) {
        this.maTB = maTB;
    }

    public String getTenTB() {
        return tenTB;
    }

    public void setTenTB(String tenTB) {
        this.tenTB = tenTB;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public Date getNgayBanGiao() {
        return ngayBanGiao;
    }

    public void setNgayBanGiao(Date ngayBanGiao) {
        this.ngayBanGiao = ngayBanGiao;
    }

    public Date getNgayKiemTra() {
        return ngayKiemTra;
    }

    public void setNgayKiemTra(Date ngayKiemTra) {
        this.ngayKiemTra = ngayKiemTra;
    }
    
    
}
