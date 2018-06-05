package yuanfei.du.hrm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import yuanfei.du.hrm.dao.mapper.Job_infMapper;
import yuanfei.du.hrm.entity.Job_inf;

@Repository
public class JobDao {
	@Autowired
	private Job_infMapper job_infMapper;
	
	public List<Job_inf> queryAllJobs(){
		job_infMapper.selectByPrimaryKey(1);
		List<Job_inf> rtn = job_infMapper.queryAllJobs();
		return rtn;
	}
}
