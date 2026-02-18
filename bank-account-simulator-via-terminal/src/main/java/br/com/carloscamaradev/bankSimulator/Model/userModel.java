package main.java.br.com.carloscamaradev.bankSimulator.Model;
import java.util.Date;

public class userModel {
    private String name;
    private Date birthDate;
    private String cpf;
    
    public userModel(String name, Date birthDate, String cpf) {
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

    public Date getBirthDate() {
        return birthDate;
    }

    private void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }




}
