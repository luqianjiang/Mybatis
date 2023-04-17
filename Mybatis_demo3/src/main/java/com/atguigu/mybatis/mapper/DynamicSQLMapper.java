package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author luqianjiang
 * @Date 2023/4/17 22:16
 * @Description:
 */
public interface DynamicSQLMapper {


    /**
     * 多条件查询,sql片段
     */
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 多条件查询
     */
    List<Emp> getEmpByConditionOne(Emp emp);

    /**
     * 多条件查询
     */
    List<Emp> getEmpByConditionTwo(Emp emp);

    /**
     * 多条件查询
     */
    List<Emp> getEmpByConditionThree(Emp emp);


    /**
     * 测试choose、when、otherwise
     */
    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 通过数组实现批量删除
     */
    int deleteMoreByArray(@Param("eids") Integer[] eids);

    /**
     * 通过list集合实现批量添加
     */
    int insertMoreByList(@Param("emps") List<Emp> emps);
}
