public class Main {
    public static void main(String[] args) {

        Androids android1 = new Androids();
        IPhones iphone1 = new IPhones();
        Smartphones smartphone1 = new Androids();
        Smartphones smartphone2 = new IPhones();

        android1.call();
        android1.showOperatingSystem();

        iphone1.sms();
        iphone1.showOperatingSystem();

        smartphone1.showOperatingSystem();
        smartphone1.call();

        smartphone2.showOperatingSystem();
        smartphone2.sms();

    }
}