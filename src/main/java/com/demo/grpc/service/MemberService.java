package com.demo.grpc.service;

import com.demo.grpc.dto.MemberSignUpRequestDTO;
import com.demo.grpc.entity.Member;
import com.demo.grpc.mapper.MemberMapper;
import com.demo.grpc.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    public Member createMember(MemberSignUpRequestDTO memberDTO) {
        Member member = memberMapper.dtoToEntity(memberDTO);
        return memberRepository.save(member);
    }

}