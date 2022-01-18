package com.example.reactdeployment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
public class CsrController {

    @RequestMapping({"/{path:[^.]*}", "/*/{path:[^.]*}", "/*/*/{path:[^.]*}"})
    public String redirect(@PathVariable String path, HttpServletRequest httpServletRequest) {
        log.info("CSR route: {}", path);
        log.info("URI: {}", httpServletRequest.getRequestURI());
        return "forward:/";
    }
}
