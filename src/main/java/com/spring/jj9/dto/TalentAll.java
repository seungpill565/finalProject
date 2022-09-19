package com.spring.jj9.dto;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TalentAll {
    //talent_list
        private    Integer    talent_id;
        private    Integer cate_id;
        private    String    member_id;
        private    String    talent_title;
        private    String    talent_image;
        private    Date    talent_date;
        private    Integer    talent_price;
        private    String    talent_service_exp;
        private    String    talent_curriculum;
        private    Integer   talent_workday;
        private    String    talent_summary;
        private    Integer   talent_paycount;
        
        // 페이징 시 필요한 컬럼 / 테이블에는 속해있지 않다
        private    Integer   rn; //rownum

        // category

        private String cate_main;
        private String cate_sub;

        //Member

        private String member_password;
        private String member_email;
        private String member_phonenum;
        private Date member_birthday;
        private Integer member_point;
        private String member_name;
        private String member_nickname;
        private String member_comments;


        //Review 

        private Integer review_id;
        private Integer review_grade;
        private String review_content;
        private Date review_date;


}