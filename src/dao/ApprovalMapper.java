package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Approval;
import pojo.ApprovalExample;

public interface ApprovalMapper {
    long countByExample(ApprovalExample example);

    int deleteByExample(ApprovalExample example);

    int deleteByPrimaryKey(Integer approvalID);

    int insert(Approval record);

    int insertSelective(Approval record);

    List<Approval> selectByExample(ApprovalExample example);

    Approval selectByPrimaryKey(Integer approvalID);

    int updateByExampleSelective(@Param("record") Approval record, @Param("example") ApprovalExample example);

    int updateByExample(@Param("record") Approval record, @Param("example") ApprovalExample example);

    int updateByPrimaryKeySelective(Approval record);

    int updateByPrimaryKey(Approval record);
}