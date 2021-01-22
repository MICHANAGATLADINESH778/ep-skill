package com.klu.Insert;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.klu.Bean.StudentBean;
import com.klu.Connections.DBUtil;

public class StudentInsert {
	
	public int StudentInsert(StudentBean student) throws ClassNotFoundException,SQLException{
		Connection con=DBUtil.DBConnection();
		PreparedStatement ps_insert=con.prepareStatement("insert into Student values(?,?,?)");
		ps_insert.setInt(1,student.getRegno());
		ps_insert.setString(2,student.getName());
		ps_insert.setString(3,student.getBranch());
		int i=ps_insert.executeUpdate();
		con.close();
		return i;
	}

}