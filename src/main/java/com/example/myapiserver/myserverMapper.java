package com.example.myapiserver;


import com.example.myapiserver.model.DiaryInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface myserverMapper {
    List<DiaryInfo> getUser();

    int insertDiary(DiaryInfo diaryInfo);
}
