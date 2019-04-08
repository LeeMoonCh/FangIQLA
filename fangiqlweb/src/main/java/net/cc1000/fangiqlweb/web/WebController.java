package net.cc1000.fangiqlweb.web;


import net.cc1000.fangiqlweb.system.domain.User;
import net.cc1000.fangiqlweb.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {


    @Autowired
    private UserService userService;


    @RequestMapping("/")
    public ModelAndView index(HttpServletRequest request) {
        //拿到会话.
        HttpSession session = request.getSession();
        //新建一个数据和试图模型.
        ModelAndView mv = new ModelAndView();
        User u = (User)session.getAttribute("user");
        if(u==null){
            //如果当前会话用户为null,直接跳转到登录界面,
            mv.setViewName("redirect:/page/login");
        }else{
//            List<Menu> list = menuService.findMenuListByUid(u);//menuService.findAllMenuList();
//            JSONArray rows = JSON.parseArray(JSON.toJSONString(list));
//            JSONArray menuJSON = new TreeBuilder().buildTree(rows);
//            //有用户就跳转到index页面.
//            mv.setViewName("index");
//            mv.addObject("menu", menuJSON);
//            session.setAttribute("usermenus",list);
            mv.setViewName("redirect:/page/index1");
        }
        return mv;
    }


    @RequestMapping("/index1")
    public ModelAndView index1(HttpServletRequest request){
        return index(request);
    }

    @RequestMapping("/zy")
    public ModelAndView indexZy(HttpServletRequest request){
        //TODO
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("zy");
        return modelAndView;
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request, String username, String password) {
        HttpSession session = request.getSession();
        System.out.println(username+","+password);
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setUsername(username);
        User u = userService.findByUsername(user);
//        System.out.println(u.getUsername());
//        List<User> all = userService.findAll();
//        for (User user1:all){
//            System.out.println(user1.getUsername()+user1.getPassword());
//        }

        if(u!=null && u.getPassword().equals(password)){
            session.setAttribute("user",u);
            mv.setViewName("redirect:/");

        }else{
            mv.setViewName("redirect:/page/login");
            mv.addObject("error", true);
        }
        return mv;
    }

    @RequestMapping("/page/**")
    public String getPage(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String uri = request.getRequestURI();
        User user = (User) session.getAttribute("user");
        uri = uri.replaceAll("/page/", "");
        List<String> urlList = new ArrayList<String>();
        List<String> extUrl = new ArrayList<String>();
        extUrl.add("login");
        extUrl.add("404");
        extUrl.add("500");
        extUrl.add("home");
        extUrl.add("head");
        extUrl.add("index");
        extUrl.add("index1");
        extUrl.add("firstlogin");
        if(uri.indexOf("_v")>=0||extUrl.contains(uri)){
            return uri;
        }
        return "403";
    }





}
