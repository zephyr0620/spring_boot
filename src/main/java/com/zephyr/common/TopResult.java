package com.zephyr.common;

import com.zephyr.common.enums.ResponseCode;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class TopResult<T> {

    //请保持 获取IP的代码放在 最上面
    private static String staticIp;

    static {
        try {
            if(staticIp == null) {
                staticIp = Inet4Address.getLocalHost().getHostAddress();
            }
        } catch (UnknownHostException e) {
            //log
        }
    }

    private String ip ;

    /**
     * 是否成功
     */
    private boolean success = true;



    /**
     * 需要返回的对象
     */
    private T object;

    /**
     * 错误信息
     */
    private String message;


    private int code;

    /**
     * 总的数据量
     */
    private int totalNum;


    /**
     * 通常为了信息诊断的，一般存储了异常信息内容等
     */
    private List<String> errorList = new ArrayList<String>();

    public String getIp() {

        if(ip == null && staticIp != null) {
            ip = staticIp;
        }
        return ip;
    }

    /**
     * 添加错误的详细信息
     *
     * @param error
     */
    public TopResult<T> addError(String error) {
        this.errorList.add(error);
        return this;
    }

    public static <T> TopResult<T> success(T object) {
        TopResult<T> topResult = new TopResult<T>();
        topResult.setObject(object);
        topResult.code = ResponseCode.SUCCESS.getCode();
        return topResult;
    }

    public static <T> TopResult<T> fail(String message) {

        TopResult<T> topResult = new TopResult<T>();
        topResult.setSuccess(false);
        topResult.setMessage(message);

        return topResult;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public List<String> getErrorList() {
        return errorList;
    }

    public void setErrorList(List<String> errorList) {
        this.errorList = errorList;
    }
}
