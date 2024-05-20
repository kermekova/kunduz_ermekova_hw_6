public class Skeleton extends Boss{
   private int arrows;

   public Skeleton(String name, int health, int damage, Weapon weapon, int i){
       super(name,health,damage,weapon);
       this.arrows = arrows;
   }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Запасы: " + arrows);
    }
}
