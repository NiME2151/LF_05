package ab.objektorientierte_programmierung.trainingslager.rollenspiel;

class Runner {

    public static void main(String[] args) {

        Elf elf = new Elf("Elfie", 5);
        Zauberer zauberer = new Zauberer("Der Zauderer", 4, 1);

        try {
            System.out.println(elf.run());
        } catch (TooExhaustedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(elf.fight());
        try {
            System.out.println(elf.climb());
        } catch (TooExhaustedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(elf.eat());
        System.out.println();
        try {
            System.out.println(zauberer.castSpell());
            System.out.println(zauberer.castSpell());
        } catch (TooExhaustedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(zauberer.getMana());
        System.out.println(zauberer.drinkManaPotion());
        System.out.println(zauberer.getMana());
    }
}
