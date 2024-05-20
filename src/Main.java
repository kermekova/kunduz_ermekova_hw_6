public class Main {
    public static void main(String[] args) {
        Weapon skeletonWeapon = new Weapon(WeaponType.ARTILLERY, "Ружье" );

        Boss skeletonBoss = new Skeleton("Генерал", 280, 50, skeletonWeapon, 100);

        skeletonBoss.printInfo();

        Weapon anotherSkeletonWeapon = new Weapon(WeaponType.CHEMICAL_WEAPONRY, "Ядовитый газ");
        Boss anotherSkeletonBoss = new Skeleton("Химик", 200, 60, anotherSkeletonWeapon, 40);

        anotherSkeletonBoss.printInfo();

    }
}