package ICP_Project;
/* Creating a class for Airport so that Attributes can be accessed */

public class Airport {

    private final int Airport_id;
    private final String Airport_name;
    private final String City;
    private final String Country;
    private final String IATA_Code;
    private final String ICAO_Code;
    private final double Latitude;
    private final double Longitude;
    private final double Altitude;
    private final double timezone;
    private final String DST;
    private final String DBTZ;
    private final String Type;
    private final String Data_source;



    public Airport( int Airport_id, String Airport_name, String City, String Country, String IATA_Code, String ICAO_Code, double Latitude, double Longitude, double Altitude, double timezone, String DST, String DBTZ, String Type, String Data_source){

        this.Airport_id= Airport_id;
        this.Airport_name= Airport_name;
        this.City= City;
        this.Country= Country;
        this.IATA_Code= IATA_Code;
        this.ICAO_Code= ICAO_Code;
        this.Latitude=Latitude;
        this.Longitude=Longitude;
        this.Altitude=Altitude;
        this.timezone=timezone;
        this.DST=DST;
        this.DBTZ=DBTZ;
        this.Type=Type;
        this.Data_source=Data_source;
    }

    public Airport(){
        this.Airport_id= 0;
        this.Airport_name= "";
        this.City= "";
        this.Country= "";
        this.IATA_Code= "";
        this.ICAO_Code= "";
        this.Latitude=0.0;
        this.Longitude=0.0;
        this.Altitude=0.0;
        this.timezone=0.0;
        this.DST="";
        this.DBTZ="";
        this.Type="";
        this.Data_source="";
    }

    @java.lang.Override
    public java.lang.String toString(){
        return "Airport {" +
                "Airport_id=" + Airport_id +
                ",Airport_name=" + Airport_name + "\'" +
                ",City=" + City + "\'" +
                "IATA_Code=" + IATA_Code +
                "ICAO_Code" + ICAO_Code +
                "Latitude=" + Latitude +
                "Longitude=" + Longitude +
                "Altitude=" + Altitude +
                "timezone=" + timezone +
                "DST=" + DST +
                "DBTZ=" + DBTZ +
                "Type=" + Type +
                "Data source" + Data_source
    }

    public int getAirport_id(){
        return this.Airport_id;
    }
    public String getAirport_name(){
        return this.Airport_name;
    }
    public String getCity(){
        return this.City;

    }
    public String getIATA_Code() {
        return this.IATA_Code;

    }
    public String getICAO_Code() {
        return this.IATA_Code;
    }
    public double getLatitude() {
        return this.Latitude;
    }
    public double getLongitude(){
        return this.Longitude;
    }
    public double getAltitude(){
        return this.Altitude();
    }
    public double getTimezone(){
        return this.Altitude;
    }
    public String getDST() {
        return this.DST;
    }

    public string getType(){
        return this.Type;
    }
    public String getDBTZ() {
        return this.DBTZ;
    }
    public String getData_source() {
        return Data_source;
    }
}