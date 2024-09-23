package com.demo.grpc.controller;

import com.demo.grpc.client.GrpcMemberClient;
import com.test.member.grpc.MemberProto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/member")
@RequiredArgsConstructor
@RestController
public class MemberController {

    private final GrpcMemberClient grpcMemberClient;

    @PostMapping("/create")
    public String createMember() {
        MemberProto.MemberCreateResponse member = grpcMemberClient.createMember(
                MemberProto.MemberRequest
                        .newBuilder()
                        .setEmail("test")
                        .setName("test")
                        .setPassword("test")
                        .build()
        );
        return member.toString();
    }

}