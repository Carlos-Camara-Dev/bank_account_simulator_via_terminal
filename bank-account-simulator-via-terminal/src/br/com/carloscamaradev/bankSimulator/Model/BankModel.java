package br.com.carloscamaradev.bankSimulator.Model;

public class BankModel {
    private UserModel holder;
    private String agencyNumber;
    private String accountNumber;
    private double balance;


    public BankModel(){
        
    }
    public BankModel(UserModel holder, String agencyNumber, String accountNumber) {
        this.setHolder(holder);
        this.setAgencyNumber(agencyNumber); 
        this.setAccountNumber(accountNumber);
        this.setBalance(0.0);   
        
    }

    public UserModel getHolder() {
        return holder;
    }

    private void setHolder(UserModel holder) {
        this.holder = holder;
    }

    public String getAgencyNumber() {
        return agencyNumber;
    }

    private void setAgencyNumber(String agencyNumber) {
        this.agencyNumber = agencyNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    private void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }


}
