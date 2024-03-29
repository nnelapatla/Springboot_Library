package com.example.library.controller;

import com.example.library.entity.LibraryMember;
//import com.cis.batch33.library.model.Member;
import com.example.library.model.Member;
import com.example.library.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping
    public Member getMember(Integer memberId){

        return memberService.getMember(memberId);
    }

    // create a member
    @PostMapping
    public LibraryMember createMember(@RequestBody  LibraryMember member){
        return memberService.createMember(member);
    }

    @PutMapping
    public LibraryMember updateMember(@RequestBody LibraryMember LibraryMember){
        // Set the memberId for the member object to be updated
        return memberService.updateMember(LibraryMember);
    }

    @DeleteMapping
    public void deleteMember(Integer memberId){
        memberService.deleteMember(memberId);
    }
}