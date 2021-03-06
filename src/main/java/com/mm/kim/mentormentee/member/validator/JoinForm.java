package com.mm.kim.mentormentee.member.validator;

import com.mm.kim.mentormentee.member.Member;
import lombok.Data;

@Data
public class JoinForm {
    private String userId;
    private String userName;
    private String password;
    private String email;
    private String gender;
    private String address;
    private String countryCode;
    private String phone;
    private String nickname;
    private String role;
    private String kakaoJoin;

    public Member convertToMember(){
        Member member = new Member();
        member.setUserId(userId);
        member.setUserName(userName);
        member.setPassword(password);
        member.setEmail(email);
        member.setGender(gender);
        member.setAddress(address);
        member.setPhone(phone);
        member.setCountryCode(countryCode);
        member.setNickname(nickname);
        member.setRole(role);
        member.setKakaoJoin(kakaoJoin);
        return member;
    }

}
