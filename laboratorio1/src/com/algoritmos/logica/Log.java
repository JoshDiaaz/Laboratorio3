/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.algoritmos.logica;

import java.util.Date;

/**
 *
 * @author 
 */
public class Log {
    
    
    
    
    //Atributes
    
    
    private int EventId;
    private String event; 
    private Date date; 
    private Account account; 
    private double movement; 
    
    
    private static int consecutive=0; 
    
    public Log(){
        this.EventId=++consecutive;
        
    }

    public Log(int EventId, String event, Account account, double movement) {
        this.EventId = EventId;
        this.event = event;
        this.date =new java.util.Date();
        this.account = account;
        this.movement = movement;
    }

    public int getEventId() {
        return EventId;
    }

    public void setEventId(int EventId) {
        this.EventId = EventId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getMovement() {
        return movement;
    }

    public void setMovement(double movement) {
        this.movement = movement;
    }

    
  public String toString() {
    String result = "============================================================\n";
    result += "                    BANK VOUCHER\n";
    result += "============================================================\n\n";
    result += "TRANSACTION: " + event + "\n";
    result += "DATE: " + date + "\n\n";
    result += "ACCOUNT: " + account.getAccountName() + "\n";
    result += "ACCOUNT TYPE: " + account.getClass().getSimpleName() + "\n\n";
    result += "------------------------------------------------------------\n";
    result += "TRANSACTION DETAILS:\n";
    result += "------------------------------------------------------------\n";
    if (event.equals("Deposit")) {
        result += "DEPOSIT AMOUNT: " + movement + "\n";
    } else if (event.equals("Withdrawal")) {
        result += "WITHDRAWAL AMOUNT: " + movement + "\n";
    }
    result += "\n------------------------------------------------------------\n";
    result += "ACCOUNT DETAILS:\n";
    result += "------------------------------------------------------------\n";
    result += account.toString() + "\n";
    
   
    return result;
}


}