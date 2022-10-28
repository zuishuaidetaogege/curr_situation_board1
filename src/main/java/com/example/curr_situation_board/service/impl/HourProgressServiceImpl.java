package com.example.curr_situation_board.service.impl;

import com.example.curr_situation_board.config.GlobalConfig;
import com.example.curr_situation_board.mapper.HourProgressMapper;
import com.example.curr_situation_board.service.HourProgressService;
import com.example.curr_situation_board.vo.HourProgressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nz.zou  2022/10/28
 * @since curr_situation_board
 */
@Service
public class HourProgressServiceImpl implements HourProgressService {
    @Autowired
    public HourProgressMapper hourProgressMapper;

    @Override
    public List<HourProgressVo> findHourProgressGy(String building){
        List<HourProgressVo> list = hourProgressMapper.findHourProgressGy(GlobalConfig.realtimedayMap.get(building));
        return list;
    }

    @Override
    public List<HourProgressVo> findHourProgressDay(String building){
        List<HourProgressVo> list = hourProgressMapper.findHourProgressDay(GlobalConfig.realtimedayMap.get(building));
        return list;
    }

    @Override
    public List<HourProgressVo> findHourProgressSw(String building){
        List<HourProgressVo> list = hourProgressMapper.findHourProgressSw(GlobalConfig.realtimedayMap.get(building));
        return list;
    }
}
