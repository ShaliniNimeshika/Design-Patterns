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
public class FinancialDepartment implements Department{
    private Integer id;
    private String name;

    FinancialDepartment(int i, String financial_department) {
        this.id = i;
        this.name = financial_department;
    }
    
    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
    
}
