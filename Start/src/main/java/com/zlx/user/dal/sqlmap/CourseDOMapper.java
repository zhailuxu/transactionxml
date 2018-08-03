package com.zlx.user.dal.sqlmap;

import com.zlx.user.dal.dao.CourseDO;
import com.zlx.user.dal.dao.CourseDOExample;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
@Resource
public interface CourseDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Jun 30 23:52:31 CST 2018
     */
    int countByExample(CourseDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Jun 30 23:52:31 CST 2018
     */
    int deleteByExample(CourseDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Jun 30 23:52:31 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Jun 30 23:52:31 CST 2018
     */
    int insert(CourseDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Jun 30 23:52:31 CST 2018
     */
    int insertSelective(CourseDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Jun 30 23:52:31 CST 2018
     */
    List<CourseDO> selectByExample(CourseDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Jun 30 23:52:31 CST 2018
     */
    CourseDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Jun 30 23:52:31 CST 2018
     */
    int updateByExampleSelective(@Param("record") CourseDO record, @Param("example") CourseDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Jun 30 23:52:31 CST 2018
     */
    int updateByExample(@Param("record") CourseDO record, @Param("example") CourseDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Jun 30 23:52:31 CST 2018
     */
    int updateByPrimaryKeySelective(CourseDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Sat Jun 30 23:52:31 CST 2018
     */
    int updateByPrimaryKey(CourseDO record);
}