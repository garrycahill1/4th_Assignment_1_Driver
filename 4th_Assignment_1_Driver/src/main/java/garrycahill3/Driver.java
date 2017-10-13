package garrycahill3;

import java.util.ArrayList;

import org.joda.time.LocalDate;

import garrycahill.CourseProgramme;
import garrycahill.Module;
import garrycahill.Student;


public class Driver {

    public static void main(String[] args) {
        Student s1 = new Student("Garry", "Cahill", "14416988", new LocalDate(1996, 5, 7));
        Student s2 = new Student("John", "Doe", "14121314", new LocalDate(1996, 10, 12));
        Student s3 = new Student("Jane", "Doefield", "13514868", new LocalDate(1995, 12, 1));
        Student s4 = new Student("Bobby", "O'Tool", "14448521", new LocalDate(1996, 6, 28));
        Student s5 = new Student("Lucy", "Flynn", "14896541", new LocalDate(1996, 12, 17));

        Module S_E_III = new Module("Software Engineering III", "CT417", new ArrayList<Student>());
        S_E_III.addStudent(s1);
        S_E_III.addStudent(s2);
        S_E_III.addStudent(s4);

        Module M_L_and_D_M = new Module("Machine Learning and Data Mining", "CT475", new ArrayList<Student>());
        M_L_and_D_M.addStudent(s1);
        M_L_and_D_M.addStudent(s2);
        M_L_and_D_M.addStudent(s4);

        Module S_on_C_1 = new Module("System on Chip I", "EE451", new ArrayList<Student>());
        S_on_C_1.addStudent(s1);
        S_on_C_1.addStudent(s2);
        S_on_C_1.addStudent(s4);
        S_on_C_1.addStudent(s5);

        Module T_S_A = new Module("Telecommunications Software Applications", "EE453", new ArrayList<Student>());
        T_S_A.addStudent(s1);
        T_S_A.addStudent(s2);
        T_S_A.addStudent(s3);
        T_S_A.addStudent(s4);
        T_S_A.addStudent(s5);

        CourseProgramme BP4 = new CourseProgramme("Electronic and Computer Engineering", new LocalDate(2017, 9, 4), new LocalDate(2018, 5, 20), new ArrayList<Module>());
        BP4.addModule(S_E_III);
        BP4.addModule(M_L_and_D_M);
        BP4.addModule(T_S_A);
        BP4.addModule(S_on_C_1);

        CourseProgramme BE4 = new CourseProgramme("Electronic and Electrical Engineering", new LocalDate(2017, 6, 4), new LocalDate(2018, 5, 20), new ArrayList<Module>());
        BE4.addModule(T_S_A);
        BE4.addModule(S_on_C_1);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        for(Student student : students) {
            System.out.println("Name: " + student.getFirstName() + " " + student.getSurname());
            System.out.println("Course: " + student.getCourse().getName());
            System.out.print("Modules: ");
            for (Module module : student.getModules()) {
                System.out.print(module.getName()+ ", ");
            }
            System.out.println("\n");
        }



    }

}