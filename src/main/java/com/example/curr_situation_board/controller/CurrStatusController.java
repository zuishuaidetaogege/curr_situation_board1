package com.example.curr_situation_board.controller;

import com.example.curr_situation_board.service.CurrStatusService;
import com.example.curr_situation_board.vo.CurrStatusVo;
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
public class CurrStatusController {

    @Autowired
    public CurrStatusService currStatusService;

    @GetMapping("/curr_status/{building}/{type}")

    public CurrStatusVo findCurrStatus(@PathVariable String building){

        List<CurrStatusVo> list = currStatusService.findCurrStatus(building);
        if(list.size() == 1){
            return list.get(0);
        }else{
            return null;
        }
    }
}
