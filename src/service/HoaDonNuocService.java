/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.HoaDonNuocDao;
import modal.HoaDonNuoc;

/**
 *
 * @author Admin
 */
public class HoaDonNuocService {
    HoaDonNuocDao hoaDonNuocDao;

    public HoaDonNuocService() {
        hoaDonNuocDao = new HoaDonNuocDao();
    }
    
    private HoaDonNuoc getTienNuocByMaHD(String maHD) {
        return hoaDonNuocDao.getTienNuocByMaHD(maHD);
    }
    
}
