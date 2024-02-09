package task.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// TODO: Реализуйте класс, который представляет список студентов. Реализуйте метод для добавления
//  студента в список. Обработайте исключение, если список уже содержит студента с таким же именем.

public class ListStudent {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя:");
        String name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        ListStudent listStudent = new ListStudent(name,age);
        addListStudent(listStudent);

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
       public static void  addListStudent(ListStudent listStudent) {


         for (ListStudent st : studentList) {
            if (st.getName().equals(listStudent.getName())) {
                System.out.println("Данный студент уже учиться!");
            }
        }
        studentList.add(listStudent);
         for(ListStudent re:studentList){
             System.out.println(re);
         }


    }
}
