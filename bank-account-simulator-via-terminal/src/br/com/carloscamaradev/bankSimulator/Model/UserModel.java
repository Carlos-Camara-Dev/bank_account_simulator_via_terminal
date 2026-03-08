package br.com.carloscamaradev.bankSimulator.Model;

import java.time.LocalDate;

public class UserModel {
    private String name;
    private LocalDate birthDate;
    private String cpf;
    
    public UserModel(String name, LocalDate birthDate, String cpf) {
        this.setBirthDate(birthDate); 
        this.setCpf(cpf);
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    private void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
