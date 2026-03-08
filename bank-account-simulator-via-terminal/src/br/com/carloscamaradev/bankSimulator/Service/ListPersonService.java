package br.com.carloscamaradev.bankSimulator.Service;

import java.util.ArrayList;

import br.com.carloscamaradev.bankSimulator.Model.UserModel;
import br.com.carloscamaradev.bankSimulator.Repository.ListUserRepository;

public class ListUserService implements ListUserRepository{
    private ArrayList<UserModel> listUser;

    public ListUserService(){
        this.listUser = new ArrayList<>();

    }

    @Override
    public void addUser(UserModel user) {
        listUser.add(user);
    }

    @Override
    public void removeUser(UserModel user) {
        listUser.remove(user);
    }

    @Override
    public void seachUser(String cpf) {
        for(int i = 0; i> listUser.size(); i++){
            if (listUser.get(i).getCpf().equals(cpf)) {
               System.out.println("Ta na lista");
            }
            else{
                System.out.println("nao tana lista");
            }
        }
    }

    @Override
    public ArrayList<UserModel> seachAll() {
       return listUser;
    }
    
}
