
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Adress {

    String city;
    String street;
   String buldingNumber;

Adress (String city, String street, String buldingNumber)
{

   this.city = city;
   this.street=street;
   this.buldingNumber=buldingNumber;
}

    public Adress() {

    }

    public void setAdress() throws IOException{

    BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Set City");
    String city = reader.readLine();
    System.out.println("Set Street");
    String street = reader.readLine();
    System.out.println("Set Bulding number");
    String buldingNumber = reader.readLine();
this.city=city;
this.street=street;
this.buldingNumber=buldingNumber;
}

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuldingNumber() {
        return buldingNumber;
    }

    public void setBuldingNumber(String buldingNumber) {
        this.buldingNumber = buldingNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }


}
