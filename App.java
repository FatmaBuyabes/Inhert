package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Furssah");

        Employee razan = new Employee("Razan", "IT", 1000);

        System.out.println(razan);

        Manager fares = new Manager("Fares", "HR", 3000, 20);
        System.out.println(fares);

        Director fatma = new Director("Fatma", "Director", 1000, 20000);
        System.out.println(fatma);
        String[] skills = { "java", "cs" };

        Engineer esraa = new Engineer("Esraa", "CS", 1000, skills);
        System.out.println(esraa);

        SalesPerson ahmad = new SalesPerson("Ahmad", "sales", 1000, 1);
        System.out.println(ahmad);
    }
}
