/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jarkom;

/**
 *
 * @author rinda
 */
public class SupplierItem {    
    private int id_SCategory;
    private String SCategory_name;
    public SupplierItem(int id_SCategory, String SCategory_name)
    {
    
    this.id_SCategory = id_SCategory;
    this.SCategory_name = SCategory_name;
    }
    public int getId_SCategory(){
        return id_SCategory;
    }
    public void setId_SCategory(int id_SCategory){
        this.id_SCategory = id_SCategory;
    }
    public String getSCategory_name(){
        return SCategory_name;
    } 
    public void setSCategory-name(String SCategory_name){
        this.SCategory_name= SCategory_name;
    }
}
