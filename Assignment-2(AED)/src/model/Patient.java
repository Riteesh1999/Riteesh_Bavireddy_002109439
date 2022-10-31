/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author sandeepbarla
 */
public class Patient extends Person {
    static ArrayList<Encounter> vitalSigns = new ArrayList<>();
    static Map<Patient,ArrayList<Encounter>> encounterHistory= new HashMap<>();
    
    boolean abnormal;
    private Community community;
    private int patientId;
    private String name;
    private String dob;
    private int age;
    
    public Patient(){
        
    }
    public Patient(int patientId, String name, String dob, String house, String community, String city, int zipCode) throws ParseException{
        this.community = new Community();
        this.patientId = patientId;
        this.name = name;
        this.dob = dob;
        this.community.house = house;
        this.community.community = community;
        this.community.city = city;
        this.community.zipCode = zipCode;
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
        LocalDate ld = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period period = Period.between(ld, LocalDate.now());
        this.age = (period.getYears() * 12) + period.getMonths();
        
    }
    
    
    public static void addPatient(Patient p){
        encounterHistory.put(p, new ArrayList<>());
    }

    public boolean isAbnormal() {
        return abnormal;
    }

    public void setAbnormal(boolean abnormal) {
        this.abnormal = abnormal;
    }
    
    public static ArrayList<Encounter> getVitalSigns() {
        return vitalSigns;
    }

    public static void setVitalSigns(ArrayList<Encounter> vitalSigns) {
        Patient.vitalSigns = vitalSigns;
    }
    
    public static void addEncounter(Encounter vs){
        vitalSigns.add(vs);
    }

    public static Map<Patient, ArrayList<Encounter>> getEncounterHistory() {
        return encounterHistory;
    }

    public static void setEncounterHistory(Map<Patient, ArrayList<Encounter>> encounterHistory) {
        Patient.encounterHistory = encounterHistory;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString(){
        return getPatientId()+"";
    }
    
    
}
