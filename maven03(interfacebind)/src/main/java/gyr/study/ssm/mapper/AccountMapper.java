package gyr.study.ssm.mapper;

import gyr.study.ssm.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountMapper {
    List<Account> selectAll();
    List<Account> selectByName(String name);
    List<Account> selectByIdName(@Param("id") Integer id,@Param("name") String name);
}
