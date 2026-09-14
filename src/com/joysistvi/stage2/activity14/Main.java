package com.joysistvi.stage2.activity14;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new RegularEmployee("Kimchi", 16000),
                new SalesEmployee("Soju", 13000, 4000),
                new ContractualEmployee("Buldak", 180, 60)
        };

        for (Employee e : employees) {
            e.printPayslip();
        }
    }
}
