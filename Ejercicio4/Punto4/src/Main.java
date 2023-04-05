import Entidades.SmartPhone;
import Entidades.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone samsungGalaxyS22 = new SmartPhone(3700, 8, "Exynos 2200", "6,1", "Samsung", true, true, false );
        SmartWatch samsungWatch5 = new SmartWatch(248, 2, "Dual-Core", "1.2", "Samsung", false, true);

        System.out.println(samsungGalaxyS22.toString());
        System.out.println();
        System.out.println(samsungWatch5.toString());


    }
}