package java8.complexprogramme;
import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String department;
    private double salary;
    private List<String> skills;

    public Employee(String name, double salary, String department, List<String> skills) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "', salary=" + salary + ", skills=" + skills + '}';
    }

    public static void main(String[] args) {
        List<String> skillsSet1 = Arrays.asList("Java", "Spring Boot", "Accounting", "Git", "Communication", "SAP", "SQL", "Docker", "Payroll", "Policy Making", "Microservices");
        List<String> skillsSet2 = Arrays.asList("Python", "Django", "REST API", "Git", "REST API", "Taxation", "PostgreSQL", "Recruitment", "HRMS", "Docker", "Employee Relations", "Spring Boot");
        List<String> skillsSet3 = Arrays.asList("Java", "Accounting", "SQL", "Taxation", "REST API", "Tally", "SAP", "Compliance");
        List<String> skillsSet4 = Arrays.asList("Communication", "Tally", "PostgreSQL", "Python", "Compliance", "Django", "Microservices", "Recruitment", "Payroll", "HRMS", "Policy Making", "Employee Relations");

        Employee e1 = new Employee("Alice", 60000, "IT", skillsSet1);
        Employee e2 = new Employee("Bob", 65000, "IT", skillsSet1);
        Employee e3 = new Employee("Charlie", 70000, "Finance", skillsSet3);
        Employee e4 = new Employee("Alice", 55000, "HR", skillsSet4);
        Employee e5 = new Employee("Ethan", 58000, "HR", skillsSet4);
        Employee e6 = new Employee("Fiona", 62000, "Finance", skillsSet3);
        Employee e7 = new Employee("Charlie", 75000, "IT", skillsSet2);
        Employee e8 = new Employee("Hannah", 67000, "Marketing", skillsSet4);
        Employee e9 = new Employee("Bob", 72000, "Marketing", skillsSet2);
        Employee e10 = new Employee("Fiona", 80000, "IT", skillsSet1);

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
        Map<String, Long> countByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("1.------Sort By Department and Return Emploee Name only---------------------------");
        Map<String, List<String>> namesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(namesByDept);
        namesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.toList(),
                                x->x.stream().map(a->a.getName())
                                        .collect(Collectors.toList()))));
        System.out.println(namesByDept);

        System.out.println("2.------Sort By Skill---------------------------");
        var sortEmployeeBySkill=employees.stream().map(
                x->{
                    x.setSkills(x.getSkills().stream().sorted(String::compareTo).collect(Collectors.toList()));
                   return x;
                }
        ).collect(Collectors.toList());
        System.out.println(sortEmployeeBySkill);


        System.out.println("3.------find employees with the same name and sort them by salary--------------");
        var duplicateNames = employees.stream()
                .sorted((a,b)->a.getName().compareTo(b.getName()))
                .sorted((c,d)->{
                    if(c.getName()==d.getName())
                        return c.getSalary()>d.getSalary()?1:c.getSalary()==d.getSalary()?0:-1;
                    return 0;
                }).collect(Collectors.toList());
        System.out.println(duplicateNames);

        var result=employees.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary))
                        .collect(Collectors.toList());

        System.out.println(result+"-----------");

        System.out.println("----find the highest paid employee in each department-------");

        var highestSalaryBydept=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        System.out.println(highestSalaryBydept);
        highestSalaryBydept=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.collectingAndThen(Collectors.toList(),
                        x->x.stream().max(Comparator.comparing(Employee::getSalary)))));
        System.out.println(highestSalaryBydept);


        System.out.println("------sort the name by department------");
        Map<String, List<String>> sortedNamesByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()
                                                .sorted()
                                                .collect(Collectors.toList())
                                )
                        )
                ));
        sortedNamesByDept.forEach((dept, names) -> {
            System.out.println("Department: " + dept);
            names.forEach(name -> System.out.println("  " + name));
        });

        System.out.println("-----------Top 5 Common SKills----------------");
        var commonSkills=employees.stream().flatMap(x->x.getSkills().stream())
                .collect(Collectors.groupingBy(x->x,Collectors.counting()))
                .entrySet().stream()
                .sorted((a,b)->b.getValue().intValue()-a.getValue().intValue())
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(commonSkills);

        System.out.println("-----------Salary Increase each department who have less salary");
        var lessSalary=employees.stream().collect(Collectors.groupingBy(x->x.getDepartment()
        ,Collectors.toList())).entrySet().stream()
                .map(x->{
                    x.setValue(x.getValue().stream().sorted((a,b)->
                    {
                        return a.getSalary()>b.getSalary()?1:a.getSalary()==b.getSalary()?0:-1;
                    }).collect(Collectors.toList()));
                    x.getValue().get(0).setSalary(x.getValue().get(0).getSalary()+10000);
                    return x;
                }).collect(Collectors.toList());
        System.out.println(lessSalary);

        System.out.println("-----Increase 120% salary of particular department-----");
        var itSalary=employees.stream().map(x->{
            if(x.getDepartment().equalsIgnoreCase("it")){
              x.setSalary(x.getSalary()*1.2);
            }
            return x;
        }).collect(Collectors.toList());
        System.out.println(itSalary);

        System.out.println("Employuee Enhancement");
        }
}
