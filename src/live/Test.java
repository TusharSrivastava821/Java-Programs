package live;
import music.string.Veena;
import music.wind.Saxophone;
import music.Playable;
public class Test {
    public static void main(String[] args) {
        Veena obj = new Veena();
        Saxophone obj2 = new Saxophone();
        obj.play();
        obj2.play();
        Playable a, b;
        a = obj;
        b = obj2;
        a.play();
        b.play();
    }
}