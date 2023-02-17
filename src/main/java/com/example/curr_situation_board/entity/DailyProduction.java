package com.example.curr_situation_board.entity;



/**
 * @author nz.zou  2022/10/21
 * @since curr_situation_board1
 */

public class DailyProduction {
    private String fab;
    private String usage;
    private String planM;
    private String gapM;
    private String plamMMubiao;
    private String actMMubiao;
    private String type;

    public DailyProduction(String fab, String usage, String planM, String gapM, String plamMMubiao, String actMMubiao, String type) {
        this.fab = fab;
        this.usage = usage;
        this.planM = planM;
        this.gapM = gapM;
        this.plamMMubiao = plamMMubiao;
        this.actMMubiao = actMMubiao;
        this.type = type;
    }

    public DailyProduction() {
    }

    public String getFab() {
        return fab;
    }

    public void setFab(String fab) {
        this.fab = fab;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getPlanM() {
        return planM;
    }

    public void setPlanM(String planM) {
        this.planM = planM;
    }

    public String getGapM() {
        return gapM;
    }

    public void setGapM(String gapM) {
        this.gapM = gapM;
    }

    public String getPlamMMubiao() {
        return plamMMubiao;
    }

    public void setPlamMMubiao(String plamMMubiao) {
        this.plamMMubiao = plamMMubiao;
    }

    public String getActMMubiao() {
        return actMMubiao;
    }

    public void setActMMubiao(String actMMubiao) {
        this.actMMubiao = actMMubiao;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DailyProduction{" +
                "fab='" + fab + '\'' +
                ", usage='" + usage + '\'' +
                ", planM='" + planM + '\'' +
                ", gapM='" + gapM + '\'' +
                ", plamMMubiao='" + plamMMubiao + '\'' +
                ", actMMubiao='" + actMMubiao + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
