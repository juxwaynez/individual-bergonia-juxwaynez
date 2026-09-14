package com.joysistvi.stage2.activity14;

public class ManagerEmployee extends Employee {

    public ManagerEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double computeSalary() {
        return baseSalary + 5000;
    }

    Employee[] employees = {
            new RegularEmployee("Kimchi", 16000),
            new SalesEmployee("Soju", 13000, 4000),
            new ContractualEmployee("Buldak", 180, 60),
            new ManagerEmployee("Sangyup", 50000)
    };


}
