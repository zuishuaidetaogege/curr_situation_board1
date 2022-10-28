package com.example.curr_situation_board.controller;

import com.example.curr_situation_board.service.MonthProgressService;
import com.example.curr_situation_board.vo.MonthProgressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author nz.zou  2022/10/28
 * @since curr_situation_board
 */
@RestController
public class MonthProgressController {

    @Autowired
    public MonthProgressService monthProgressService;

    @GetMapping("/realtime_progress_month/{type}")
    public List<MonthProgressVo> findMonthProgress(@PathVariable String type){
        List<MonthProgressVo> list = monthProgressService.findMonthProgress(type);
        return list;
    }
}
