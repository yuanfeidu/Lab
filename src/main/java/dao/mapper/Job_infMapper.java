package dao.mapper;

import entity.Job_inf;

public interface Job_infMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Job_inf record);

    int insertSelective(Job_inf record);

    Job_inf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Job_inf record);

    int updateByPrimaryKey(Job_inf record);
}