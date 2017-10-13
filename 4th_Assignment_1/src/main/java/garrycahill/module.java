package garrycahill;

import java.util.ArrayList;

public class module {

    private String name;
    private String id;
    private ArrayList<student> students;

    public module(String name, String id, ArrayList<student> students) {
        this.name = name;
        this.id = id;
        this.students = students;
    }

    public void addStudent(student student) {
        this.students.add(student);
        student.addModule(this);
    }

    public void removeStudent(student student) {
        int index = this.students.indexOf(student);
        this.students.remove(index);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<student> students) {
        this.students = students;
    }
}