package yuanfei.du.hrm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yuanfei.du.hrm.dao.JobDao;
import yuanfei.du.hrm.entity.Job_inf;
import yuanfei.du.hrm.service.JobService;

@Service
public class JobServiceImpl implements JobService {
	
	@Autowired
	private JobDao jobdao;
	
	@Override
	public List<Job_inf> queryAllJobs() {
		return jobdao.queryAllJobs();
	}

}
