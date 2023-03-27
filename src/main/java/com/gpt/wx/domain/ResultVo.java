package com.gpt.wx.domain;

import java.util.Objects;

/**
 * @author: dong.zhang
 * @date: 2023-03-25 10:28
 */

public class ResultVo<T> {
    private static final int SUCCESS_STATUS = 1;
    private static final String SUCCESS_MESSAGE = "success";
    private Integer code;
    private String msg;
    private String msg_info;
    private T data;
    private Object extra;

    public ResultVo(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultVo(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultVo(Integer code, String msg, T data, Object extra) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.extra = extra;
    }

    public static ResultVo getSuccess() {
        return new ResultVo(1, "success");
    }

    public static <T> ResultVo getSuccess(T data) {
        return new ResultVo(1, "success", data);
    }

    public static <T> ResultVo getSuccess(T data, Object extra) {
        return new ResultVo(1, "success", data, extra);
    }

    public static boolean checkSuccess(ResultVo resultVo) {
        return resultVo != null && resultVo.isSuccess();
    }

    public boolean isSuccess() {
        return Objects.equals(this.code, 1);
    }

    public static ResultVo getSystemError() {
        return new ResultVo(9999, "system server error");
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
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

    public Object getExtra() {
        return this.extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public ResultVo() {
    }
}
