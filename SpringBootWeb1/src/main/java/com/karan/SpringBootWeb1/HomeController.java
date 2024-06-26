package com.karan.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.net.http.HttpRequest;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("home Method Called");
        return "index";
    }

//    @RequestMapping("/add")
//    public String add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, HttpSession session){
                                  //int num1 is optional if you add correct name of req parm.
//    session.setAttribute("result",result);

//    @RequestMapping("/add")
//    public String add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, Model model){
//    int result =num1 +num2;
//    model.addAttribute("result",result);

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, ModelAndView mv){
        int result =num1 +num2;
        mv.addObject("result",result);


        System.out.println("Result is: "+result);
        mv.setViewName("result");
        return mv;
    }

//    @RequestMapping("/addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int aid,@RequestParam("aname") String aname, ModelAndView mv){
//
//
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//
//        mv.addObject("result",alien);
//
//
//        System.out.println("Result is: "+alien);
//        mv.setViewName("result");
//        return mv;
//    }
@RequestMapping("/addAlien")
public String addAlien(@ModelAttribute Alien alien){



    return "result";
}




}
