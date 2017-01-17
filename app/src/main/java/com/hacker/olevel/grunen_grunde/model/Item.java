package com.hacker.olevel.grunen_grunde.model;

import java.util.Date;

/**
 * Created by olevel on 6/27/16.
 */

public class Item {
    Long id;
    String item;
    String sender;
    String reciever;
    String fromAddress;
    String toAddress;
    String status;          // Status: pending, collected, delivered or cancelled
    Date collection;        // Date item is collected from the owner
    Date delievery;         // Date owner wants item deleivered
    Date transactionBegin;  // Date when item is first booked
    Date transactionEnd;    // Date when item is delievered
    int fromPostCode;
    int toPostCode;

    public Item(){
        transactionBegin = new Date();
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCollection() {
        return collection;
    }

    public void setCollection(Date collection) {
        this.collection = collection;
    }

    public Date getDelievery() {
        return delievery;
    }

    public void setDelievery(Date delievery) {
        this.delievery = delievery;
    }

    public Date getTransactionBegin() {
        return transactionBegin;
    }

    public void setTransactionBegin(Date transactionBegin) {
        this.transactionBegin = transactionBegin;
    }

    public Date getTransactionEnd() {
        return transactionEnd;
    }

    public void setTransactionEnd(Date transactionEnd) {
        this.transactionEnd = transactionEnd;
    }

    public int getFromPostCode() {
        return fromPostCode;
    }

    public void setFromPostCode(int fromPostCode) {
        this.fromPostCode = fromPostCode;
    }

    public int getToPostCode() {
        return toPostCode;
    }

    public void setToPostCode(int toPostCode) {
        this.toPostCode = toPostCode;
    }
}
