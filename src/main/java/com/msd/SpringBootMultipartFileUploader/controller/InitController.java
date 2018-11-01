package com.msd.SpringBootMultipartFileUploader.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class InitController {

    @RequestMapping(value={"/"}, method = RequestMethod.GET)
    public ModelAndView init() {
        return new ModelAndView("upload");
    }
}
