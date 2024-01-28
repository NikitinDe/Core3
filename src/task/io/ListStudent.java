package task.io;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
    private String name;
    private int age;
     public ListStudent(String name,int age){
         this.name=name;
         this.age=age;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ListStudent {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    List<ListStudent> studentList = new ArrayList<>();

    public void addListStudent(ListStudent str) {
        for (ListStudent st : studentList) {
            if (st.getName().equals(str.getName())) {
                throw new ArrayStoreException("Данный студент уже учиться!");
            }
        }
        studentList.add(str);

    }
}
