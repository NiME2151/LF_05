package ab.objektorientierte_programmierung.trainingslager.schliessfach;

class Aktie extends Gegenstand {

    private String company;
    private double value;

    public Aktie(String id, String company, double value) {
        super(id);
        this.company = company;
        this.value = value;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Aktie:\n" +
                super.toString() +
                "Company: " + company + '\n' +
                "Value: " + value;
    }
}
