package com.alt.altbackendassignment.service;

import java.util.ArrayList;

public interface StudentService {
    public void registerStudent(Student student);
    public ArrayList<Student> getStudents(String name);
}
