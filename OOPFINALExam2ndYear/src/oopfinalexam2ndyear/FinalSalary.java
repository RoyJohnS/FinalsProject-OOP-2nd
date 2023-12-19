/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopfinalexam2ndyear;

/**
 *
 * @author 12
 */
public class FinalSalary {
    private SSS sss;
    private PagIbig pagIbig;
    private PhilHealth philHealth;

    public FinalSalary(SSS sss, PagIbig pagIbig, PhilHealth philHealth) {
        this.sss = sss;
        this.pagIbig = pagIbig;
        this.philHealth = philHealth;
    }

    public double calculateFinalSalary(double baseSalary) {
        double sssDeduction = sss.calculateSSSDeduction(baseSalary);
        double pagIbigDeduction = pagIbig.calculatePagIbigDeduction(baseSalary);
        double philHealthDeduction = philHealth.calculatePhilHealthDeduction(baseSalary);

        double finalSalary = baseSalary - sssDeduction - pagIbigDeduction - philHealthDeduction;

        return finalSalary;
    }
}

