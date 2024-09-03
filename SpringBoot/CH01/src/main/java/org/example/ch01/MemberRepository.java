package org.example.ch01;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> /*어떠한 객체를 사용할지와 객체 타입의 아이디는 Long이라는걸 의미*/ {

}
