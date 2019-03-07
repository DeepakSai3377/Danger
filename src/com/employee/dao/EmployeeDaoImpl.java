package com.employee.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.employee.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	@Override
	public List<Employee> getAll() {
		 String sql="select * from emp";
		return this.jdbcTemplate.query( sql, new EmployeeMapper());
		
	}

	@Override
	public boolean insert(Employee e) {
		String query="insert into emp values(?,?,?,?,?,?,?)";
		 
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
		    @Override  
		    public Boolean doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		        ps.setInt(1,e.getEmpid());  
		        ps.setString(2,e.getEname());  
		        ps.setString(3,e.getJob());  
		        ps.setInt(4, e.getMgr());
		        ps.setInt(5,e.getSal());
		        ps.setInt(6,e.getComm());
		        ps.setInt(7, e.getDeptno());
		        return ps.execute();  
		    }          
		    });

		
	}

	@Override
	public boolean delete(int empId) {
		String SQL = "delete from emp where empnum = "+empId;
	      this.jdbcTemplate.update(SQL);
		return true;
		
	}

	@Override
	public boolean update(Employee e) {
		String updateQuery = "update emp set sal = ? where empnum = ?";
		this.jdbcTemplate.update(updateQuery, e.getSal(), e.getEmpid());
	return true;
	}

	@Override
	public double getMaxSalary() {
		String sql="select * from emp";
		List<Employee> eList= this.jdbcTemplate.query( sql, new EmployeeMapper());
		
		double max=eList.stream().map(e->e.getSal()).max((x,y)->x.compareTo(y)).get();
		return max;
	}

	@Override
	public List<String> getEmployeeWithoutCommission() {
		String sql="select * from emp";
		List<Employee> eList= this.jdbcTemplate.query( sql, new EmployeeMapper());
		List<String> list=eList.stream().filter(e->e.getComm()==0 ).map(e->e.getEname()).collect(Collectors.toList());
		
		return list;
	}

	@Override
	public Map<Integer, Long> getNoOfEmpDeptWise() {
		List<Employee> list=getAll();
		Map<Integer,Long> deptList=list.stream().collect(Collectors.groupingBy(Employee::getDeptno,Collectors.counting()));
		return deptList;
	}
	
	

}
