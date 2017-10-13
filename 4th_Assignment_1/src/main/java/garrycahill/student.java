package garrycahill;

import org.joda.time.LocalDate;
import org.joda.time.Years;
import java.util.ArrayList;

public class student {

    private String firstName;
    private String lastName;
    private String userName;
    private int age;
    private String stidentId;
    private LocalDate dateOfBirth;
    private ArrayList<module> modules = new ArrayList<module>();
    private courseProgramme course;


    public student(String firstName,String lastName, String studentId, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stidentId = studentId;
        this.dateOfBirth = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return lastName;
    }

    public void setSurname(String surname) {
        this.lastName = surname;
    }

    public String getUsername() {
        String username = this.firstName + this.lastName + this.getAge();
        return username.toLowerCase();
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public int getAge() {
        Years age = Years.yearsBetween(this.dateOfBirth, new LocalDate());
        return age.getYears();
    }

    public String getId() {
        return stidentId;
    }

    public void setId(String id) {
        this.stidentId = id;
    }

    public LocalDate getDob() {
        return dateOfBirth;
    }

    public void setDob(LocalDate dob) {
        this.dateOfBirth = dob;
    }

    public ArrayList<module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<module> modules) {
        this.modules = modules;
    }

    public void addModule(module module) {
        this.modules.add(0, module);
    }

    public courseProgramme getCourse() {
        return course;
    }

    public void setCourse(courseProgramme course) {
        this.course = course;
    }
}