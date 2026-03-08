package br.com.carloscamaradev.bankSimulator.Service;

import java.time.LocalDate;
import java.util.Scanner;

import br.com.carloscamaradev.bankSimulator.Model.SimulatorModel;
import br.com.carloscamaradev.bankSimulator.Model.UserModel;
import br.com.carloscamaradev.bankSimulator.Repository.SimuladorRepoository;

public class SimulatorService implements SimuladorRepoository{
     private Scanner enty = new Scanner(System.in);

    public SimulatorService(){
        createSimulador();
    }
    @Override
    public void createSimulador() {
        System.out.println("Bem-vindo ao nosso Simulador de Banco!");
        System.out.println("-------------------------------------------------");
        System.out.println("Seguiremos com as opções iniciais:");
        System.out.println("1 - Cadastrar um User.\n2 - Criar Contar para o usuario.\n" 
            + "3 - Deletar Usuario.\n4 - Deletar conta do Usuario.");
        int option = enty.nextInt();
        options(option);
    }

    @Override
    public void options(int option) {
        switch (option){
            case 1: cadastUser();
                break;
            case 2: cadastBankUser();
                break;
            case 3: deleteUser();
                break;
            case 4: deleteBankUser();
                break;
        }
       
    }

    @Override
    public void cadastUser() {
        System.out.println("Digite o CPF do Usuario.");
        String cpf = enty.next();
        System.out.println("Digite o nome do Usuario.");
        String name = enty.next();
        System.out.println("Digite a data de nascimento (1999/09/19).");
        String date = enty.next();
        int[] intDate = formatDate(date);
        UserModel user = new UserModel(name, LocalDate.of(intDate[2], intDate[1], intDate[0]), cpf);
        System.out.println("Usuario cadastrado no sistema!");

    }

    @Override
    public void cadastBankUser() {
        System.out.println("Digite o CPF do Usuario.");
        String cpf = enty.next();
        System.out.println("Digite o nome do Usuario.");
        String name = enty.next();
        System.out.println("Digite a data de nascimento (1999/09/19).");
        String date = enty.next();
        int[] intDate = formatDate(date);
        UserModel user = new UserModel(name, LocalDate.of(intDate[2], intDate[1], intDate[0]), cpf);
        System.out.println("Usuario cadastrado no sistema!");
    }

    @Override
    public void deleteUser() {

    }

    @Override
    public void deleteBankUser() {

    }

    @Override
    public int[] formatDate(String date) {
        if(date != null){
            System.out.println("Erro: Data nao inserida!");
        }
        else{
            date.trim();
            if (date.matches("\\d+")) {
                String[] date_s = date.split("/");
                int[] intFormatDate = new int[3];
                for(int i = 0; i > intFormatDate.length; i++){
                    intFormatDate[i] = Integer.parseInt(date_s[i]);
                }
                return intFormatDate;
            }
            else{
                System.out.println("Erro: Data informada possui erro de digitação (letras)!");
            }
        }
        return null;
        
    }
}
    

