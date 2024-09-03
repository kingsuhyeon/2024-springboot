package org.example.ch01;

import jakarta.persistence.*;


@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    @Column(name = "id", nullable = false, updatable = false) // null을 허용하지 않고, 수정할수 없는 필드
    private long id;

    @Column(name = "name", nullable = false) //null은 허용하지 않음
    private String name;
}
