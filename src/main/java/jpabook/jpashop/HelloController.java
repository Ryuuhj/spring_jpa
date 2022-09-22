package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) { //Model에 데이터 실어서 뷰로 넘길 수 있음
        model.addAttribute("data", "hello!!!");
        //Name이 data인 키의 값을 hello!!!로 넘김
        return "hello";
        //return == 화면(뷰) 이름 --> templates 폴더 아래 해당 뷰 (html 파일) 추가
    }
}
