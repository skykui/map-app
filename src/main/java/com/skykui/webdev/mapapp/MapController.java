package com.skykui.webdev.mapapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MapController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
