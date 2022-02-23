/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modal.ThietBi;

/**
 *
 * @author Admin
 */
public class ThietBiDao {
    Connection conn;
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    public List<ThietBi> getAllThietBis() {
        List<ThietBi> listTB = new ArrayList<ThietBi>();
        conn = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM THIETBI";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                ThietBi tB = new ThietBi();
                tB.setMaTB(rs.getString(1));
                tB.setTenTB(rs.getString(2));
                tB.setSoLuong(rs.getInt(3));
                tB.setTinhTrang(rs.getString(4));
                tB.setGhiChu(rs.getString(5));
                tB.setNgayBanGiao(rs.getDate(6));
                tB.setNgayKiemTra(rs.getDate(7));
                tB.setMaPhong(rs.getInt(8));
                tB.setMaQL(rs.getString(9));
                
                listTB.add(tB);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listTB;
    }
    
    public ThietBi getTBByMaTB(String maTB) {
        conn = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM THIETBI WHERE MATB = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maTB);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                ThietBi tB = new ThietBi();
                
                tB.setMaTB(rs.getString(1));
                tB.setTenTB(rs.getString(2));
                tB.setSoLuong(rs.getInt(3));
                tB.setTinhTrang(rs.getString(4));
                tB.setGhiChu(rs.getString(5));
                tB.setNgayBanGiao(rs.getDate(6));
                tB.setNgayKiemTra(rs.getDate(7));
                tB.setMaPhong(rs.getInt(8));
                tB.setMaQL(rs.getString(9));
                
                return tB;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public void insertThietBi(ThietBi tB) {
        conn = JDBCConnection.getJDBCConnection();
        String sql = "INSERT INTO THIETBI VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tB.getMaTB());
            ps.setString(2, tB.getTenTB());
            ps.setInt(3, tB.getSoLuong());
            ps.setString(4, tB.getTinhTrang());
            ps.setString(5, tB.getGhiChu());
            ps.setString(6, df.format(tB.getNgayBanGiao()));
            ps.setString(7, df.format(tB.getNgayKiemTra()));
            ps.setInt(8, tB.getMaPhong());
            ps.setString(9, tB.getMaQL());
            
            int rs = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void updateThietBi(ThietBi tB) {
        conn = JDBCConnection.getJDBCConnection();
        String sql = "UPDATE THIETBI SET TENTB = ?, SOLUONG = ?, TINHTRANG = ?, GHICHU = ?, NGAYBANGIAO = ?, NGAYKIEMTRA = ?, MAQL = ?"
                + " WHERE MATB = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tB.getTenTB());
            ps.setInt(2, tB.getSoLuong());
            ps.setString(3, tB.getTinhTrang());
            ps.setString(4, tB.getGhiChu());
            ps.setString(5, df.format(tB.getNgayBanGiao()));
            ps.setString(6, df.format(tB.getNgayKiemTra()));
            ps.setString(7, tB.getMaQL());
            ps.setString(8, tB.getMaTB());
            
            int rs = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
