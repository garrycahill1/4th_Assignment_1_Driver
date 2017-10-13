package garrycahill;


import org.joda.time.LocalDate;

import java.util.ArrayList;


public class courseProgramme {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<module> modules;

    public courseProgramme(String name, LocalDate startDate, LocalDate endDate, ArrayList<module> modules) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.modules = modules;
    }

    public void addModule(module module) {
        this.modules.add(0, module);

        for(student student: module.getStudents()) {
            student.setCourse(this);
        }
    }

    public void removeModule(module module) {
        int index = this.modules.indexOf(module);
        this.modules.remove(index);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ArrayList<module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<module> modules) {
        this.modules = modules;
    }
}