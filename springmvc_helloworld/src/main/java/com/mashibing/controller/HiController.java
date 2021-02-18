package com.mashibing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author sunpeng
 * @Date 2021-02-18 16:29
 */
@Controller
public class HiController {

    @RequestMapping(value = "hi", params = {"msg"}, headers = {"User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/88.0.4324.150 Safari/537.36"})
    public String hi(Map<String, String> map, String msg){ //Map会给视图解析器中的参数赋值
        map.put("msg", msg);
        return "hello";
    }
}
/**
 * 参数：msg
 * 1）url：params = {"msg"} 表示请求的url中必须要有msg
 * 2）方法：String msg 表示方法接受参数
 * 3）视图：Map<String, String> map; map.put("msg", msg); 表示讲参数放到视图解析器中
 */
