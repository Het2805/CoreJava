package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.Student;
import com.util.StudentUtil;

public class StudentDao {
	
	public static void insertStudent(Student s)
	{
		try {
			Connection conn=StudentUtil.createConnection();
			String sql="insert into stu(Fname,lname,Email,Mobile,Address) values(?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setLong(4, s.getMobile());
			pst.setString(5, s.getAddress());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
