package com.alt.altbackendassignment.service.impl;

import com.alt.altbackendassignment.domain.Person;
import com.alt.altbackendassignment.service.PersonService;
import com.alt.altbackendassignment.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonServiceImpl implements PersonService, StudentService {
    /**
     * Person 을 삭제하는 서비스입니다.
     * @param 고유번호
     */
    @Override
    public void delete(Long idx) {

    }

    /**
     * Person을 생성합니다.
     * @param person
     */
    @Override
    public void register(Person person) {

    }

    /**
     * Student를 생성합니다.
     * 만약 이미 Person에 있다면, 대상을 학생으로 전환합니다.
     * 만약 없다면, Person에 추가합니다.
     * 만약 idx가 이미 있으나, 이름이 다를경우 BAD_REQUEST:"different names"를 반환합니다.
     *
     * ! 해당 메서드에 return을 사용하지마세요.
     * @param person
     */
    @Override
    public void registerStudent(Student student) {

    }

    /**
     * Person을 가져옵니다.
     * @param 이름
     * @return 검색된 모든 Person(이름을 기준으로 검색되며, 이름에 부분적으로 포함되어도 가져옵니다) ex. 이찬 -> 이찬혁, 이찬민..
     */
    @Override
    public ArrayList<Person> getPersons(String name) {
        return null;
    }

    /**
     * Student을 가져옵니다.
     * @param 이름
     * @return 검색된 모든 Student(이름을 기준으로 검색되며, 이름에 부분적으로 포함되어도 가져옵니다)
     */
    @Override
    public ArrayList<Student> getStudents(String name) {
        return null;
    }
}
