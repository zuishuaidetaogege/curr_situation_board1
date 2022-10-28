package com.example.curr_situation_board.mapper;

import com.example.curr_situation_board.vo.HourProgressVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author nz.zou  2022/10/28
 * @since curr_situation_board
 */
@Mapper
public interface HourProgressMapper {

    /**
     *获取小时别晚班数据
     * @param building :区分A、B、C栋
     * @return
     */
    List<HourProgressVo> findHourProgressGy(@Param("building") String building);

    /**
     *获取小时别早班数据
     * @param building :区分A、B、C栋
     * @return
     */
    List<HourProgressVo> findHourProgressDay(@Param("building") String building);

    /**
     *获取小时别中班数据
     * @param building :区分A、B、C栋
     * @return
     */
    List<HourProgressVo> findHourProgressSw(@Param("building") String building);

}
