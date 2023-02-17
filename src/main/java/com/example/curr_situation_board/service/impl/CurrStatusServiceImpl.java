package com.example.curr_situation_board.service.impl;

import com.example.curr_situation_board.config.GlobalConfig;
import com.example.curr_situation_board.mapper.CurrStatusMapper;
import com.example.curr_situation_board.service.CurrStatusService;
import com.example.curr_situation_board.vo.CurrStatusVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nz.zou  2022/10/28
 * @since curr_situation_board
 */
@Service
public class CurrStatusServiceImpl implements CurrStatusService {

    @Autowired
    public CurrStatusMapper currStatusMapper;

    @Override
    public List<CurrStatusVO> findCurrStatus(String building){
        List<CurrStatusVO> list = currStatusMapper.findCurrStatus(GlobalConfig.currStatusMap.get(building));
        return list;
    }
}
