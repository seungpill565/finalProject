package com.spring.jj9.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Member {
	
    private String member_id;
    private String member_password;
    private String member_email;
    private String member_phoneNum;
    private Date member_birthday;
    private Integer member_point;
    private String member_name;
    private String member_nickName;
    private String member_comments;
    
    //비밀번호 재확인이 필요
    private String member_rePassword;
    //핸드폰번호
    private String phone1;
    private String phone2;
    private String phone3;
    //idCheck
    private String check_id;
}