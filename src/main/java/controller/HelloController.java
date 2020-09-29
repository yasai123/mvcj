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
        System.out.println("编辑好了，我是第二次修改的内容");
        System.out.println("我是新增加的内容");
        System.out.println("2222222222222222");
        return "index";
    }
}
