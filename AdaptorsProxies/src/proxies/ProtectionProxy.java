package proxies;

import java.util.Scanner;

public class ProtectionProxy implements Provider{
    private Provider provider;
    private String password;

    public boolean login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez votre mdp :");
        String pw = scanner.next();

        return password.equals(pw);
    }

    @Override
    public void service1() {
        provider.service1();
    }

    @Override
    public void service2() {
        provider.service2();
    }

    @Override
    public void service3() {
        if(login()) {
            provider.service3();
        }
    }

    @Override
    public void service4() {
        if(login()) {
            provider.service4();
        }
    }
}
