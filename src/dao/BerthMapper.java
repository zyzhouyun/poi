package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Berth;
import pojo.BerthExample;

public interface BerthMapper {
    long countByExample(BerthExample example);

    int deleteByExample(BerthExample example);

    int deleteByPrimaryKey(Integer berthID);

    int insert(Berth record);

    int insertSelective(Berth record);

    List<Berth> selectByExample(BerthExample example);

    Berth selectByPrimaryKey(Integer berthID);

    int updateByExampleSelective(@Param("record") Berth record, @Param("example") BerthExample example);

    int updateByExample(@Param("record") Berth record, @Param("example") BerthExample example);

    int updateByPrimaryKeySelective(Berth record);

    int updateByPrimaryKey(Berth record);
}