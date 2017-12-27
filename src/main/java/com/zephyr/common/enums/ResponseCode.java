package com.zephyr.common.enums;

public enum ResponseCode {

    SUCCESS(200,"成功");

    private int code;
    private String dsec;

    private ResponseCode(int code, String message){
        this.code = code;
        this.dsec = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDsec() {
        return dsec;
    }

    public void setDsec(String dsec) {
        this.dsec = dsec;
    }
}
