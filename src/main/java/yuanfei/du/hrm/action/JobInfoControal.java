package yuanfei.du.hrm.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import yuanfei.du.hrm.entity.Job_inf;
import yuanfei.du.hrm.service.JobService;

@Controller
@RequestMapping("jobInfo")
public class JobInfoControal {
	@Autowired
	private JobService jobService;
	
	@RequestMapping("/queryAllJobs")
	public @ResponseBody List<Job_inf> queryAllJobs(){
		return jobService.queryAllJobs();
	}
}
