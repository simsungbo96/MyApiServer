package com.example.myapiserver.service;

import com.example.myapiserver.model.DiaryInfo;
import com.example.myapiserver.myserverMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    myserverMapper mapper;

    public List<DiaryInfo> getUserList() {
        return mapper.getUser();
    }

    public int insertDiaryList(DiaryInfo diaryInfo)
    {
        return mapper.insertDiary(diaryInfo);
    }

}