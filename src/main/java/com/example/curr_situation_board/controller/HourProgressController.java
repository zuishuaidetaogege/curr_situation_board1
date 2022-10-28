package com.example.curr_situation_board.controller;

import com.example.curr_situation_board.service.HourProgressService;
import com.example.curr_situation_board.vo.HourProgressVo;
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
public class HourProgressController {
    @Autowired
    public HourProgressService hourProgressService;

    @GetMapping("/realtime_progress_hour/{building}/{type}")
    public List<HourProgressVo> findHourProgress(@PathVariable String building, @PathVariable String type){
        List<HourProgressVo> list = null;
        if(type.equals("gy")){
            list = hourProgressService.findHourProgressGy(building);
        }else if(type.equals("day")){
            list = hourProgressService.findHourProgressDay(building);
        }else if(type.equals("sw")){
            list = hourProgressService.findHourProgressSw(building);
        }
        return list;
    }
}
