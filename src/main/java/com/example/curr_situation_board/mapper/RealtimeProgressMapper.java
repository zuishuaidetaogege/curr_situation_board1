package com.example.curr_situation_board.mapper;

import com.example.curr_situation_board.vo.DayProgressVo;
import com.example.curr_situation_board.vo.HourProgressVo;
import com.example.curr_situation_board.vo.MonthProgressVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author nz.zou  2022/10/31
 * @since curr_situation_board
 */
@Mapper
public interface RealtimeProgressMapper {

    /**
     * 获取A、B、C栋日别数据
     * @param building:A、B、C栋
     * @return
     */
    List<DayProgressVo> findDayProgress(@Param("building") String building);



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



    /**
     * 获取月别投入,入库月计划
     * @param type:区分投入和入库
     * @return
     */
    List<MonthProgressVo> findMonthProgress(@Param("type") String type);
}
