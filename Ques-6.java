class Employee {
    String name;
    int year;
    String address;

    Employee(String a, int b, String c){
        name = a;
        year = b;
        address = c;
    }

    static void print(Employee e1){
        System.out.format("%10s%24d%28s", e1.name, e1.year, e1.address);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Robert",1994,"64C-WallStreet");
        Employee e2 = new Employee("Sam",2000,"68D-WallStreet");
        Employee e3 = new Employee("John",1999,"26B-WallStreet");
        System.out.format("%10s%24s%28s", "Name", "Year of Joining", "Address");
        System.out.println();
        print(e1);
        print(e2);
        print(e3);
    }
}