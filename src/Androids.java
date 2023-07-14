public class Androids implements Smartphones {
    @Override
    public void call() {
        System.out.println("Call from Android");
    }

    @Override
    public void sms() {
        System.out.println("SMS from Android");
    }

    @Override
    public void internet() {
        System.out.println("Internet on Android");
    }

    @Override
    public void showOperatingSystem() {
        System.out.println("LinuxOS");
    }
}
