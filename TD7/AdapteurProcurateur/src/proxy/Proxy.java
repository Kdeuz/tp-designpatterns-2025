package proxy;

import java.lang.constant.Constable;
import java.util.Scanner;

public class Proxy implements Provider{
    private RealProvider realProvider;
    private CostManager costManager;

    public Proxy(RealProvider realProvider, CostManager costManager) {
        this.realProvider = realProvider;
        this.costManager = costManager;
    }

    @Override
    public void service1() {
        this.costManager.recordUsage("service1");
        this.realProvider.service1();
    }

    @Override
    public void service2() {
        this.costManager.recordUsage("service2");
        this.realProvider.service2();
    }

    @Override
    public void service3() {
        String name;
        String pw;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre nom : ");
        name = scanner.nextLine();
        System.out.println("Entrez votre mot de passe");
        pw = scanner.nextLine();
        if(this.costManager.login(name,pw)) {
            this.costManager.recordUsage("service3");
            this.realProvider.service3();
        } else {
            System.out.println("Mauvais login");
        }
    }

    @Override
    public void service4() {
        String name;
        String pw;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre nom : ");
        name = scanner.nextLine();
        System.out.println("Entrez votre mot de passe");
        pw = scanner.nextLine();
        if(this.costManager.login(name,pw)) {
            this.costManager.recordUsage("service4");
            this.realProvider.service4();
        } else {
            System.out.println("Mauvais login");
        }
    }
    //C'est un accessProxy
}
