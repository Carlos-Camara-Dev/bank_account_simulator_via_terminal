package br.com.carloscamaradev.bankSimulator.Repository;

public interface SimuladorRepoository {
    void createSimulador();
    void options(int option);
    void cadastUser();
    void cadastBankUser();
    void deleteUser();
    void deleteBankUser();
    int[] formatDate(String date);
    
}
