/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_HR;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Department {

    private int deparment_ID;
    private String department_name;

    private ArrayList<Employee> listEmployees = new ArrayList<Employee>();

    private ArrayList<Employee> managers = new ArrayList<Employee>() ;
    
    public Department() {
    }

    public Department(int deparment_ID, String department_name) {
        this.deparment_ID = deparment_ID;
        this.department_name = department_name;
    }

    /**
     * Fungsi untuk membaca daftar/table employee lalu dipindahkan ke list daftar employees;
     */
    public void readEmployees() {

    }

    /**
     * Fungsi untuk membaca manager sebuah departemen
     */
    public void readManager(){
        
    }
    /**
     * @return the deparment_ID
     */
    public int getDeparment_ID() {
        return deparment_ID;
    }

    /**
     * @param deparment_ID the deparment_ID to set
     */
    public void setDeparment_ID(int deparment_ID) {
        this.deparment_ID = deparment_ID;
    }

    /**
     * @return the department_name
     */
    public String getDepartment_name() {
        return department_name;
    }

    /**
     * @param department_name the department_name to set
     */
    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    /**
     * @return the listEmployees
     */
    public ArrayList<Employee> getListEmployees() {
        return listEmployees;
    }

    /**
     * @param listEmployees the listEmployees to set
     */
    public void setListEmployees(ArrayList<Employee> listEmployees) {
        this.listEmployees = listEmployees;
    }

    /**
     * @return the managers
     */
    public ArrayList<Employee> getManagers() {
        return managers;
    }

    /**
     * @param managers the managers to set
     */
    public void setManagers(ArrayList<Employee> managers) {
        this.managers = managers;
    }

    

    
}
