package com.example.curr_situation_board.vo;

/**
 * @author nz.zou  2022/10/26
 * @since curr_situation_board
 */
public class MonthProgressVO {
    private int plan;
    private int real_plan;
    private int act;
    private int gap;
    private String Usage;

    public int getGap() {
        return gap;
    }

    public void setGap(int gap) {
        this.gap = gap;
    }

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }

    public int getReal_plan() {
        return real_plan;
    }

    public void setReal_plan(int real_plan) {
        this.real_plan = real_plan;
    }

    public int getAct() {
        return act;
    }

    public void setAct(int act) {
        this.act = act;
    }

    public String getUsage() {
        return Usage;
    }

    public void setUsage(String usage) {
        Usage = usage;
    }
}
