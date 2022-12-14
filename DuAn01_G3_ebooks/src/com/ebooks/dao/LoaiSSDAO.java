/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ebooks.dao;

import com.ebooks.helper.JdbcHelper;
import com.ebooks.model.LoaiSS;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class LoaiSSDAO {

    private LoaiSS readFromResultSet(ResultSet rs) throws SQLException {
        LoaiSS model = new LoaiSS();
        model.setMaLoaiSS(rs.getString("maLoaiSS"));
        model.setMaSach(rs.getString("maSach"));
        model.setMaTheLoai(rs.getString("maTheLoai"));
        return model;
    }

    private List<LoaiSS> select(String sql, Object... args) {
        List<LoaiSS> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    list.add(readFromResultSet(rs));
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
        return list;
    }

    /**
     * Thêm mới thực thể vào CSDL
     *
     * @param entity là thực thể chứa thông tin bản ghi mới
     */
    public void insert(LoaiSS entity) {
        String sql = "INSERT INTO LoaiSS ( MaSach, MaTheLoai) VALUES (?, ?)";
        JdbcHelper.executeUpdate(sql,
                entity.getMaSach(),
                entity.getMaTheLoai());
    }

    /**
     * Cập nhật thực thể vào CSDL
     *
     * @param entity là thực thể chứa thông tin bản ghi cần cập nhật
     */
    public void update(LoaiSS entity) {
        String sql = "UPDATE LoaiSS SET MaSach=?, MaTheLoai=? WHERE MaLoaiSS=?";
        JdbcHelper.executeUpdate(sql,
                entity.getMaSach(),
                entity.getMaTheLoai(),
                entity.getMaLoaiSS());
    }

    /**
     * Xóa bản ghi khỏi CSDL
     *
     * @param id là mã của bản ghi cần xóa
     */
    public void delete(String id) {
        String sql = "DELETE FROM LoaiSS WHERE MaLoaiSS=?";
        JdbcHelper.executeUpdate(sql, id);
    }

    /**
     * Truy vấn tất cả các các thực thể
     *
     * @return list danh sách các thực thể
     */
    public List<LoaiSS> selectAll() {
        String sql = "SELECT * FROM LoaiSS";
        return select(sql);
    }

    /**
     * Truy vấn thực thể theo mã id
     *
     * @param id là mã của bản ghi được truy vấn
     * @return thực thể chứa thông tin của bản ghi
     */
    public LoaiSS findById(String id) {
        String sql = "SELECT * FROM LoaiSS WHERE MaLoaiSS=?";
        List<LoaiSS> list = select(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }
    
    public LoaiSS findByBook(String idBooks) {
        String sql = "SELECT * FROM LoaiSS WHERE maSach=?";
        List<LoaiSS> list = select(sql, idBooks);
        return list.size() > 0 ? list.get(0) : null;
    }
}
