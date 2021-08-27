package com.example.myapiserver.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class DiaryInfo {


    @JsonProperty("id")private int id;
    @JsonProperty("title")private String title;
    @JsonProperty("content")private String content;
    @JsonProperty("email")private String email;
}