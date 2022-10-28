package com.example.curr_situation_board.mapper;

import com.example.curr_situation_board.vo.MonthProgressVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author nz.zou  2022/10/28
 * @since curr_situation_board
 */
@Mapper
public interface MonthProgressMapper {

    /**
     * 获取月别投入,入库月计划
     * @param type:区分投入和入库
     * @return
     */
    List<MonthProgressVo> findMonthProgress(@Param("type") String type);
}
