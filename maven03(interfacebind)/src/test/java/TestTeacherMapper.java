import gyr.study.ssm.mapper.TeacherMapper;
import gyr.study.ssm.pojo.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestTeacherMapper {

    private SqlSession sqlSession;
    private SqlSession sqlSession1;
    private TeacherMapper teacherMapper;
    private TeacherMapper teacherMapper1;
    @Before
    public void innit() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        sqlSession1 = sqlSessionFactory.openSession();
        System.out.println(sqlSession);
        System.out.println(sqlSession1);
        teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        teacherMapper1 = sqlSession1.getMapper(TeacherMapper.class);
    }

    @Test
    public void testSelectAll(){
        System.out.println(teacherMapper.selectAll());
    }

    @Test
    public void testSelectByName(){
        System.out.println(teacherMapper.selectByName("老师1"));
        //必须提交才能保证二级缓存生效
        sqlSession.commit();
        System.out.println(teacherMapper1.selectByName("老师1"));
    }

    @Test
    public void  testSelectByTeacher(){
        Teacher teacher = new Teacher(1,"老师1");
        System.out.println(teacherMapper.selectByTeacher(teacher));
    }

    @Test
    public void testSelectByMap(){
        Map<String,Object> condition = new HashMap<>();
        condition.put("id",1);
        condition.put("name","老师1");
        System.out.println(teacherMapper.selectByMap(condition));
    }

    @Test
    public void  testSelectByCondition(){
        System.out.println(teacherMapper.selectByCondition3(1,"老师1"));
    }

    @Test
    public void  testSelectByCondition2(){
        System.out.println(teacherMapper.selectByCondition3(2,"老师2"));
    }

    @Test
    public void  testSelectByCondition3(){
        System.out.println(teacherMapper.selectByCondition3(-1,""));
    }

    @Test
    public void testSelectByIdName(){
        System.out.println(teacherMapper.selectByIdName(null, ""));
    }

    @Test
    public void testInsertTeacher(){
        System.out.println(teacherMapper.insertTeacher(new Teacher(4, "老师4")));
    }

    @Test
    public void testUpdateTeacher(){
        System.out.println(teacherMapper.updateTeacher(new Teacher(3, "张三丰")));
    }

    @Test
    public void testUpdateById(){
        System.out.println(teacherMapper.updateById(new Teacher(3, "老师3")));
    }

    @Test
    public void testSelectByName1(){
        System.out.println(teacherMapper.selectByName1("老"));
    }

    @Test
    public void teatSelectBySet(){
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        System.out.println(teacherMapper.selectBySet(ids));
    }

    @Test
    public void testSelectBySet1(){
        Integer [] ids1 = {1,2,3};
        System.out.println(teacherMapper.selectBySet1(ids1));
    }

    @After
    public void destroy(){
        sqlSession.commit();
    }
}
