package main.java.br.com.carloscamaradev.bankSimulator.Repository;

import main.java.br.com.carloscamaradev.bankSimulator.Model.userModel;

public interface bankRepository {
    void balance(userModel user);
    double deposit(double value);
    double withdraw(double value);
    void dataUser(userModel user);
}
