package com.donovansmangos.donovans_mangos.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class ErrorController {
    @GetMapping("/error")
    public ModelAndView error() {
        ModelAndView response = new ModelAndView("error");
        return response;
    }
}
