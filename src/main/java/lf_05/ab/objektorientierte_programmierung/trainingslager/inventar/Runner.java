package lf_05.ab.objektorientierte_programmierung.trainingslager.inventar;

class Runner {

    public static void main(String[] args) {

        Raum raum = new Raum(204);

        Stuhl stuhl1 = new Stuhl(2041, "Stuhl-1");
        stuhl1.setDescription("a wooden chair");
        stuhl1.setMaterial("wood");
        stuhl1.setSeatHeightInCentimeters(100);
        stuhl1.setWeightInKilograms(3);
        raum.addMoebelstueck(stuhl1);

        Stuhl stuhl2 = new Stuhl(2042, "Stuhl-2");
        stuhl2.setDescription("a plastic table");
        stuhl2.setMaterial("plastic");
        stuhl2.setSeatHeightInCentimeters(90);
        stuhl2.setWeightInKilograms(0.5);
        raum.addMoebelstueck(stuhl2);

        Tisch tisch = new Tisch(2043, "Tisch");
        tisch.setDescription("a wooden table");
        tisch.setMaterial("wood");
        tisch.setWeightInKilograms(15);
        tisch.setHeightInCentimeters(110);
        tisch.setLengthInCentimeters(300);
        tisch.setWidthInCentimeters(100);
        raum.addMoebelstueck(tisch);
        Kontakt kontakt = new Kontakt(
                "miles.obrien@starfleet.ufp",
                "38472849",
                "94327420");
        Techniker techniker = new Techniker(
                "Miles",
                "O'Brien",
                kontakt);
        raum.setTechnician(techniker);
        System.out.println(raum);
        try {
            raum.removeMoebelstueck(stuhl2);
        } catch (MoebelstueckNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(raum);
        try {
            raum.removeMoebelstueck(stuhl2);
            System.out.println("did it");
        } catch (MoebelstueckNotFoundException e) {
            System.out.println("e: " + e.getMessage());
        }
    }
}
