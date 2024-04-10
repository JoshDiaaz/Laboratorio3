package com.algoritmos.Presentacion;
import com.algoritmos.entidad.Client;
import com.algoritmos.logica.CurrentAccount;
import com.algoritmos.logica.Log;
import com.algoritmos.logica.SavingAccount;

public class LogTesting {

    public void test() {

        Client clients[] = new Client[10];

        Client client1 = new Client("7-0309-0943", "joaquin", "83362504", "limoncito");
        Client client2 = new Client("7-1234-5678", "maria", "55555555", "avocado street");
        Client client3 = new Client("7-9876-5432", "pedro", "12345678", "banana avenue");
        Client client4 = new Client("7-5678-1234", "ana", "98765432", "orange road");
        Client client5 = new Client("7-4321-8765", "juan", "56781234", "apple street");

        clients[0] = client1;
        clients[1] = client2;
        clients[2] = client3;
        clients[3] = client4;
        clients[4] = client5;

        // Crear una nueva instancia de cuenta corriente
        CurrentAccount account1 = new CurrentAccount("1231331", 2000000, client1);

        // Crear una nueva instancia de cuenta de ahorros
        SavingAccount account2 = new SavingAccount("15/3/2024", 12, 5, "123456", 15000000, client2);

        Log log[] = new Log[10];
        log[0] = new Log(1, "SavingAccount", account2, 7000);
        log[1] = new Log(2, "CurrentAccount", account1, 50000);
        log[2] = new Log(3, "CurrentAccount", account1, -10000); // Retiro de cuenta corriente
        log[3] = new Log(4, "SavingAccount", account2, 10000);
        log[4] = new Log(5, "SavingAccount", account2, -5000); // Retiro de cuenta de ahorros
        log[5] = new Log(6, "CurrentAccount", account1, 20000); // Depósito en cuenta corriente
        log[6] = new Log(7, "SavingAccount", account2, 3000); // Depósito en cuenta de ahorros
        log[7] = new Log(8, "CurrentAccount", account1, -15000); // Retiro de cuenta corriente
        log[8] = new Log(9, "CurrentAccount", account1, 10000); // Depósito en cuenta corriente
        log[9] = new Log(10, "SavingAccount", account2, -8000); // Retiro de cuenta de ahorros

        for (int i = 0; i < log.length; i++) {
            if (log[i] != null) {
                System.out.println((log[i].toString()));
            }
        }
    }
}
