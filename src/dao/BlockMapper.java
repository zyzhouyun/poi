package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Block;
import pojo.BlockExample;

public interface BlockMapper {
    long countByExample(BlockExample example);

    int deleteByExample(BlockExample example);

    int deleteByPrimaryKey(Integer blockID);

    int insert(Block record);

    int insertSelective(Block record);

    List<Block> selectByExample(BlockExample example);

    Block selectByPrimaryKey(Integer blockID);

    int updateByExampleSelective(@Param("record") Block record, @Param("example") BlockExample example);

    int updateByExample(@Param("record") Block record, @Param("example") BlockExample example);

    int updateByPrimaryKeySelective(Block record);

    int updateByPrimaryKey(Block record);
}