package com.yougou.shop.commons.dto;
import com.yougou.shop.commons.util.ConstantUtils;
import org.springframework.stereotype.Component;

@Component
public class BaseResult {
    private int status;
    private String message;
    private Object data;
    //成功
    public static BaseResult success(){
        BaseResult baseResult = createBaseResult(ConstantUtils.STATUS_SUCCESS,"验证成功",null);
        return baseResult;
    }
    public static BaseResult success(String message){
        BaseResult baseResult = createBaseResult(ConstantUtils.STATUS_SUCCESS,message,null);
        return baseResult;
    }
    public static BaseResult success(Object data){
        BaseResult baseResult = createBaseResult(ConstantUtils.STATUS_SUCCESS,"验证成功",data);
        return baseResult;
    }
    public static BaseResult success(String message,Object data){
        BaseResult baseResult = createBaseResult(ConstantUtils.STATUS_SUCCESS,message,data);
        return baseResult;
    }
    public static BaseResult success(int status, String message,Object data){
        BaseResult baseResult = createBaseResult(status, message,data);
        return baseResult;
    }
    //失败
    public static BaseResult fail(){
        BaseResult baseResult = createBaseResult(ConstantUtils.STATUS_FAIL,"验证失败",null);
        return baseResult;
    }
    public static BaseResult fail(String message){
        BaseResult baseResult = createBaseResult(ConstantUtils.STATUS_FAIL,message,null);
        return baseResult;
    }
    public static BaseResult fail(String message,Object data){
        BaseResult baseResult = createBaseResult(ConstantUtils.STATUS_FAIL,message,data);
        return baseResult;
    }
    public static BaseResult fail(int status){
        BaseResult baseResult = createBaseResult(status,"验证失败",null);
        return baseResult;
    }
    public static BaseResult fail(int status,String message){
        BaseResult baseResult = createBaseResult(ConstantUtils.STATUS_FAIL,message,null);
        return baseResult;
    }
    public static BaseResult fail(int status,String message,Object data){
        BaseResult baseResult = createBaseResult(ConstantUtils.STATUS_FAIL,message,data);
        return baseResult;
    }
    //获取
    //设置
    public static BaseResult createBaseResult(int status,String message,Object data){
        BaseResult br = new BaseResult();
        br.setStatus(status);
        br.setMessage(message);
        br.setData(data);
        return br;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
