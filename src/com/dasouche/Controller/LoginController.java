package com.dasouche.Controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liuqizhe on 15/9/18.
 */
public class LoginController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest rq, HttpServletResponse rs) throws Exception {
        return new ModelAndView("login");
    }
}
