package ui;

import exceptions.InvalidAmmountException;
import exceptions.NotEnoughMoneyException;
import model.User;
import model.Wallet;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        try {
            user.getWallet().addIncome(15000);
            user.getWallet().addDebt(10000);

            user.getWallet().pay(8500);
        }catch (NotEnoughMoneyException exc){
            exc.printStackTrace();
        }catch (InvalidAmmountException exc){
            exc.printStackTrace();
        }
    }
}
