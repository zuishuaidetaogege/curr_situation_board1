package com.example.curr_situation_board.service.impl;

import com.example.curr_situation_board.config.GlobalConfig;
import com.example.curr_situation_board.mapper.DayProgressMapper;
import com.example.curr_situation_board.service.DayProgressService;
import com.example.curr_situation_board.vo.DayProgressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nz.zou  2022/10/28
 * @since curr_situation_board
 */
@Service
public class DayProgressServiceImpl implements DayProgressService {
    @Autowired
    public DayProgressMapper dayProgressMapper;

    @Override
    public List<DayProgressVo> findDayProgress(String building){
        List<DayProgressVo> list = dayProgressMapper.findDayProgress(GlobalConfig.realtimedayMap.get(building));
        return list;
    }
}
