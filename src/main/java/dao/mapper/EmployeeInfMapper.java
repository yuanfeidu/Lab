package dao.mapper;

import entity.EmployeeInf;

public interface EmployeeInfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeInf record);

    int insertSelective(EmployeeInf record);

    EmployeeInf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeInf record);

    int updateByPrimaryKey(EmployeeInf record);
}