package com.inspur.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用的返回的类
 */
public class Result {
    //状态码 100-失败 200-成功
    private int status;
    //提示信息
    private String msg;

    //用户要返回给浏览器的数据
    private Map<String, Object> data = new HashMap<String, Object>();

    public static Result success() {
        Result result = new Result();
        result.setStatus(200);
        result.setMsg("操作成功！");
        return result;
    }

    public static Result fail() {
        Result result = new Result();
        result.setStatus(100);
        result.setMsg("操作失败！");
        return result;
    }

    public Result add(String key, Object value) {
        this.getData().put(key, value);
        return  this;
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Result setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
