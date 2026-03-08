package br.com.carloscamaradev.bankSimulator.Model;

public class SimulatorModel {
    private BankModel bank;
    private PersonModel person;

    public SimulatorModel(BankModel bank, PersonModel person) {
        this.setBank(bank);
        this.setPerson(person);
    }

    public BankModel getBank() {
        return bank;
    }

    public void setBank(BankModel bank) {
        this.bank = bank;
    }

    public PersonModel getPerson() {
        return person;
    }

    public void setPerson(PersonModel person) {
        this.person = person;
    }

}
