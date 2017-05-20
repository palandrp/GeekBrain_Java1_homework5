package ru.kimdo;

import java.util.ArrayList;
import java.time.*;

/**
 * @author Pavel Petrikovskiy
 * @version 20.05.17.
 */

public class J1HW4 {

    public static void main(String[] args) {

        ArrayList<Employee> arrayStaff = new ArrayList<Employee>();

        arrayStaff.add(new Employee("Иванов Иван Иванович",
                "Главный инженер",
                "ivanov@tipichnayafirma.com",
                "+7(945)123-45-67",
                "252000",
                "55"));
        arrayStaff.add(new Employee("Иванов Петр Иванович",
                "Заместитель главного инженера",
                "ivanov_petr@tipichnayafirma.com",
                "+7(945)123-45-68",
                "252000",
                "26"));
        arrayStaff.add(new Employee("Иванова Галина Степановна",
                "Помощник главного инженера",
                "ivanova@tipichnayafirma.com",
                "+7(945)123-45-69",
                "252000",
                "50"));
        arrayStaff.add(new Employee("Ивановa Мария Олеговна",
                "Помощник заместителя главного инженера",
                "ivanova_mariya@tipichnayafirma.com",
                "+7(945)123-45-70",
                "252000",
                "24"));
        arrayStaff.add(new Employee("Абдулов Исхат Рафитович",
                "рабочий",
                "null",
                "null",
                "18000",
                "35"));

        arrayStaff.forEach( (if (x.getAge() > 40)) -> x.printEmployee() );

    }
}

class Employee {

    private String fio;
    private String thePost;
    private String email;
    private String phone;
    private String salary;
    private String age;
    private Year stamp;

    Employee   (String fio,
                String thePost,
                String email,
                String phone,
                String salary,
                String age) {

        this.fio 		= fio;
        this.thePost 	= thePost;
        this.email 		= email;
        this.phone 		= phone;
        this.salary 	= salary;
        this.age 		= age;
        this.stamp		= Year.now();
    }

    void printEmployee() {
        System.out.println(fio);
        System.out.println(thePost);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(salary);
        System.out.println(age);
    }

    int getAge() {
        int buffer = Integer.parseInt(this.age);
        Year now = Year.now();
        int actualAge = buffer + (now.getValue() - this.stamp.getValue());
        return actualAge;
    }
}