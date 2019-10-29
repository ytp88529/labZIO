package com.example.labZIO.labZIO;

import io.vavr.collection.List;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentServiceTest {
    @Test
    public void getEmptyList() {
        final StudentService service = new StudentService();
        List<Student> students = service.getStudents();
        assertTrue(students.isEmpty());
    }


    @Test
    public void addStudent() {
        final StudentService service = new StudentService();
        final Student created = service.addStudent(new NewStudent("janusz", "25", "IP"));
        assertNotNull(created);
    }
    @Test
    public void addStudentIsReturned(){
        final StudentService service = new StudentService();
        final Student created = service.addStudent(new NewStudent("janusz", "25", "IP"));
        final List<Student> all = service.getStudents();
        assertEquals("janusz",all.get(0).name);
    }
    @Test
    public void addStudentHasNewId(){
        final StudentService service = new StudentService();
        final Student created = service.addStudent(new NewStudent("janusz", "25", "IP"));
        final Student created2 = service.addStudent(new NewStudent("janusz", "25", "IP"));
        assertNotEquals(created.id,created2.id);
    }
}