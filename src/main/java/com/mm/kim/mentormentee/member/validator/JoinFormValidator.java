package com.mm.kim.mentormentee.member.validator;

import com.mm.kim.mentormentee.member.MemberRepository;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.regex.Pattern;

@Component
public class JoinFormValidator implements Validator {

    private final MemberRepository memberRepository;

    public JoinFormValidator(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return JoinForm.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        JoinForm form = (JoinForm) target;

        //1. 비밀번호가 8글자 이상, 숫자 영문자 특수문자 조합인지 확인
        boolean valid = Pattern.matches("(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^a-zA-Zㄱ-힣0-9]).{8,}", form.getPassword());
        if(!valid){
            errors.rejectValue("password", "err-pw", "비밀번호는 8글자 이상의 숫자 영문자 특수문자 조합입니다.");
        }

        //2. 전화번호가 9~11자리의 숫자
        valid = Pattern.matches("^\\d{6,8}$", form.getPhone());
        if(!valid) {
            errors.rejectValue("phone", "err-phone", "전화번호는 9~11자리의 숫자입니다.");
        }



    }
}
