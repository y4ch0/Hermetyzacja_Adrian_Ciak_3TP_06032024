public class VIN {
    private String vinNumber;
    private String accessPhrase;

    public VIN(String vinNumber, String accessPhrase) {
        this.vinNumber = vinNumber;
        this.accessPhrase = accessPhrase;
    }

    private String changeVIN(String newVin,String accessPhrase) {
        if(accessPhrase == this.accessPhrase) {
            this.vinNumber = newVin;
        }
        return this.vinNumber;
    }

    public void publicChangeVin(String newVin, String accessPhrase) {
        System.out.println(changeVIN(newVin,accessPhrase));
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setAccessPhrase(String newAccessPhrase,String accessPhrase) {
        if(this.accessPhrase == accessPhrase) {
            this.accessPhrase = newAccessPhrase;
        } else {
            System.out.println("Nie można zmienić numeru VIN // ERROR: Błędna fraza dostępu");
        }
    }
}
