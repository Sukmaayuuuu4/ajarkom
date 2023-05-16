/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jarkom;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author rinda
 */
public class DBQuerySupplier {
        public HashMap<String,Integer> populateCombo(){
        HashMap<String, Integer> map = new HashMap<String, Integer >();
        Connection con = Connections.getConnections();
        Statement st;
        ResultSet rs;
        try{
            st = con.createStatement();
            rs = st.executeQuery("SELECT  id_SCategory,SCategory_name FROM "
                    + "supplier_category");
            SupplierItem supplierItem;
            while (rs.next()){
                supplierItem = new SupplierItem(rs.getInt(1),rs.getString(2));
                map.put(SupplierItem.getSCategory_name());
                        supplierItem.getId_SCategory());
            }
        }catch (SQLException ex){
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE,null,ex);
            }
        return map;
        }
    
}
