package com.rachnicrice.togueimports;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TogueImportsController {

    @GetMapping("/")
    public String home (Model m) {
        return "index";
    }
}
