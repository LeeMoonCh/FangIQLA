package net.cc1000.fangiqlweb.blobcontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/blob")
public class BlobWeb {

    //实体类
    //TODO


    @RequestMapping("f_bw")
    public ModelAndView getFBW(HttpServletRequest httpServletRequest){
        //TODO
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("blob/f_bw");
        return modelAndView;
    }

    @RequestMapping("f_list")
    public ModelAndView getFlist(HttpServletRequest httpServletRequest){
        //TODO
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("blob/f_list");
        return modelAndView;
    }

    @RequestMapping("f_owner")
    public ModelAndView getFowner(HttpServletRequest httpServletRequest){
        //TODO
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("blob/f_owner");
        return modelAndView;
    }


}
