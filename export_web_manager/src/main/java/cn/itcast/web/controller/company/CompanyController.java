package cn.itcast.web.controller.company;

import cn.itcast.domain.company.Company;
import cn.itcast.service.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("company")
public class CompanyController {

	@Autowired
	HttpServletRequest request;

	@Autowired
	CompanyService companyService;


	@RequestMapping(value = "list",name = "查询所有的企业")
	public String findAll(){
		System.out.println("查询所有");
		List<Company> list = companyService.finAll();
		request.setAttribute("list",list);
		return "company/company-list";
	}
}
