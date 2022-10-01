

import java.util.ArrayList;
import java.util.HashMap;

public class Routes {

    private final String Airline_code;
    private final String SourceAirportCode;
    private final String DestinationAirportCode;
   
 



    public Routes(String airline_code,  String sourceAirportCode,  String destinationAirportCode) {
        this.Airline_code = airline.code;
        this.SourceAirportCode = sourceAirportCode;
        this.DestinationAirportCode = destinationAirportCode;
        
    }

    @Override
    public String toString() {
        return "Routes{"+
            "Airline_code='" + Airline_code +'\'' +
            ", SourceAirportCode='" + SourceAirportCode + '\'' +
            ",DestinationAirportCode=" + DestinationAirportCode + "\'" +
            "}";
    }

public String getAirline_code() {return Airline_code;}

public String getSourceAirportCode() { return SourceAirportCode;}

public String getDestinationAirportCode() {return DestinationAirportCode;}


public static HashMap<String, ArrayList<ArrayList<String>>> populateHashmap(){
    ArrayList<String[]> result = Readfile.Readfile("C:/Users/hp/Desktop/2nd sem/ICP/routes.csv");
    for (String[] element: result) {
        ArrayList<ArrayList<String>> values = new ArrayList<>();
        Routes routeobjects = Objects.RouteObject(element);
        String key = routeobject.SourceAirportCode;
        ArrayList<String> routeCost = new ArrayList<>();
        double cost = Haversine.RouteDistance(key, routeobjects.getDestinationAirportCode());
        routeCost.add(String.valueOf(cost));
        routeCost.add(routeobjects.getDestinationAirportCode());

        if (Routemap.containsKey(key)) {
            values = Routemap.get(key);
            values.add(routeCost);
            Routemap.put(key, values);
        }

        else{
            values.add(routeCost);
            Routemap.put(key,values);
        }
        
    }
    return Routemap;

}


}
