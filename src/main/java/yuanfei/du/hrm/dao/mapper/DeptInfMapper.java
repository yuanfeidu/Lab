package yuanfei.du.hrm.dao.mapper;

import yuanfei.du.hrm.entity.DeptInf;

public interface DeptInfMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeptInf record);

    int insertSelective(DeptInf record);

    DeptInf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeptInf record);

    int updateByPrimaryKey(DeptInf record);
}