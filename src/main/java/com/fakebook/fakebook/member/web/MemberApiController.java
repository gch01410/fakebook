package com.fakebook.fakebook.member.web;

import com.fakebook.fakebook.member.service.MemberService;
import com.fakebook.fakebook.member.web.dto.MemberRegisterRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.NestedServletException;

@RequestMapping("/member")
@RequiredArgsConstructor
@RestController
public class MemberApiController {
    private final MemberService memberService;

    @PostMapping("/register")
    public Long register(@RequestBody MemberRegisterRequestDto requestDto) throws NestedServletException {
        Long userId = memberService.register(requestDto);
        return userId;
    }
}
