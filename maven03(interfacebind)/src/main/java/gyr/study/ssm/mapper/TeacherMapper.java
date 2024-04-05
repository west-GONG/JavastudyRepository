package gyr.study.ssm.mapper;

import gyr.study.ssm.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TeacherMapper {
    List<Teacher> selectAll();
    //name作为唯一键的时候可以这么勇
    Teacher selectByName(String name);
    Teacher selectByTeacher(Teacher teacher);
    Teacher selectByMap(Map<String,Object> map);
    Teacher selectByCondition(Integer id ,String name);
    Teacher selectByCondition2(@Param("id") Integer id ,@Param("name") String name);
    List<Teacher> selectByCondition3(@Param("id") Integer id ,@Param("name") String name);
    List<Teacher> selectByIdName(@Param("id") Integer id ,@Param("name") String name);
    Integer insertTeacher(Teacher teacher);
    Integer updateTeacher(Teacher teacher);
    Integer updateById(Teacher teacher);
    List<Teacher> selectByName1(String name);
    List<Teacher> selectBySet(List<Integer> ids);
    List<Teacher> selectBySet1(Integer [] ids);
}
