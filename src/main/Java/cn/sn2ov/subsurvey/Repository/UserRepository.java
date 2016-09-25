package cn.sn2ov.subsurvey.Repository;

import cn.sn2ov.subsurvey.Model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by SN2OV on 2016/9/24.
 */

@Repository
public interface UserRepository extends JpaRepository<user,Integer>{

    @Modifying      // 说明该方法是修改操作
    @Transactional  // 说明该方法是事务性操作
    // 定义查询
    // @Param注解用于提取参数
    @Query("update user us set us.username=:qUserName, us.name=:qName, us.password=:qPassword where us.id=:qId")
    public void updateUser(@Param("qUserName") String userName, @Param("qName") String name,
                            @Param("qPassword") String password, @Param("qId") Integer id);

}


