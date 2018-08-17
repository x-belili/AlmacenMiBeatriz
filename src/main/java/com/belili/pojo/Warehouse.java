package com.belili.pojo;
// Generated Aug 15, 2018 2:11:01 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Warehouse generated by hbm2java
 */
public class Warehouse  implements java.io.Serializable {


     private Integer idWarehouse;
     private User user;
     private String codeWarehouse;
     private String nameWarehouse;
     private String addressWarehouse;
     private String phone1Warehouse;
     private String phone2Warehouse;
     private Set products = new HashSet(0);

    public Warehouse() {
    }

	
    public Warehouse(User user, String codeWarehouse, String nameWarehouse, String addressWarehouse) {
        this.user = user;
        this.codeWarehouse = codeWarehouse;
        this.nameWarehouse = nameWarehouse;
        this.addressWarehouse = addressWarehouse;
    }
    public Warehouse(User user, String codeWarehouse, String nameWarehouse, String addressWarehouse, String phone1Warehouse, String phone2Warehouse, Set products) {
       this.user = user;
       this.codeWarehouse = codeWarehouse;
       this.nameWarehouse = nameWarehouse;
       this.addressWarehouse = addressWarehouse;
       this.phone1Warehouse = phone1Warehouse;
       this.phone2Warehouse = phone2Warehouse;
       this.products = products;
    }
   
    public Integer getIdWarehouse() {
        return this.idWarehouse;
    }
    
    public void setIdWarehouse(Integer idWarehouse) {
        this.idWarehouse = idWarehouse;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getCodeWarehouse() {
        return this.codeWarehouse;
    }
    
    public void setCodeWarehouse(String codeWarehouse) {
        this.codeWarehouse = codeWarehouse;
    }
    public String getNameWarehouse() {
        return this.nameWarehouse;
    }
    
    public void setNameWarehouse(String nameWarehouse) {
        this.nameWarehouse = nameWarehouse;
    }
    public String getAddressWarehouse() {
        return this.addressWarehouse;
    }
    
    public void setAddressWarehouse(String addressWarehouse) {
        this.addressWarehouse = addressWarehouse;
    }
    public String getPhone1Warehouse() {
        return this.phone1Warehouse;
    }
    
    public void setPhone1Warehouse(String phone1Warehouse) {
        this.phone1Warehouse = phone1Warehouse;
    }
    public String getPhone2Warehouse() {
        return this.phone2Warehouse;
    }
    
    public void setPhone2Warehouse(String phone2Warehouse) {
        this.phone2Warehouse = phone2Warehouse;
    }
    public Set getProducts() {
        return this.products;
    }
    
    public void setProducts(Set products) {
        this.products = products;
    }




}

