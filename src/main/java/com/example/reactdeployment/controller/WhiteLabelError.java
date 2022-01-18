package com.example.reactdeployment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
public class WhiteLabelError implements ErrorController {

    @RequestMapping("/error")
    public String handleWhiteLabelError(HttpServletRequest httpServletRequest) {
        Object status = httpServletRequest.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        log.info("Error: {}, Path: {}", status.toString(), httpServletRequest.getRequestURI());
        return "forward:/";
    }
}
