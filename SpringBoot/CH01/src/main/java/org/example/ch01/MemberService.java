package org.example.ch01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired //memberRepository 의존주입 필요
    MemberRepository memberRepository;

    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
