package com.hcl.SpringData;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface EmployeeRepository extends PagingAndSortingRepository<Employ, Integer> {

	@Query("select e from Employ e where dept=?1 and desig=?2")
	List<Employ>findByDeptAndDesign(String department, String designation);
	
	@Query("select e.name from Employ e where empno = ?1")
	String findNameByDeptAndDesign(int empno);
	
	@Query("select e from Employ e where name like 's%'")
	List<Employ>findByEmployName(String name);
	
	@Query("select e from Employ e where  Basic >=?1")
	List<Employ>findByBasic(int basic);
	
	@Query("select e from Employ e where basic <=?1 and name like 's%'")
	List<Employ>findByBasicAndName(int basic, String name);
	
	@Query("select e from Employ e where dept=?1 ")
	List<Employ>findByDept(String department);
}
