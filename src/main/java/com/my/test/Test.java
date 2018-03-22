package com.my.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

public class Test {
	public static void main(String[] args) {
		DataSource ds = PoolFactory.getDS();
		try {
			Connection conn = ds.getConnection();
			Book book = new QueryRunner().query(conn,"select * from book where bookId=3",new BeanHandler<Book>(Book.class));
			System.out.println(book);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
