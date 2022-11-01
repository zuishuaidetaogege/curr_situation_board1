package com.example.curr_situation_board.controller;

import com.example.curr_situation_board.service.RealtimeProgressService;
import com.example.curr_situation_board.vo.DayProgressVo;
import com.example.curr_situation_board.vo.HourProgressVo;
import com.example.curr_situation_board.vo.MonthProgressVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author nz.zou  2022/10/31
 * @since curr_situation_board
 */
@RestController
public class RealtimeProgressController {
    @Autowired
    public RealtimeProgressService realtimeProgressService;

    @GetMapping("/realtime_progress_day/{building}")
    public List<DayProgressVo> findDayProgress(@PathVariable String building){
        List<DayProgressVo> list = realtimeProgressService.findDayProgress(building);
        return list ;
    }


    @GetMapping("/realtime_progress_hour/{building}/{type}")
    public List<HourProgressVo> findHourProgress(@PathVariable String building, @PathVariable String type){
        List<HourProgressVo> list = null;
        if(type.equals("gy")){
            list = realtimeProgressService.findHourProgressGy(building);
        }else if(type.equals("day")){
            list = realtimeProgressService.findHourProgressDay(building);
        }else if(type.equals("sw")){
            list = realtimeProgressService.findHourProgressSw(building);
        }
        return list;
    }


    @GetMapping("/realtime_progress_month/{type}")
    public List<MonthProgressVo> findMonthProgress(@PathVariable String type){
        List<MonthProgressVo> list = realtimeProgressService.findMonthProgress(type);
        return list;
    }
}
