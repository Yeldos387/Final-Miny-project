package com.company;

import java.util.ArrayList;

public interface DAO {

     Students getStudentByName(String name);
     ArrayList<Students> getStudensts();
     void addStudent(Students students);


}
