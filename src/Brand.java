public class Brand {
    String brandName;
    private String companyType;
    int creationDate;
    double netWorth;

    public Brand(String brandName, String companyType, int creationDate, double netWorth) {
        this.brandName = brandName;
        this.companyType = companyType;
        this.creationDate = creationDate;
        this.netWorth = netWorth;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getCompanyType() {
        return companyType;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public double getNetWorth() {
        return netWorth;
    }
}
