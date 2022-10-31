/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author riteesh
 */
public class Employees {
    
    private ArrayList<Employee> details;
    
    public Employees(){
        
        this.details = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<Employee> details) {
        this.details = details;
    }
    
    public Employee addnewEmployee(){
        
        Employee newEmployee = new Employee();
        details.add(newEmployee);
        return newEmployee;
    }
    
    public void deleteEmployee(Employee em){
        details.remove(em);
    }
}
