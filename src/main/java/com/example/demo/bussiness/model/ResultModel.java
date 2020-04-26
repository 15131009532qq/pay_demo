package com.example.demo.bussiness.model;

import java.io.Serializable;

/**
 * @Description 请输入类描述信息
 * @ClassName ResultModel
 * @Autor DZT
 * @Date 2020/4/26 15:18
 * @Version 1.0
 */
public class ResultModel<T> implements Serializable {
    private String msg;
    private int code;
    private T data;

    public ResultModel() {
    }

    public ResultModel(String msg, int code, T data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    private static ResultModel getResult(int code, String msg, Object data) {
        ResultModel resultModel = new ResultModel();
        resultModel.setCode(code);
        resultModel.setData(data);
        resultModel.setMsg(msg);
        return resultModel;
    }

    public static ResultModel getErrorResult(String message) {
        return getResult(0, message, (Object)null);
    }

    public static ResultModel getErrorResult(int code, String message) {
        return getResult(code, message, (Object)null);
    }

    public static ResultModel getSuccessResult(Object result) {
        return getResult(200, "成功", result);
    }

    public static ResultModel getSuccessResult() {
        return getResult(200, "成功", (Object)null);
    }

    public ResultModel(T data) {
        this();
        this.data = data;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
