package com.yougou.shop.ui.controller;

import com.yougou.shop.commons.util.HttpClientUtils;
import com.yougou.shop.commons.util.MapperUtils;
import com.yougou.shop.ui.api.API;
import com.yougou.shop.ui.dto.YgContentDTO;
import com.yougou.shop.ui.dto.YgLunbo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {
    @RequestMapping(value = {"","index"},method = RequestMethod.GET)
    public String index(Model model){
        //获取轮播图
        //getJsonString(model);
        //获取商品
        getContent(model);
        return "index";
    }

    private void getContent(Model model) {
        String format = String.format("?cid=%s", 560);
        String json = HttpClientUtils.doGet(API.API_CONTENT+format);
        try {
            List<YgContentDTO> contentDTOS = MapperUtils.json2listByTree(json, "data", YgContentDTO.class);
            model.addAttribute("products",contentDTOS);//存到域对象中发送给前端
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 简单搜索
     */
    @RequestMapping(value = "search")
    public String search(String name,Model model){

        return null;
    }
    /**
     * ppt
     * @param model
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "ppt",method = RequestMethod.GET)
    public List<YgLunbo> getJsonString(Model model) {
        List<YgLunbo> lunbos = null;
        String json = HttpClientUtils.doGet(API.API_PPT);
        try {
            lunbos = MapperUtils.json2listByTree(json, "data", YgLunbo.class);
            //model.addAttribute("ppt",lunbos);//存到域对象中发送给前端
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lunbos;
    }
}
