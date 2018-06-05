package yuanfei.du.hrm.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import yuanfei.du.hrm.service.S3Service;

@Controller
public class TT {
	@Autowired
	private List<S3Service> list;
	
	@RequestMapping("testAA")
	public void tt(){
		for (S3Service s3Service : list) {
			s3Service.save();
		}
	}
}
