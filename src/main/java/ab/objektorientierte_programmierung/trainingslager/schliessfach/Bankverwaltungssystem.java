package ab.objektorientierte_programmierung.trainingslager.schliessfach;

import java.util.ArrayList;
import java.util.List;

class Bankverwaltungssystem {

    private List<Schliessfach> schliessfaecher;

    public Bankverwaltungssystem(List<Schliessfach> schliessfaecher) {
        this.schliessfaecher = schliessfaecher;
    }

    public Schliessfach getSchliessfachById(String id) throws CouldNotFindException {
        return this.schliessfaecher.stream()
                .filter(schliessfach -> schliessfach.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new CouldNotFindException("Schliessfach", id));
    }
}
