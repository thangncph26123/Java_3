package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Grade;
import utils.JdbcUtil;

public class GradeRepository {

    public List<Grade> getAll() {
        List<Grade> list = new ArrayList<>();
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "select * from grade \n"
                    + "order by (Tienganh + Tinhoc + GDTC) / 3 desc";

            PreparedStatement ps = cn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Grade(rs.getInt(1), 
                        rs.getString(2), 
                        rs.getFloat(3), 
                        rs.getFloat(4), 
                        rs.getFloat(5)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public String findNameByMaSV(String ma) {
        String hoTen = "";
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "SELECT B.Hoten from GRADE A INNER JOIN STUDENTS B ON A.MASV = B.MASV WHERE A.MASV = ?";

            PreparedStatement ps = cn.prepareStatement(query);

            ps.setString(1, ma);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                hoTen = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hoTen;
    }

    public Grade findGradeByMaSV(String ma) {
        Grade g = null;
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "SELECT * FROM GRADE WHERE MASV = ?";

            PreparedStatement ps = cn.prepareStatement(query);//tạo đối tượng cbi thực thi câu sql

            ps.setString(1, ma);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                g = new Grade(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getFloat(4), rs.getFloat(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return g;
    }

    public int findStudentByMaSV(String ma) {
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "SELECT Hoten FROM STUDENTS WHERE MASV = ?";

            PreparedStatement ps = cn.prepareStatement(query);

            ps.setString(1, ma);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void insert(Grade g) {
        try {
            Connection cn = JdbcUtil.getConnection();
            String query = "INSERT INTO GRADE (MASV, Tienganh, Tinhoc, GDTC) VALUES (?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, g.getMasv());
            ps.setFloat(2, g.getTiengAnh());
            ps.setFloat(3, g.getTinHoc());
            ps.setFloat(4, g.getGdtc());

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(String ma, Grade g) {
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "UPDATE GRADE SET Tienganh = ?, Tinhoc = ?, GDTC = ? WHERE MASV = ?";

            PreparedStatement ps = cn.prepareStatement(query);
            ps.setFloat(1, g.getTiengAnh());
            ps.setFloat(2, g.getTinHoc());
            ps.setFloat(3, g.getGdtc());
            ps.setString(4, ma);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(String ma) {
        try {
            Connection cn = JdbcUtil.getConnection();

            String query = "DELETE FROM GRADE WHERE MASV = ?";

            PreparedStatement ps = cn.prepareStatement(query);

            ps.setString(1, ma);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
