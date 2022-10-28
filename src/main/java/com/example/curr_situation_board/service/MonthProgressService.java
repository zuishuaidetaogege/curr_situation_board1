package com.example.curr_situation_board.service;

import com.example.curr_situation_board.vo.MonthProgressVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nz.zou  2022/10/28
 * @since curr_situation_board
 */

public interface MonthProgressService {

    /**
     * 获取月别投入,入库月计划
     * @param type:区分投入和入库
     * @return
     */
    List<MonthProgressVo> findMonthProgress(String type);
}
