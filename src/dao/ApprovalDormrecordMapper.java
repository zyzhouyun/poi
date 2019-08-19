package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.ApprovalDormrecord;
import pojo.ApprovalDormrecordExample;

public interface ApprovalDormrecordMapper {
    long countByExample(ApprovalDormrecordExample example);

    int deleteByExample(ApprovalDormrecordExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(ApprovalDormrecord record);

    int insertSelective(ApprovalDormrecord record);

    List<ApprovalDormrecord> selectByExample(ApprovalDormrecordExample example);

    ApprovalDormrecord selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") ApprovalDormrecord record, @Param("example") ApprovalDormrecordExample example);

    int updateByExample(@Param("record") ApprovalDormrecord record, @Param("example") ApprovalDormrecordExample example);

    int updateByPrimaryKeySelective(ApprovalDormrecord record);

    int updateByPrimaryKey(ApprovalDormrecord record);
}