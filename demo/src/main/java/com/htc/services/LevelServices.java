/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.htc.services;
import com.htc.pojo.Category;
import com.htc.pojo.Level;
import com.htc.utils.MyConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class LevelServices extends BaseServices<Level>{

    @Override
    public PreparedStatement getStm(Connection conn) throws SQLException {
        return conn.prepareCall("select * from level");
    }

    @Override
    public List<Level> getResults(ResultSet rs) throws SQLException {
        List<Level> levels = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String note = rs.getString("note");
            Level c = new Level(id, name, note);
            levels.add(c);
        }
        return levels;
    }
    
}
