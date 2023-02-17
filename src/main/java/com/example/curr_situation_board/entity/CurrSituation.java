package com.example.curr_situation_board.entity;

/**
 * @author nz.zou  2022/10/21
 * @since curr_situation_board1
 */
public class CurrSituation {
    private String processid;
    private String cp;
    private String cpBLine;
    private String olb;
    private String sm020pg;
    private String sm020bz;
    private String mt;
    private String mtRetest;
    private String lcmPack;
    private String lcmBank;
    private String rwTtl;
    private String w2Bank;
    private String mediumPlate;

    public CurrSituation() {
    }

    public CurrSituation(String processid, String cp, String cpBLine, String olb, String sm020pg, String sm020bz, String mt, String mtRetest, String lcmPack, String lcmBank, String rwTtl, String w2Bank, String mediumPlate) {
        this.processid = processid;
        this.cp = cp;
        this.cpBLine = cpBLine;
        this.olb = olb;
        this.sm020pg = sm020pg;
        this.sm020bz = sm020bz;
        this.mt = mt;
        this.mtRetest = mtRetest;
        this.lcmPack = lcmPack;
        this.lcmBank = lcmBank;
        this.rwTtl = rwTtl;
        this.w2Bank = w2Bank;
        this.mediumPlate = mediumPlate;
    }

    public String getProcessid() {
        return processid;
    }

    public void setProcessid(String processid) {
        this.processid = processid;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCpBLine() {
        return cpBLine;
    }

    public void setCpBLine(String cpBLine) {
        this.cpBLine = cpBLine;
    }

    public String getOlb() {
        return olb;
    }

    public void setOlb(String olb) {
        this.olb = olb;
    }

    public String getSm020pg() {
        return sm020pg;
    }

    public void setSm020pg(String sm020pg) {
        this.sm020pg = sm020pg;
    }

    public String getSm020bz() {
        return sm020bz;
    }

    public void setSm020bz(String sm020bz) {
        this.sm020bz = sm020bz;
    }

    public String getMt() {
        return mt;
    }

    public void setMt(String mt) {
        this.mt = mt;
    }

    public String getMtRetest() {
        return mtRetest;
    }

    public void setMtRetest(String mtRetest) {
        this.mtRetest = mtRetest;
    }

    public String getLcmPack() {
        return lcmPack;
    }

    public void setLcmPack(String lcmPack) {
        this.lcmPack = lcmPack;
    }

    public String getLcmBank() {
        return lcmBank;
    }

    public void setLcmBank(String lcmBank) {
        this.lcmBank = lcmBank;
    }

    public String getRwTtl() {
        return rwTtl;
    }

    public void setRwTtl(String rwTtl) {
        this.rwTtl = rwTtl;
    }

    public String getW2Bank() {
        return w2Bank;
    }

    public void setW2Bank(String w2Bank) {
        this.w2Bank = w2Bank;
    }

    public String getMediumPlate() {
        return mediumPlate;
    }

    public void setMediumPlate(String mediumPlate) {
        this.mediumPlate = mediumPlate;
    }

    @Override
    public String toString() {
        return "CurrSituation{" +
                "processid='" + processid + '\'' +
                ", cp='" + cp + '\'' +
                ", cpBLine='" + cpBLine + '\'' +
                ", olb='" + olb + '\'' +
                ", sm020pg='" + sm020pg + '\'' +
                ", sm020bz='" + sm020bz + '\'' +
                ", mt='" + mt + '\'' +
                ", mtRetest='" + mtRetest + '\'' +
                ", lcmPack='" + lcmPack + '\'' +
                ", lcmBank='" + lcmBank + '\'' +
                ", rwTtl='" + rwTtl + '\'' +
                ", w2Bank='" + w2Bank + '\'' +
                ", mediumPlate='" + mediumPlate + '\'' +
                '}';
    }


}
