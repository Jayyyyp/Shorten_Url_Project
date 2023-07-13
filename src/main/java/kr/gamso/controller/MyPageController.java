package kr.gamso.controller;

import kr.gamso.service.UsersService;
import org.springframework.stereotype.Controller;

@Controller
public class MyPageController {

    UsersService usersService;


    public MyPageController(UsersService usersService){
        this.usersService = usersService;
    }

//    @GetMapping("/myPage")
//    public String showMyPage() {
//
//        return "myPage";
//    }

//    @GetMapping("/myPage")
//    public String getUserInfo(Model model) {
//        // 임의로 지정 추후 수정 필요
//        String userId = "asd";
//        long urlId = 2;
//        // userId를 이용하여 회원 정보 조회
//        UserInfoDTO userInfo = usersService.getUserInfoById(userId);
//
//        List<FindByMemberNumberDTO> urlInfo = urlService.findByMemberNumber(urlId);
//
////        // 회원가입 날짜를 원하는 형식으로 포맷팅하여 모델에 저장
////        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
////        String formattedSignupDate = dateFormat.format(userInfo.getSignupDate());
////        userInfo.setFormattedSignupDate(formattedSignupDate);
//
//        // 모델에 회원 정보를 저장하여 JSP 파일에서 사용할 수 있도록 함
//        model.addAttribute("userInfo", userInfo);
//        model.addAttribute("urlInfo", urlInfo);
//
//        // userInfo.jsp로 이동
//        return "myPage";
//    }
}
