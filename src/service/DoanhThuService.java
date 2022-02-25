/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.DoanhThuDao;
import java.util.List;
import modal.DoanhThu;

/**
 *
 * @author Admin
 */
public class DoanhThuService {
    DoanhThuDao doanhThuDao;

    public DoanhThuService() {
        doanhThuDao = new DoanhThuDao();
    }
    
    public List<DoanhThu> getAllDoanhThus() {
        return doanhThuDao.getAllDoanhThus();
    }
    
    public DoanhThu getDoanhThuByMPAndThang(int maPhong, int thang) {
        return doanhThuDao.getDoanhThuByMPAndThang(maPhong, thang);
    }
    
    public void insertDoanhThu(DoanhThu dt) {
        doanhThuDao.insertDoanhThu(dt);
    }
    
    public void updateDoanhThu(DoanhThu dt) {
        doanhThuDao.updateDoanhThu(dt);
    }
}
