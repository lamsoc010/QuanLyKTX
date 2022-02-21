/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.ThietBiDao;
import java.util.List;
import modal.ThietBi;

/**
 *
 * @author Admin
 */
public class ThietBiService {
    ThietBiDao thietBiDao;

    public ThietBiService() {
        thietBiDao = new ThietBiDao();
    }
    
    public List<ThietBi> getAllThietBis() {
        return thietBiDao.getAllThietBis();
    }
    
    public ThietBi getTBByMaTB(String maTB) {
        return thietBiDao.getTBByMaTB(maTB);
    }
    
    public void insertThietBi(ThietBi tB) {
        thietBiDao.insertThietBi(tB);
    }
    
    public void updateThietBi(ThietBi tB) {
        thietBiDao.updateThietBi(tB);
    }
}
