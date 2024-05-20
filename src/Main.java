public class Main {
    public static void main(String[] args) {
        Skeleton skeletonWeapon = new Skeleton ("Генерал", 280, 50, new Weapon(WeaponType.ARTILLERY, "Ружье"), 100);
        Skeleton skeletonWeapon2 = new Skeleton ("Химик", 250, 70, new Weapon(WeaponType.CHEMICAL_WEAPONRY, "Газ"), 70);
        Weapon bossWeapon = new Weapon(WeaponType.ARTILLERY, "Ружье");
        Boss skeletonBoss = new Boss("Босс", 230, 40, bossWeapon);
        System.out.println(skeletonBoss.printInfo());
        System.out.println(skeletonWeapon.printInfo());
        System.out.println(skeletonWeapon2.printInfo());
    }
}