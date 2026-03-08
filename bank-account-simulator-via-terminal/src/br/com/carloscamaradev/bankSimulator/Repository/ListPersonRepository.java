package br.com.carloscamaradev.bankSimulator.Repository;

import java.util.ArrayList;

import br.com.carloscamaradev.bankSimulator.Model.UserModel;

public interface ListUserRepository {
    void addUser(UserModel user);
    void removeUser(UserModel user);
    void seachUser(String cpf);
    ArrayList<UserModel> seachAll();
}
