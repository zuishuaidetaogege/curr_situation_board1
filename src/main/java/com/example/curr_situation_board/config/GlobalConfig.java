package com.example.curr_situation_board.config;

import java.util.HashMap;

/**
 * @author nz.zou  2022/10/26
 * @since curr_situation_board1
 */
public class GlobalConfig {
    public static HashMap<String, String> currStatusMap = new HashMap<String, String>(){
        {
            put("A", "MODPROC");
            put("B", "MODPROC2");
            put("C", "MODPROC3");
        }
    };
    public static HashMap<String, String> realtimedayMap = new HashMap<String, String>(){
        {
            put("A", "S1MOD");
            put("B", "S2MOD");
            put("C", "S3MOD");
        }
    };

}
