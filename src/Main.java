public class Main {
    public static void main(String[] args) {
        Boss boss=new Boss();
        boss.getWeapon().setWeapon( WeaponType.GLOCK17);
        boss.setHealth(580);
        boss.setDamage(240);
        boss.getWeapon().setWeaponType("Огнестрельные");
        System.out.println(boss.info());
    }
}