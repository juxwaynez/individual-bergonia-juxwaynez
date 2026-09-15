package com.joysistvi.stage2.activity15;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = {
                new RegularEmployee("Kimchi", 17000),
                new SalesEmployee("Soju", 14000, 6000),
                new ContractualEmployee("Buldak", 180, 90)
        };

        for (Employee e : employees) {

            e.printPayslip();

            if (e instanceof Bonusable) {

                Bonusable b = (Bonusable) e;

                if (b.isEligibleForBonus()) {
                    System.out.println("Bonus: " + b.computeBonus());
                }
            }

            if (e instanceof Auditable) {

                Auditable a = (Auditable) e;

                a.logSalaryComputation(a.generateEmployeeId());
            }

            System.out.println("--------------------------------");
        }
    }
}
