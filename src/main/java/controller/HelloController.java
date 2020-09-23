package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Descript TODO
 * @Author yd.wang
 * @Date 2020/09/23 16:13
 **/
@Controller
public class HelloController {

    @RequestMapping(path = "/hello")
    public String Hello(){
        System.out.println("Hell SpringMVC");
        return "index";
    }
}
