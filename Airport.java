package ICP_Project;

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
    private final String timezone;
    private final String Type;
    private final String Data_source;



    public Airport( int Airport_id, String Airport_name, String City, String Country, String IATA_Code, String ICAO_Code, double Latitude, double Longitude, double Altitude, double timezone, String DST, String timezone, String Type, String Data_source){

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
        this.timezone=timezone;
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
        this.timezone="";
        this.Type="";
        this.Data_source="";
    }

    @java.lang.Override
    public java.lang.String toString(){
        return "Airport {" +
                "Airport_id=" + Airport_id +
                ",Airport_name=" + Airport_name + "\'" +
                ",City=" + City + "\'"
                "IATA_Code=" + IATA_Code +
                "ICAO_Code" + ICAO_Code +
                "Latitude=" + Latitude +
                "Longitude=" + Longitude +
                "Altitude=" + Altitude +
                "timezone=" + timezone +
                "DST=" + DST +
                "timezone=" + timezone +
                "Type=" + Type +
                "Data source" + Data_source
    }
}