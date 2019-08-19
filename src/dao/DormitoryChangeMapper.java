package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.DormitoryChange;
import pojo.DormitoryChangeExample;

public interface DormitoryChangeMapper {
    long countByExample(DormitoryChangeExample example);

    int deleteByExample(DormitoryChangeExample example);

    int deleteByPrimaryKey(Integer changeID);

    int insert(DormitoryChange record);

    int insertSelective(DormitoryChange record);

    List<DormitoryChange> selectByExample(DormitoryChangeExample example);

    DormitoryChange selectByPrimaryKey(Integer changeID);

    int updateByExampleSelective(@Param("record") DormitoryChange record, @Param("example") DormitoryChangeExample example);

    int updateByExample(@Param("record") DormitoryChange record, @Param("example") DormitoryChangeExample example);

    int updateByPrimaryKeySelective(DormitoryChange record);

    int updateByPrimaryKey(DormitoryChange record);
}