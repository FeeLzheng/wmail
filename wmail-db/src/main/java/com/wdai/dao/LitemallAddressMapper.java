package com.wdai.dao;

import com.wdai.domain.LitemallAddress;
import com.wdai.domain.LitemallAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LitemallAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    long countByExample(LitemallAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int insert(LitemallAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int insertSelective(LitemallAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    LitemallAddress selectOneByExample(LitemallAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    LitemallAddress selectOneByExampleSelective(@Param("example") LitemallAddressExample example, @Param("selective") LitemallAddress.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    List<LitemallAddress> selectByExampleSelective(@Param("example") LitemallAddressExample example, @Param("selective") LitemallAddress.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    List<LitemallAddress> selectByExample(LitemallAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    LitemallAddress selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallAddress.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    LitemallAddress selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    LitemallAddress selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallAddress record, @Param("example") LitemallAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallAddress record, @Param("example") LitemallAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int logicalDeleteByExample(@Param("example") LitemallAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_address
     *
     * @mbg.generated
     */
    int logicalDeleteByPrimaryKey(Integer id);
}