/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;


import java.io.*;

/**
 *
 * @author abdullah tu
 */
public class Job implements Serializable{

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Job(double salary, String job, boolean lang, boolean math, boolean cs) {
        this.salary = salary;
        this.job = job;
        this.lang = lang;
        this.math = math;
        this.cs = cs;
    }

    
    private double salary;
    private String job;
    private boolean lang;

    public boolean isLang() {
        return lang;
    }

    public void setLang(boolean lang) {
        this.lang = lang;
    }

    public boolean isMath() {
        return math;
    }

    public void setMath(boolean math) {
        this.math = math;
    }

    public boolean isCs() {
        return cs;
    }

    public void setCs(boolean cs) {
        this.cs = cs;
    }
    private boolean math;
    private boolean cs;
    
    
}
