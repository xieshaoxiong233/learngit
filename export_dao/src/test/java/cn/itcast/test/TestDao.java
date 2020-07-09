package cn.itcast.test;

import cn.itcast.dao.company.CompanyDao;
import cn.itcast.domain.company.Company;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestDao {
	@Test
	public void testDao() throws IOException {
		InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession sqlSession = factory.openSession();

		CompanyDao companyDao = sqlSession.getMapper(CompanyDao.class);
		List<Company> list = companyDao.findAll();
		System.out.println(list.size());

		sqlSession.commit();
		sqlSession.close();
	}
}
