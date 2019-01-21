package com.yougou.shop.commons.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Arrays;

public class HttpClientUtils {
    //常量
    private static final String REQUEST_METHOD_GET="GET";
    private static final String REQUEST_METHOD_POST="POST";
    private static final String REQUEST_HEADER_CONNECTION="keep-alive";
    private static final String REQUEST_HEADER_USER_AGENT="Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/65.0.3325.181 Safari/537.36";

    public static String doGet(String url,String cookie){
        String result = getResult("GET", url, cookie, null);

        return result;
    }
    public static String doGet(String url){
        String result = getResult("GET", url, null, null);

        return result;
    }
    public static String doPost(String url, String cookie,BasicNameValuePair...params){
        String result = getResult("POST", url, cookie, params);
        return result;
    }
    public static String doPost(String url,BasicNameValuePair...params){
        String result = getResult("POST", url, null, params);
        return result;
    }
    public static String getResult(String requestMethod, String url, String cookie, BasicNameValuePair...params){
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpResponse httpResponse = null;
        String result = null;
        try {
        if (requestMethod.equals(HttpClientUtils.REQUEST_METHOD_GET)){
            //get方法
            HttpGet httpGet = new HttpGet(url);
            httpGet.setHeader("Connection",HttpClientUtils.REQUEST_HEADER_CONNECTION);
            httpGet.setHeader("Cookie",cookie);
            httpGet.setHeader("User-Agent",HttpClientUtils.REQUEST_HEADER_USER_AGENT);
            httpResponse = httpClient.execute(httpGet);

        }else if (requestMethod.equals(HttpClientUtils.REQUEST_METHOD_POST)){
            //post方法
            HttpPost httpPost = new HttpPost(url);
            httpPost.setHeader("Connection",HttpClientUtils.REQUEST_HEADER_CONNECTION);
            httpPost.setHeader("Cookie",cookie);
            httpPost.setHeader("User-Agent",HttpClientUtils.REQUEST_HEADER_USER_AGENT);
            httpPost.setEntity(new UrlEncodedFormEntity(Arrays.asList(params),"UTF-8"));
            httpResponse = httpClient.execute(httpPost);
        }

        HttpEntity httpEntity = httpResponse.getEntity();
        result = EntityUtils.toString(httpEntity);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (httpClient!=null){
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}
