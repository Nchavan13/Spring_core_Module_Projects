package com.niltech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niltech.bo.EmployeeBO;

@Repository("repo")
public class EmployeeDAOImpl implements IEmployeedao {
	
	private static final String EMP_INSERT_QUERY = "INSERT INTO REALTIMEDI_SPRING_EMPLOYEE (ename, desg, basicSalary, grossSalary, netSalary) VALUES(?,?,?,?,?)";
	
	@Autowired
	private DataSource ds;
	
	
	
	public int insertEmployee(EmployeeBO bo) throws Exception {
		System.out.println("EmployeeDAOImpl::insertEmployee()");

		int result = 0;

		try (Connection con = ds.getConnection();

				PreparedStatement ps = con.prepareStatement(EMP_INSERT_QUERY, PreparedStatement.RETURN_GENERATED_KEYS);

		) {

			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());
			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

		return result;

	}
	
	
}
	
	
/*
	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {

		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			// get pooled JDBC con object
			con = ds.getConnection();
			ps = con.prepareStatement(EMP_INSERT_QUERY);
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(4, bo.getNetSalary());
			result = ps.executeUpdate();

		} catch (SQLException sq) {
			sq.printStackTrace();
			throw sq;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
//			close the connection
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}

		}

		return result;
	}*/


