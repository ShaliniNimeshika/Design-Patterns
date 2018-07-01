/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.structural.composite;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Shalini PC
 */
public class HeadDepartment implements Department{

    private Integer id;
    private String name;
 
    private final ArrayList<Department> childDepartments;
 
    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }
 
    public void printDepartmentName() {
        for (int i = 0; i < childDepartments.size(); i++) {
            childDepartments.get(i).printDepartmentName();
        }
    }
 
    public void addDepartment(Department department) {
        childDepartments.add(department);
    }
 
    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
    
}
