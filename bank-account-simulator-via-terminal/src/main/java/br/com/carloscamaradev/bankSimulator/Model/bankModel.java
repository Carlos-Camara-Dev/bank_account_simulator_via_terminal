package main.java.br.com.carloscamaradev.bankSimulator.Model;

public class bankModel {
    private String bankName;
    private String agencyNumber;
    private String accountNumber;
    private double balance;

    public bankModel(String bankName, String agencyNumber, String accountNumber) {
        this.setBankName(bankName);
        this.setAgencyNumber(agencyNumber); 
        this.setAccountNumber(accountNumber);
        this.setBalance(0.0);   
        
    }

    public String getBankName() {
        return bankName;
    }

    private void setBankName(String bankName) {
        this.bankName = bankName;
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
    private void setBalance(double balance) {
        this.balance = balance;
    }
}
