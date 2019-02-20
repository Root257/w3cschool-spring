package com.w3cschool;
import java.util.*;
public class JavaCollection {
    List addressList;
    Set  addressSet;
    Map  addressMap;
    Properties addressProp;
    public void setAddressList(List addressList){
        this.addressList = addressList;
    }
    public List getAddressList(){
        System.out.println("List Elements :"  + addressList);
        return this.addressList;
    }
    public void setAddressSet(Set addressSet){
        this.addressSet = addressSet;
    }
    public Set getAddressSet(){
        return this.addressSet;
    }
    public void setAddressMap(Map addressMap){
        this.addressMap = addressMap;
    }
    public Map getAddressMap(){
        return this.addressMap;
    }
    public void setAddressProp(Properties addressProp){
        this.addressProp = addressProp;
    }
    public Properties getAddressProp(){
        return this.addressProp;
    }
}
