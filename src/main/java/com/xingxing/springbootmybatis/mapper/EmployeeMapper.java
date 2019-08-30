package com.xingxing.springbootmybatis.mapper;

import com.xingxing.springbootmybatis.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);
    public void insertEmp(Employee employee);
}
