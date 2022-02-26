package ch5Project.Family;

import java.util.List;

public class Family {
    private List<Person> personList;
    private int numberOfFamily;


    public List<Person> getPersonList() {
        this.numberOfFamily++;
        return personList;
    }

    public void setTeacherList(List<Person> personList) {
        this.personList = personList;
    }

}
