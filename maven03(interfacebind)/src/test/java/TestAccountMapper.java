import gyr.study.ssm.mapper.AccountMapper;
import gyr.study.ssm.mapper.TeacherMapper;
import gyr.study.ssm.pojo.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestAccountMapper {

    private SqlSession sqlSession;
    private AccountMapper accountMapper;
    @Before
    public void innit() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        accountMapper = sqlSession.getMapper(AccountMapper.class);
    }

    @Test
    public void testSelectAll(){
        System.out.println(accountMapper.selectAll());
    }

    @Test
    public void testSelectByName(){
        System.out.println(accountMapper.selectByName("aaa"));
    }

    @Test
    public void testSelectByIdName(){
        //条件全部为空或为null，返回值变为list集合，接口方法可以考虑返回值为集合
        System.out.println(accountMapper.selectByIdName(1, "aaa"));
    }
}
