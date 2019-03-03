

public class main {

    public static void main (String [] args) throws Exception {

        Rest hereMaps = new Rest();

        Adress adr = new Adress();
        adr.setAdress();

System.out.println(adr.getCity());
System.out.println(adr.getStreet());
System.out.println(adr.getBuldingNumber());

hereMaps.customAdress(adr.getCity(),adr.getStreet(),adr.getBuldingNumber());
String str= hereMaps.getJsonString();
System.out.println(str);

String lat= hereMaps.getLatitude();

System.out.println("Latitude: "+lat);









    }



}
