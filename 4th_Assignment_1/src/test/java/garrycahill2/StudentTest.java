package garrycahill2;


import org.joda.time.LocalDate;
import org.junit.Test;

import garrycahill.module;
import garrycahill.student;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getAge() throws Exception {
        LocalDate testDob = new LocalDate(1996, 5, 7);
        student testStudent = new student("Garry", "Cahill", "14416988", testDob);
        int generatedAge = testStudent.getAge();
        int expectedAge = 21;

        assertEquals(expectedAge, generatedAge);
    }

    @org.junit.Test
    public void getUsername() throws Exception {
        LocalDate testDob = new LocalDate(1996, 5, 7);
        student testStudent = new student("Garry", "Cahill", "14416988", testDob);
        String generatedUsername = testStudent.getUsername();
        String expectedUsername = "garrycahill21";

        assertEquals(expectedUsername, generatedUsername);
    }

    @Test
    public void addModule() throws Exception {
        student student = new student("Garry", "Cahill", "14416988", new LocalDate(1996, 5, 7));
        module module = new module("Programming", "CT123", new ArrayList<student>());

        student.addModule(module);
    }

}