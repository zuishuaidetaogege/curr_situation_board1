package com.example.curr_situation_board.vo;

/**
 * @author nz.zou  2022/10/28
 * @since curr_situation_board
 */
public class DayProgressVO {

    private String step;
    private int plan;
    private int real_plan;
    private int act;

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
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
}
