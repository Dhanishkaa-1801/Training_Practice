package basic_examples;

public class EmployeeDetails {

    // Employee details
    String empId;
    String empName;
    int empAge;
    String empGender;
    String empDob;
    long empPhoneNo;
    String empEmail;

    // Education and job details
    String eduQualification;
    String empType;
    String empDept;
    String empRole;
    String empExperience;

    // Salary details
    double empSalary;
    double basicPay;
    double TA;              // Travel Allowance
    double DA;              // Dearness Allowance
    double HRA;             // House Rent Allowance
    double bonus;
    double deduction;
    double PF;              // Provident Fund
    double tax;

    // Payslip details
    String payMonth;
    String payDate;
    double grossSalary;
    double netSalary;

    // Calculate salary
    void calculateSalary() {
        grossSalary = basicPay + TA + DA + HRA + bonus;
        deduction = PF + tax;
        netSalary = grossSalary - deduction;
    }

    // Display payslip
    void displayPayslip() {

        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department: " + empDept);
        System.out.println("Role: " + empRole);

        System.out.println("Basic Pay: " + basicPay);
        System.out.println("TA: " + TA);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("Bonus: " + bonus);

        System.out.println("Gross Salary: " + grossSalary);

        System.out.println("PF: " + PF);
        System.out.println("Tax: " + tax);
        System.out.println("Total Deduction: " + deduction);

        System.out.println("Net Salary: " + netSalary);
    }
}

//basicPay = 30000;
//TA = 2000;
//DA = 3000;
//HRA = 5000;
//bonus = 2000;
//
//PF = 1800;
//tax = 1200;
//
//Then:
//
//Gross Salary = 42,000
//Total Deduction = 3,000
//Net Salary = 39,000
