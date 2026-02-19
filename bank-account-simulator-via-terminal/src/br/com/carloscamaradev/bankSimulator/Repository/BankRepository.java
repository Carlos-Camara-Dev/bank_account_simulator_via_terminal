package br.com.carloscamaradev.bankSimulator.Repository;

import br.com.carloscamaradev.bankSimulator.Model.BankModel;

public interface BankRepository {
    void bankCreate(BankModel bank);
    void balance(BankModel bank);
    void deposit(BankModel bank);
    void withdraw(BankModel bank, double value);
    void dataBank(BankModel bank);
}
