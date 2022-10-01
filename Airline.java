


public class Airline{
    private final int AirlineID;
    private final String Airline_name;
    private final String alias;
    private final String IATA_code;
    private final String ICAO_code;
    private final String Call_sign;
    private final String Country;
    private final String Active_state;


    public Airline(int AirlineID, String Airline_name, String alias, String IATA_code, String ICAO_code, String Call_sign, String Country, String Active_state){
        this.AirlineID = AirlineID;
        this.ICAO_code = ICAO_code;
        this.Airline_name = Airline_name;
        this.alias = alias;
        this.IATA_Code= IATA_Code;
        this.Call_sign = Call_sign;
        this.Country = Country ;
        this.Active_state= Active_state;
      
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Airline{" +
        "AirlineID='" + AirlineID  +
        ",Airline_name=" + Airline_name +'\'' +
        ", alias='" + alias + '\'' +
        ",IATA_code="   + IATA_code + "\'" +
        "ICAO_code=" + ICAO_code + "\'" +
        ",Call_sign=" + Call_sign + "\'" +
        ",Country='" + Country + "\'" +
        ",Active_state" + Active_state + "\'" +
        "}";
    }

    public int getAirlineID() { return this.AirlineID; }
    public String getAirline_name() { return this.Airline_name;}
    public String getalias() { return this.alias;}
    public String getIATA_code() { return this.IATA_code;}
    public String getICAO_code() { return this.ICAO_code;}
    public String getCall_Sign() { return this.Call_sign;}
    public String getCountry() {  return this.Country;}
    public String getActive_state() { return this.Active_state;}
}