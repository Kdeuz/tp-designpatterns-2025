package proxies;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class InvoiceProxy implements Provider{

    private Provider provider;
    private int[] nbUses = {0,0,0,0};
    private double[] prices = {2.0,3.0,5.0,6.0};
    private Map<String, String> logins;

    public InvoiceProxy(Provider provider){
        this.provider = provider;
    }

    public boolean login(String username, String password) {
        String realPw = logins.getOrDefault(username, null);
        if(realPw == null) {
            return false;
        }
        return realPw.equals(password);
    }

    @Override
    public void service1() {
        provider.service1();
        nbUses[0]+=1;
    }

    @Override
    public void service2() {
        provider.service2();
        nbUses[1]+=1;
    }

    @Override
    public void service3() {
        provider.service3();
        nbUses[2]++;
    }

    @Override
    public void service4() {
        provider.service4();
        nbUses[3]++;
    }

    public double totalCost() {
        double res = 0;
        for(int i = 0; i<nbUses.length; i++) {
            res += nbUses[i]*prices[i];
        }
        return res;
    }
}
