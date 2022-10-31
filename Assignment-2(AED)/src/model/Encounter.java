/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author riteesh
 */
public class Encounter {
  Double sysBP;
    LocalDateTime entryDateTime;

    public LocalDateTime getEntryDateTime() {
        return entryDateTime;
    }

    public void setEntryDateTime(LocalDateTime entryDateTime) {
        this.entryDateTime = entryDateTime;
    }

    public Double getSysBP() {
        return sysBP;
    }

    public void setSysBP(Double sysBP) {
        this.sysBP = sysBP;
    }

    
}
