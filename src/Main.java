public class Main {
    public static void main(String[] args) {
        VIN vinOne = new VIN("ABCDEFGHIJKLMNOPRSTUWXYZ","ACCESSPHRASE!");
        Brand brandOne = new Brand("Volkswagen","Incorporated",1965,325.52);
        Vehicle vehOne = new Vehicle(brandOne.getBrandName(),"Golf",2000,3,90,vinOne);

        System.out.println(vinOne.getVinNumber());
        vinOne.publicChangeVin("ABCDEFGHIJKLMNOPRSTUWXYZ123456","ACCESSPHRASE!");
    }
}