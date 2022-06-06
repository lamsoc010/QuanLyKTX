/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import BEANS.QuanLy;
import java.sql.Connection;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class QuanLyDaoTest {
    
    public QuanLyDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
//Get All QuanLy
    @Test
    public void testGetAllQuanLysIsTrue() {
        System.out.println("getAllQuanLys");
        QuanLyDao qLD = new QuanLyDao();
        List<QuanLy> qL = null;
        List<QuanLy> result = qLD.getAllQuanLys();
        assertNotNull(result);
        assertEquals(7, result.size());
    }
    
    @Test
    public void testGetAllQuanLysIsFalse() {
        System.out.println("getAllQuanLys");
        QuanLyDao qLD = new QuanLyDao();
        List<QuanLy> qL = null;
        List<QuanLy> result = qLD.getAllQuanLys();
        assertNotNull(result);
        assertNotEquals(2, result.size());
    }

//  Update QuanLy
    @Test
    public void testUpdateQuanLy() {
        System.out.println("updateQuanLy");
        QuanLyDao qLD = new QuanLyDao();
        QuanLy sQL = qLD.getQuanLyByMaQL("QL004");
        Connection conn = JDBCConnection.getJDBCConnection();
        try {
            conn.setAutoCommit(false);
            String hoTen = "new ju test";
            String sdt = "0111111111";
            String diaChi = "new diaChi";
            String phuTrach = "new phuTrach";
            String trangThai = "new trangThai";
            sQL.setHoTen(hoTen);
            sQL.setSdt(sdt);
            sQL.setDiaChi(diaChi);
            sQL.setPhuTrach(phuTrach);
            sQL.setTrangThai(trangThai);
            qLD.updateQuanLy(sQL);
            
//            //test the new updated row
            QuanLy qL = qLD.getQuanLyByMaQL(sQL.getMaQL());
            assertEquals(hoTen, qL.getHoTen());
            assertEquals(sdt, qL.getSdt());
            assertEquals(diaChi, qL.getDiaChi());
            assertEquals(phuTrach, qL.getPhuTrach());
            assertEquals(trangThai, qL.getTrangThai());

        } catch (Exception e) {
        }
    }
    
//  Insert QuanLy
    @Test
    public void testInsertQuanLy() {
        System.out.println("insertQuanLy");
        QuanLyDao qLD = new QuanLyDao();
        QuanLy sQL = new QuanLy("QL006", "", "Trần Vĩnh Lãm", "0981059062", "Phú Hải, Phú Vang", "Kỷ luật", "123123123", "Đang làm");
        Connection con = JDBCConnection.getJDBCConnection();
        try {
            con.setAutoCommit(false);
            qLD.insertQuanLy(sQL);
            assertNotNull(sQL);
            assertEquals(7, qLD.getAllQuanLys().size());
            
            //test the new inserted row
            QuanLy qL = qLD.getQuanLyByMaQL(sQL.getMaQL());
            assertEquals(sQL.getHoTen(), qL.getHoTen());
            assertEquals(sQL.getSdt(), qL.getSdt());
            assertEquals(sQL.getDiaChi(), qL.getDiaChi());
            assertEquals(sQL.getPhuTrach(), qL.getPhuTrach());
            assertEquals(sQL.getTrangThai(), qL.getTrangThai());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testInsertQuanLyIsEqual() throws Exception{
        System.out.println("insertQuanLy");
        QuanLyDao qLD = new QuanLyDao();
        QuanLy sQL = new QuanLy("QL004", "", "Trần Vĩnh Lãm", "0981059062", "Phú Hải, Phú Vang", "Kỷ luật", "123123123", "Đang làm");
        Connection con = JDBCConnection.getJDBCConnection();
        try {
            con.setAutoCommit(false);
            qLD.insertQuanLy(sQL);
            assertNotNull(sQL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    Find by ID
    @Test
    public void testGetQuanLyByMaQLIsNull() {
        System.out.println("getQuanLyByMaQL");
        QuanLyDao qLD = new QuanLyDao();
        //exception scenario
        String maQL = "QL008";
        QuanLy qL = qLD.getQuanLyByMaQL(maQL);
        assertNull(qL);
    }
    @Test
    public void testGetQuanLyByMaQLIsFalse() {
        System.out.println("getQuanLyByMaQL");
        QuanLyDao qLD = new QuanLyDao();
        //exception scenario
        String maQL = "QL002";
        QuanLy qL = qLD.getQuanLyByMaQL(maQL);
        assertNotNull(qL);
        assertNotEquals("Nguyễn Võ Xuân Đài 1", qL.getHoTen());
    }
    @Test
    public void testGetQuanLyByMaQLIsTrue() {
        System.out.println("getQuanLyByMaQL");
        QuanLyDao qLD = new QuanLyDao();
        //exception scenario
        String maQL = "QL002";
        QuanLy qL = qLD.getQuanLyByMaQL(maQL);
        assertNotNull(qL);
        assertEquals("Nguyễn Võ Xuân Đài", qL.getHoTen());
        assertEquals("0777241999", qL.getSdt());
        assertEquals("Giờ giấc", qL.getPhuTrach());
        assertEquals("Đang làm", qL.getTrangThai());
    }
    
}
