package com.example.curr_situation_board.service;

import com.example.curr_situation_board.vo.DayProgressVO;
import com.example.curr_situation_board.vo.HourProgressVO;
import com.example.curr_situation_board.vo.HourScheduleVO;
import com.example.curr_situation_board.vo.MonthProgressVO;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author nz.zou  2022/10/31
 * @since curr_situation_board
 */
public interface RealtimeProgressService {
    /**
     * 获取A、B、C栋日别数据
     * @param building:A、B、C栋
     * @return
     */
    List<DayProgressVO> findDayProgress(@Param("building") String building);



    /**
     *获取小时别晚班数据
     * @param building :区分A、B、C栋
     * @return
     */
    List<HourProgressVO> findHourProgressGy(String building);

    /**
     *获取小时别早班数据
     * @param building :区分A、B、C栋
     * @return
     */
    List<HourProgressVO> findHourProgressDay(String building);

    /**
     *获取小时别中班数据
     * @param building :区分A、B、C栋
     * @return
     */
    List<HourProgressVO> findHourProgressSw(String building);



    /**
     * 获取月别投入,入库月计划
     * @param type:区分投入和入库
     * @return
     */
    List<MonthProgressVO> findMonthProgress(String type);

    List<HourScheduleVO> findHourProgress(String mod, String type, String date);
}
