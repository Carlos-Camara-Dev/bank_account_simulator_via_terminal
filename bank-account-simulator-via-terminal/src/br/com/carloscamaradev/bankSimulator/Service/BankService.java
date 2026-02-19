package br.com.carloscamaradev.bankSimulator.Service;

import java.util.Scanner;

import br.com.carloscamaradev.bankSimulator.Model.BankModel;
import br.com.carloscamaradev.bankSimulator.Repository.BankRepository;

public class BankService implements BankRepository{
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void bankCreate(BankModel bank){
        
    }

    @Override
    public void balance(BankModel bank) {
        System.out.println(bank.getBalance()); 
    }

    @Override
    public void deposit(BankModel bank) {
        System.out.println("Digite o valor do deposito: ");
        double value = scanner.nextDouble();
        bank.setBalance(bank.getBalance() + value);
        System.out.println("The amount of " + value + " was deposited into your account.");
    }

    @Override
    public void withdraw(BankModel bank,double value) {
        if(value <= bank.getBalance()){
            bank.setBalance(bank.getBalance() - value);
            System.out.println("Has been withdrawn from your account  " + value);
        }
        else System.out.println("Insufficient balance");
    }

    @Override
    public void dataBank(BankModel bank) {
        System.out.println("Holder name: " + bank.getHolder().getName());
        System.out.println("Account Number: " + bank.getAccountNumber());
        System.out.println("Agency Number: " + bank.getAgencyNumber());

    }

    
}
