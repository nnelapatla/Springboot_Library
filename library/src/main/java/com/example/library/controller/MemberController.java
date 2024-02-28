package com.example.library.controller;
import com.example.library.entity.LibraryMember;
import com.example.library.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    // Get a member by memberId
    @GetMapping("/{memberId}")
    public LibraryMember getMember(@PathVariable Integer memberId) {
        return memberService.getMember(memberId);
    }

    // Create a member
    @PostMapping
    public LibraryMember createMember(@RequestBody LibraryMember member) {
        return memberService.createMember(member);
    }

    // Update a member
    @PutMapping("/{memberId}")
    public LibraryMember updateMember(@PathVariable Integer memberId, @RequestBody LibraryMember updatedMember) {
        return memberService.updateMember(memberId, updatedMember);
    }

    // Delete a member by memberId
    @DeleteMapping("/{memberId}")
    public void deleteMember(@PathVariable Integer memberId) {
        memberService.deleteMember(memberId);
    }
}
