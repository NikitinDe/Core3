package task.io;

import java.util.ArrayList;
import java.util.List;
// TODO: Реализуйте класс, который представляет список студентов. Реализуйте метод для добавления
//  студента в список. Обработайте исключение, если список уже содержит студента с таким же именем.

public class ListStudent {
    public static void main(String[] args) throws Exception {
        ListStudent student1 = new ListStudent("паша",25);
        addListStudent(student1);
        addListStudent(student1);

    }
    private String name;
    private int age;
    private static List<ListStudent> studentList = new ArrayList<>();
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
       public static void addListStudent(ListStudent str) {
         for (ListStudent st : studentList) {
            if (st.getName().equals(str.getName())) {
                System.out.println("Данный студент уже учиться!");
            }
        }
        studentList.add(str);

    }
}
