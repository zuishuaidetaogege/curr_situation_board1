package com.example.curr_situation_board.service.impl;

import com.example.curr_situation_board.mapper.MonthProgressMapper;
import com.example.curr_situation_board.service.MonthProgressService;
import com.example.curr_situation_board.vo.MonthProgressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nz.zou  2022/10/28
 * @since curr_situation_board
 */
@Service
public class MonthProgressServiceImpl implements MonthProgressService {

    @Autowired
    public MonthProgressMapper monthProgressMapper;

    @Override
    public List<MonthProgressVo> findMonthProgress(String type){
        List<MonthProgressVo> list = monthProgressMapper.findMonthProgress(type);
        return list;
    }
}
