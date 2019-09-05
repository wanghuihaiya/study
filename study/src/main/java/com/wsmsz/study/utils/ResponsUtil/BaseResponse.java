package com.wsmsz.study.utils.ResponsUtil;

import java.io.Serializable;

/**
 * @ClassName BaseResponse
 * @Description TODO
 * @Author wang
 * @Date 2019/9/4 9:51
 * @Version 1.0
 */
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = -1697733640925663374L;
    //状态码
    private int code;
    //消息
    private String msg;
    //数据
    private T data;

    public BaseResponse(){}

    public BaseResponse(int code) {
        this.code = code;
    }

    public BaseResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static BaseResponse success(){
        return new BaseResponse(200,"success");
    }

    public static BaseResponse success(String msg){
        return new BaseResponse(200,msg);
    }

    public static <T> BaseResponse<T> success(String msg,T data){
        return new BaseResponse(200,msg,data);
    }

    public static BaseResponse error(){
        return new BaseResponse(500,"error");
    }

    public static BaseResponse error(String msg){
        return new BaseResponse(500,msg);
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
