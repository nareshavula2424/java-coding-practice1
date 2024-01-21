package org.example.interfaces;
/*
Comparator using java 8
 */

import java.util.*;

class Bank {
    String bankName;
    String bankIFSCCode;
    String bankBranch;

    public Bank(String bankName, String bankIFSCCode, String bankBranch) {
        this.bankName = bankName;
        this.bankIFSCCode = bankIFSCCode;
        this.bankBranch = bankBranch;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankIFSCCode() {
        return bankIFSCCode;
    }

    public void setBankIFSCCode(String bankIFSCCode) {
        this.bankIFSCCode = bankIFSCCode;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", bankIFSCCode='" + bankIFSCCode + '\'' +
                ", bankBranch='" + bankBranch + '\'' +
                '}';
    }
}

public class ComparatorUsingJava8 {
    public static void main(String[] args) {
        List<Bank> list = new ArrayList<>();
        list.add(new Bank("SBI","SBINOOO643","Durgi"));
        list.add(new Bank("SBI","SBINOOO644"," Macherla"));
        list.add(new Bank("Kotak Bank","KOTKOOO643","Macherla"));
        list.add(new Bank("Syndicate Bank","SNDNOOO643","Piduguralla"));
        list.add(new Bank("Syndicate Bank","SNDNOOO643","Guntur"));
        list.add(new Bank("Syndicate Bank","SNDNOOO643","Hyderabad"));
        Comparator comparator = Comparator.comparing(Bank::getBankName);
        System.out.println("Sort by bank name");
        Collections.sort(list,comparator);
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            Bank bank = (Bank)itr.next();
            System.out.println(bank);

        }
    }
}
