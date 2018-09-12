package cn.excgo.demostu.controller;

import cn.excgo.demostu.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class HelloController {

    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView();
        // 设置跳转视图，默认映射到src/main/resources/templates/{viewname}.html
        view.setViewName("index");
        // 设置属性
        view.addObject("title", "我的第一个web页面");
        view.addObject("desc", "欢迎进入battcn-web系统");

        Student student = new Student();
        student.setAge(27);
        student.setEmail("firemumu@qq.com");
        student.setName("moci");
        view.addObject("student", student);
        return view;
    }

}
