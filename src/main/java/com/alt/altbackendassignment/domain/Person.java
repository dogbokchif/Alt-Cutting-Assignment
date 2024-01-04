package com.alt.altbackendassignment.domain;

import lombok.Data;

/**
 * 학생
 */
@Data
public class Person {
    /**
     * 고유번호
     *
     * DB 특성
     * bigint
     *
     * primary key
     * unique
     * auto increment
     * not null
    */
    private Long idx;
    /**
     * 이름
     *
     * DB 특성
     * varchar(64)
     *
     * not null
     */
    private String name;
}
