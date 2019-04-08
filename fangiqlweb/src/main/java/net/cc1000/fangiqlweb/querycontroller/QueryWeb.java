package net.cc1000.fangiqlweb.querycontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/query")
public class QueryWeb {

    //实体类
    //TODO

    @RequestMapping("/")
    public ModelAndView queryIndex(HttpServletRequest httpServletRequest){
        //TODO
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }


    @RequestMapping("qhbase")
    public ModelAndView queryHbase(HttpServletRequest httpServletRequest){
        //TODO
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("query/qhbase");
        return modelAndView;

    }

    @RequestMapping("qmysql")
    public ModelAndView queryMysql(HttpServletRequest httpServletRequest){
        //TODO
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("query/qmysql");
        return modelAndView;

    }

    @RequestMapping("aspark")
    public ModelAndView queryAspark(HttpServletRequest httpServletRequest){
        //TODO
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("query/aspark");
        return modelAndView;

    }












}
