package com.practice.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.practice.springboot.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	public Department findByDepartmentName(String departmentName);
}
