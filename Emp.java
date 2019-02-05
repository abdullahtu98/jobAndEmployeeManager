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
public class Emp implements Serializable{
    private String name; 
    private String surname;
    private Job job;
    private boolean lang;
    private boolean math;
    private boolean cs;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Emp(String name, String surname, Job job, boolean lang, boolean math, boolean cs) {
        this.name = name;
        this.surname = surname;
        this.job = job;
        this.lang = lang;
        this.math = math;
        this.cs = cs;
    }

    
}
