package ab.objektorientierte_programmierung.trainingslager.inventar;

class Kontakt {

    private String mailAddress;
    private String officePhoneNumber;
    private String mobilePhoneNumber;

    public Kontakt(String mailAddress, String officePhoneNumber, String mobilePhoneNumber) {
        this.mailAddress = mailAddress;
        this.officePhoneNumber = officePhoneNumber;
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getOfficePhoneNumber() {
        return officePhoneNumber;
    }

    public void setOfficePhoneNumber(String officePhoneNumber) {
        this.officePhoneNumber = officePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    @Override
    public String toString() {
        return "Kontakt:\n" +
                "Mail address: " + this.mailAddress + "\n" +
                "Office phone number: " + this.officePhoneNumber + "\n" +
                "Mobile phone number: " + this.mobilePhoneNumber;
    }
}
