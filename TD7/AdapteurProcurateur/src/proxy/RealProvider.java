package proxy;

public class RealProvider implements Provider{
    @Override
    public void service1() {
        System.out.println("Service 1 réalisé");
    }

    @Override
    public void service2() {
        System.out.println("Service 2 réalisé");
    }

    @Override
    public void service3() {
        System.out.println("Service 3 réalisé");
    }

    @Override
    public void service4() {
        System.out.println("Service 4 réalisé");
    }
}
