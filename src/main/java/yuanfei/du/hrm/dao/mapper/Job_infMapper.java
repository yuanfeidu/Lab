package yuanfei.du.hrm.dao.mapper;

import java.util.List;

import yuanfei.du.hrm.entity.Job_inf;

public interface Job_infMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Job_inf record);

    int insertSelective(Job_inf record);

    Job_inf selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Job_inf record);

    int updateByPrimaryKey(Job_inf record);

	List<Job_inf> queryAllJobs();
}