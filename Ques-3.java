package pk;

import java.util.*;
import java.util.stream.Collectors;
public class Employees{
    int empid, empSalary;
    String empName,empDesignation, empLocation;
    Employees(int id, int salary, String name, String des, String loc){
        empid = id;
        empName = name;
        empSalary = salary;
        empDesignation = des;
        empLocation = loc;
    }

    public static void main(String[] args) {
        List<Employees> l1=new ArrayList<>();
        l1.add(new Employees(1, 72000, "ABC", "Analyst", "Delhi"));
        l1.add(new Employees(2, 45000, "YGV", "HR", "Ludhiana"));
        l1.add(new Employees(3, 24000, "VBP", "CEO", "Phagwara"));
        l1.add(new Employees(4, 35750, "TRC", "CTO", "Chennai"));
        l1.add(new Employees(5, 45000, "BCO", "Manager", "Rajkot"));
        l1.add(new Employees(6, 10240, "MEX", "Designer", "Mumbai"));
        l1.add(new Employees(7, 69800, "AWQ", "Salesman", "Noida"));
        l1.add(new Employees(8, 54320, "LGR", "Trainee", "Meerut"));
        l1.add(new Employees(9, 76500, "BZA", "Analyst", "JnK"));
        l1.add(new Employees(10, 50000, "BGY", "Director", "Lucknow"));

        List<String> s=l1.stream().map(n->n.empName).collect(Collectors.toList());
        System.out.println(s);
        l1.stream().filter(n->n.empSalary>50000).forEach(c->System.out.print(c.empSalary+" "));
        System.out.println();
        l1.stream().filter(n->n.empLocation.charAt(0)=='M').forEach(c->System.out.print(c.empLocation+" "));
        System.out.println();
        l1.stream().filter(n->n.empDesignation.charAt((n.empDesignation.length()-1)) == 'e').forEach(c->System.out.print(c.empDesignation+" "));
        System.out.println();
    }
}