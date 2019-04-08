package net.cc1000.fangiqlweb.oacontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/oa")
public class OAWeb {
    //实体类
    //TODO

    @RequestMapping("owner")
    public ModelAndView getOAowner(HttpServletRequest httpServletRequest){
        //TODO
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("oa/owner");
        return modelAndView;
    }

    @RequestMapping("daiban")
    public ModelAndView getOAdaiban(HttpServletRequest httpServletRequest){
        //TODO
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("oa/daiban");
        return modelAndView;
    }

    @RequestMapping("fabu")
    public ModelAndView getOAfb(HttpServletRequest httpServletRequest){
        //TODO
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("oa/fabu");
        return modelAndView;
    }

    @RequestMapping("history")
    public ModelAndView getOAhistory(HttpServletRequest httpServletRequest){
        //TODO
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("oa/history");
        return modelAndView;
    }





}
