/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan48.kalkulator;

/**
 *
 * @author user
 */
public class kalkulator {
    private double value1;
    private double value2;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
    public void setNameProject(){
        System.out.println("Project Calculator");   
    }
    public void setNoteProject(String note){
        System.out.println(note);
    }
    public double add(double val1,double val2){
    double tambah;
    tambah = val1+val2;
    return tambah;    
    }
    public double minus(double val1,double val2){
    double kurang;
    kurang = val1-val2;
    return kurang;}
    public double multiplication(double val1,double val2){
    double kali; 
     kali = val1*val2;
    return kali; 
    }
    public double division(double val1,double val2){
     double bagi = val1/val2;
     return bagi;   
    }
}