package controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alexggg99 on 02.07.15.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/settings")
    public String settings(){return "settings";}

    @RequestMapping("/greeting")
    @ResponseBody
    public String json(){
        return "{\"id\":1,\"content\":\"Hello, World!\"}";
    }

    @RequestMapping("pruduct-panels")
    public String productPanels() {
        return "product-panels";
    }



}
