package com.example.curr_situation_board.mapper;

import com.example.curr_situation_board.vo.DayProgressVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author nz.zou  2022/10/28
 * @since curr_situation_board
 */
@Mapper
public interface DayProgressMapper {
    /**
     * 获取A、B、C栋日别数据
     * @param building:A、B、C栋
     * @return
     */
    List<DayProgressVo> findDayProgress(@Param("building") String building);
}
