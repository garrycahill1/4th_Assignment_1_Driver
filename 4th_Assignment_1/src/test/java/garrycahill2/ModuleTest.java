package garrycahill2;

import java.util.ArrayList;

import org.joda.time.LocalDate;
import org.junit.Test;

import garrycahill.module;
import garrycahill.student;

public class ModuleTest {
    @Test
    public void addStudent() throws Exception {
        student student = new student("Garry", "Cahill", "14416988", new LocalDate(1996, 5, 7));
        module module = new module("Software Engineering", "CT417", new ArrayList<student>());

        module.addStudent(student);
    }

}