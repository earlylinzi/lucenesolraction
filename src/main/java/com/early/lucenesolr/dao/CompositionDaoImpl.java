package com.early.lucenesolr.dao;

import com.early.lucenesolr.domain.Composition;
import com.mysql.cj.jdbc.PreparedStatement;


import java.awt.print.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CompositionDaoImpl implements CompositionDao{
    public List<Composition> selectCompositionList() {

        //数据库链接
        Connection connection = null;
        // 预编译statement
        java.sql.PreparedStatement preparedStatement = null;
        // 结果集
        ResultSet resultSet = null;
        // 图书列表
        List<Composition> list = new ArrayList();



        try {
            // 加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 连接数据库
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/solr", "root", "root");

            // SQL语句
            String sql = "SELECT * FROM book";
            // 创建preparedStatement
            preparedStatement = connection.prepareStatement(sql);
            // 获取结果集
            resultSet = preparedStatement.executeQuery();
            // 结果集解析
            while (resultSet.next()) {
                Book book = new Book();
//                book.setId(resultSet.getInt("id"));
//                book.setName(resultSet.getString("name"));
//                book.setPrice(resultSet.getFloat("price"));
//                book.setPic(resultSet.getString("pic"));
//                book.setDesc(resultSet.getString("desc"));
//                list.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;








    }
}
