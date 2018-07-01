/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.structural.composite;

/**
 *
 * @author Shalini PC
 */
public class CompositeDemo {
    public static void main(String args[]) {
        Department salesDepartment = new SalesDepartment(
          1, "Sales department");
        Department financialDepartment = new FinancialDepartment(
          2, "Financial department");
 
        HeadDepartment headDepartment = new HeadDepartment(
          3, "Head department");
 
        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);
 
        headDepartment.printDepartmentName();
    }
}
