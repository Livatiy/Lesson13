package HomeWork20;

public class Main {
    public static void main(String[] args) {

        MusicStyles[] bands = new MusicStyles[3];
        bands[0] = new PopMusic();
        bands[1] = new RockMusic();
        bands[2] = new ClassicMusic();
        for (MusicStyles b : bands) {
            b.playMusic();
        }
    }
}
