package com.example.curr_situation_board.controller;

import com.example.curr_situation_board.service.DayProgressService;
import com.example.curr_situation_board.vo.DayProgressVo;
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
public class DayProgressController {
    @Autowired
    public DayProgressService dayProgressService;

    @GetMapping("/realtime_progress_day/{building}")
    public List<DayProgressVo> findDayProgress(@PathVariable String building){
        List<DayProgressVo> list = dayProgressService.findDayProgress(building);
        return list ;
    }
}
