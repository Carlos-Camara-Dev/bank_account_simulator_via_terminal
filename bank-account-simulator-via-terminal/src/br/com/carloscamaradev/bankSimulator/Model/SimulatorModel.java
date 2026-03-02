package br.com.carloscamaradev.bankSimulator.Model;

public class SimulatorModel {
    private BankModel bank;
    private UserModel user;

    public SimulatorModel(BankModel bank, UserModel user) {
        this.setBank(bank);
        this.setUser(user);
    }

    public BankModel getBank() {
        return bank;
    }

    public void setBank(BankModel bank) {
        this.bank = bank;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

}
