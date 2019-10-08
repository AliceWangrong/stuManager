package com.utils;

import java.util.HashMap;
import java.util.Map;

public class Msg {
    private int code;
    private String msg;
    private Map<String,Object> extend=new HashMap<String, Object>();

    public static Msg Success(){
        Msg result=new Msg();
        result.setCode(100);
        result.setMsg("处理成功！");
        return result;
    }
    public static Msg setStatus(Integer status){
        Msg result=new Msg();
        result.setCode(status);
        if(status==100){
            result.setMsg("处理成功！");
        }
        else if(status==200){
            result.setMsg("密码错误！");
        }
         else if(status==404){
            result.setMsg("无此用户！");
        }
        else{
            result.setMsg("登录错误！");
        }
        return result;
    }
    public Msg add(String key,Object value){
        this.getExtend().put(key,value);
        return this;
    }
    public static Msg fail(){
        Msg result=new Msg();
        result.setCode(200);
        result.setMsg("处理失败！");
        return result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "extend=" + extend +
                '}';
    }
}
