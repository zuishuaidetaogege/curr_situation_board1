package com.example.curr_situation_board.service.impl;

import com.example.curr_situation_board.config.GlobalConfig;
import com.example.curr_situation_board.mapper.RealtimeProgressMapper;
import com.example.curr_situation_board.service.RealtimeProgressService;
import com.example.curr_situation_board.vo.DayProgressVo;
import com.example.curr_situation_board.vo.HourProgressVo;
import com.example.curr_situation_board.vo.MonthProgressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<DayProgressVo> findDayProgress(String building) {
        List<DayProgressVo> list = realtimeProgressMapper.findDayProgress(GlobalConfig.realtimedayMap.get(building));
        return list;
    }


    @Override
    public List<HourProgressVo> findHourProgressGy(String building) {
        List<HourProgressVo> list = realtimeProgressMapper.findHourProgressGy(GlobalConfig.realtimedayMap.get(building));
        return list;
    }

    @Override
    public List<HourProgressVo> findHourProgressDay(String building){
        List<HourProgressVo> list = realtimeProgressMapper.findHourProgressDay(GlobalConfig.realtimedayMap.get(building));
        return list;
    }

    @Override
    public List<HourProgressVo> findHourProgressSw(String building){
        List<HourProgressVo> list = realtimeProgressMapper.findHourProgressSw(GlobalConfig.realtimedayMap.get(building));
        return list;
    }


    @Override
    public List<MonthProgressVo> findMonthProgress(String type){
        List<MonthProgressVo> list = realtimeProgressMapper.findMonthProgress(type);
        return list;
    }
}
