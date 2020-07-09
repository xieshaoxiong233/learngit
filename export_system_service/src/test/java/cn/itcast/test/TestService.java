package cn.itcast.test;

import cn.itcast.service.company.CompanyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath*:spring/applicationContext_*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestService {

	@Autowired
	CompanyService companyService;

	@Test
	public void test(){
		System.out.println(companyService.finAll().size());
	}

}
