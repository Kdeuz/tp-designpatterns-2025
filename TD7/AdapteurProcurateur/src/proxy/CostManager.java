package proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class CostManager {
    private Map<String, Integer> serviceCounting;
    private Map<String, Double> servicePrice;

    private Map<String, String> users;


    public CostManager() {
        serviceCounting = new HashMap<>();
        servicePrice = new HashMap<>();
        users = new HashMap<>();
    }

    public void recordUsage(String str) {
        if (this.serviceCounting == null) {
            this.serviceCounting = new HashMap<>();
        }
        this.serviceCounting.put(str, this.serviceCounting.getOrDefault(str, 0) + 1);
    }

    public double calculatePrice(String service) {
        if(this.servicePrice.containsKey(service)) {
            return this.serviceCounting.getOrDefault(service,0)*this.servicePrice.get(service);
        }
        throw new NoSuchElementException("Service not found");
    }

    public boolean login(String name, String pw) {
        return this.users.get(name).equals(pw);
    }

}
