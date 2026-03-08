import java.time.LocalDate;

import br.com.carloscamaradev.bankSimulator.Model.BankModel;
import br.com.carloscamaradev.bankSimulator.Model.UserModel;
import br.com.carloscamaradev.bankSimulator.Service.BankService;
import br.com.carloscamaradev.bankSimulator.Service.SimulatorService;

public class App {
    public static void main(String[] args) throws Exception {

        
        // BankService bankSe = new BankService();

        // UserModel user = new UserModel("Carlos", LocalDate.of(2005, 02, 18), "00000000");
        // BankModel bank = new BankModel(user, "09999", "0999");

        // bankSe.bankCreate(bank);
        // bankSe.balance(bank);
        // bankSe.deposit(bank);
        // bankSe.withdraw(bank, 300);
        SimulatorService sS = new SimulatorService();
        sS.createSimulador();
    
        

    }
}
