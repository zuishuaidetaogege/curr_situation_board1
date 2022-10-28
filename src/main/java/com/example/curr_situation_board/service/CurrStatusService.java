package com.example.curr_situation_board.service;

import com.example.curr_situation_board.vo.CurrStatusVo;

import java.util.List;

/**
 * @author nz.zou  2022/10/28
 * @since curr_situation_board
 */
public interface CurrStatusService {

    /**
     * 获取A、B、C实际在工现况
     * @param building:A、B、C栋
     * @return
     */
    List<CurrStatusVo> findCurrStatus(String building);
}
