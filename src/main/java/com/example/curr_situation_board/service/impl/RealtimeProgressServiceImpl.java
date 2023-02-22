package com.example.curr_situation_board.service.impl;

import com.example.curr_situation_board.config.GlobalConfig;
import com.example.curr_situation_board.mapper.RealtimeProgressMapper;
import com.example.curr_situation_board.service.RealtimeProgressService;
import com.example.curr_situation_board.vo.DayProgressVO;
import com.example.curr_situation_board.vo.HourProgressVO;
import com.example.curr_situation_board.vo.HourScheduleVO;
import com.example.curr_situation_board.vo.MonthProgressVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author nz.zou  2022/10/31
 * @since curr_situation_board
 */
@Service
public class RealtimeProgressServiceImpl implements RealtimeProgressService {
    @Autowired
    public RealtimeProgressMapper realtimeProgressMapper;

    @Override
    public List<DayProgressVO> findDayProgress(String building) {
        List<DayProgressVO> list = realtimeProgressMapper.findDayProgress(GlobalConfig.realtimedayMap.get(building));
        return list;
    }


    @Override
    public List<HourProgressVO> findHourProgressGy(String building) {
        List<HourProgressVO> list = realtimeProgressMapper.findHourProgressGy(GlobalConfig.realtimedayMap.get(building));
        return list;
    }

    @Override
    public List<HourProgressVO> findHourProgressDay(String building){
        List<HourProgressVO> list = realtimeProgressMapper.findHourProgressDay(GlobalConfig.realtimedayMap.get(building));
        return list;
    }

    @Override
    public List<HourProgressVO> findHourProgressSw(String building){
        List<HourProgressVO> list = realtimeProgressMapper.findHourProgressSw(GlobalConfig.realtimedayMap.get(building));
        return list;
    }


    @Override
    public List<MonthProgressVO> findMonthProgress(String type){
        List<MonthProgressVO> list = realtimeProgressMapper.findMonthProgress(type);
        return list;
    }

    @Override
    public List<HourScheduleVO> findHourProgress(String mod, String type, String date) {
        return realtimeProgressMapper.findHourProgress(mod, type, date);
    }
}
