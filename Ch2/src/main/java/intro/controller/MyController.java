package intro.controller;

import intro.service.MyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *Controller 는 사용자의 요청을 처음으로 받아서, 어떤 작업을 해야할지 판단하고, 그작업을 Service 에게 시키는 역할
 *Service 는 실제로 처리해야 할 일(기능)을 담아두는 클래스 이다
 */
@Controller
public class MyController {
    @GetMapping("/")
    public String index() {
        return "index"; // templates/index.html
    }

    @PostMapping("/submit")
    public String submitForm(
            @RequestParam("name") String name,
            @RequestParam("age") int age,
            @RequestParam("mbti") String mbti,
            @RequestParam("food") String food,
            @RequestParam("color") String color,
            Model model) {
        System.out.println("MyController.submitForm");
        // 모델에 담아서 Thymeleaf로 전달
        MyService.process(color,mbti,model);
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("mbti", mbti);
        model.addAttribute("food", food);
        model.addAttribute("color", color);

        return "submit"; // hello.html 렌더링
    }
}
