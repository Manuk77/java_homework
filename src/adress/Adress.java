package adress;

public class Adress {
    {
        System.out.println("Adress class");
    }
    String country;
    String region;
    String city;
    String street;
    int house;

    public Adress(String country, String region, String city, String street, int hous){

        this.country = country;
        this.city = city;
        this.region = region;
        this.street = street;
        this.house = hous;

    }
    class Bank{

        {
            System.out.println(" Class Bank ");
        }
        String bankName;
        String address;
        public Bank(String bankName, String address){

            this.bankName = bankName;
            this.address = address;
        }


    }


    public static void main(String[] args){

        // 6. Սահմանել Address class :  fields (country , region, city , street, house ) .
        //Սահմանել Bank class :  fields (bankName,   address (type Address)) .


    }

}
