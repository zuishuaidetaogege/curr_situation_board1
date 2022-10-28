package com.example.curr_situation_board.entity;

/**
 * @author nz.zou  2022/10/21
 * @since curr_situation_board1
 */
public class IocView {
    private String step;
    private String type;
    private String type2;
    private String sum;
    private String s1mod;
    private String s2mod;
    private String s3mod;

    public IocView(String step, String type, String type2, String sum, String s1mod, String s2mod, String s3mod) {
        this.step = step;
        this.type = type;
        this.type2 = type2;
        this.sum = sum;
        this.s1mod = s1mod;
        this.s2mod = s2mod;
        this.s3mod = s3mod;
    }

    public IocView() {
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getS1mod() {
        return s1mod;
    }

    public void setS1mod(String s1mod) {
        this.s1mod = s1mod;
    }

    public String getS2mod() {
        return s2mod;
    }

    public void setS2mod(String s2mod) {
        this.s2mod = s2mod;
    }

    public String getS3mod() {
        return s3mod;
    }

    public void setS3mod(String s3mod) {
        this.s3mod = s3mod;
    }

    @Override
    public String toString() {
        return "IocView{" +
                "step='" + step + '\'' +
                ", type='" + type + '\'' +
                ", type2='" + type2 + '\'' +
                ", sum='" + sum + '\'' +
                ", s1mod='" + s1mod + '\'' +
                ", s2mod='" + s2mod + '\'' +
                ", s3mod='" + s3mod + '\'' +
                '}';
    }


}
