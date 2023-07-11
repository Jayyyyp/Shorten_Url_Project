package kr.gamso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyPageController {

    @GetMapping("/myPage")
    public String showMyPage() {
        // myPage.jsp 파일로 이동
        return "myPage";
    }
}
