public class IPhones implements Smartphones {
    @Override
    public void call() {
        System.out.println("call from IPhone");
    }

    @Override
    public void sms() {
        System.out.println("SMS from IPhone");
    }

    @Override
    public void internet() {
        System.out.println("Internet from IPhone");
    }

    @Override
    public void showOperatingSystem() {
        System.out.println("IOS");
    }
}
