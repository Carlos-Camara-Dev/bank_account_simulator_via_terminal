package br.com.carloscamaradev.bankSimulator.Service;

import br.com.carloscamaradev.bankSimulator.Model.SimulatorModel;
import br.com.carloscamaradev.bankSimulator.Repository.SimuladorRepoository;

public class SimulatorService implements SimuladorRepoository{

    @Override
    public void createSimulador() {
        System.out.println("Bem-vindo ao nosso Simulador de Banco!");
        System.out.println("Seguiremos com as opções iniciais:");
        System.out.println("1 - Cadastrar um User.\n2 - Criar Contar para o usuario.\n" 
            + "3 - Deletar Usuario.\n4 - Deletar conta do Usuario.");
    }

    @Override
    public void options() {
       
    }

    @Override
    public void cadastUser() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastUser'");
    }

    @Override
    public void cadastBankUser() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastBankUser'");
    }

    @Override
    public void deleteUser() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public void deleteBankUser() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteBankUser'");
    }
    
}
