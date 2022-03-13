/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import BEANS.HoaDonDien;
import BEANS.HoaDonNuoc;

/**
 *
 * @author Admin
 */
public class HoaDonNuocDao {
    Connection conn;
    
    public HoaDonNuoc getTienNuocByMaHD(String maHD){
        conn = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM HOADONNUOC WHERE MAHD = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maHD);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                HoaDonNuoc hDN = new HoaDonNuoc();
                hDN.setMaHDN(rs.getString(1));
                hDN.setMaPhong(rs.getInt(2));
                hDN.setThang(rs.getInt(3));
                hDN.setSoCu(rs.getInt(4));
                hDN.setSoMoi(rs.getInt(5));
                hDN.setDonGia(rs.getFloat(6));
                hDN.setThanhTien(rs.getFloat(7));
                hDN.setMaHD(rs.getString(8));
                
                return hDN;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
