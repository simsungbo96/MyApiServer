package com.example.myapiserver;

import com.example.myapiserver.model.DiaryInfo;
import com.example.myapiserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/diaryinfo")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    @ResponseBody
    public List<DiaryInfo> getUser()
    {
        return userService.getUserList();
    }

    @PostMapping("id/post")
    @ResponseBody
    public int insertDiary(@RequestBody DiaryInfo diaryInfo)
    {

        System.out.print(diaryInfo.getTitle());
        return userService.insertDiaryList(diaryInfo);
    }

}