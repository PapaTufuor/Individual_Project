import java.util.*;
import java.util.Objects;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Search{

    private static String SourceAirportcode;
    private static String DestinationAirportcode;

    public Search(String SourceAirportcode, String DestinationAirportcode) {
        Search.SourceAirportcode=SourceAirportcode;
        Search.DestinationAirportcode = DestinationAirportcode;
    }

    @Override
    public String toString(){
        return "From source to destination:";
    }

    public static boolean goal_test(String location) {
        return false;
    }

    public ArrayList<ArrayList<String>> Actions(){
        return null;
    }

    public static class OptimalDistance extends Search{
        private static HashMap<String, ArrayList<ArrayList<String>>> mymap;


        public OptimalDistance(String SourceAirportcode, String DestinationAirportcode, HashMap<String, ArrayList<ArrayList<String>>> mymap) {
            super(SourceAirportcode, DestinationAirportcode);
            OptimalDistance.mymap = mymap;
        }

        public static boolean goal_test(String location, String Destination) {
            return location.equals(Destination);
        }

        public static ArrayList<ArrayList<String>> actions(String Sourcecode) {
            HashMap<String, ArrayList<ArrayList<String>>> key_neighbours = Routes.Routemap;
            ArrayList<String> transition_cost = new ArrayList<>();
            ArrayList<String> successor_states = new ArrayList<>();
            ArrayList<ArrayList<String>> sequence = new ArrayList<>();
            if (key_neighbours.containsKey(Sourcecode)) {
                ArrayList<ArrayList<String>> values = key_neighbours.get(Sourcecode);

                for(ArrayList<String> neighbour : values){
                    transition_cost.add(neighbour.get(0));
                    successor_states.add(neighbour.get(1));
                }
                sequence.add(transition_cost);
                sequence.add(successor_states);
                return sequence;

            }
            return sequence;



            
        }
    }

    public static class Node implements Comparable<Search.Node> {
        private final String Airportcode;
        private Node parent;
        private double path_cost;

    public Node(String airportcode, Node parent, double path_cost){
        this.Airportcode = airportcode;
        this.parent = parent;
        this.path_cost = path_cost;
    }

    public Node(String airportcode){
        this.Airportcode = airportcode;
    }

    public void solution_path() {
        ArrayList<Node> result = new ArrayList<>();
        Node final_node = this;
        while (final_node != null) {
            result.add(0, final_node);
            final_node = final_node.parent;
        }
        write_to_file(result);
    }

    public void write_to_file(ArrayList<Node> result) {
        try{
            PrintWriter out = new PrintWriter("output.txt");
            String res = null;
            int i = 0;
            for (i =1; i<result.size(); i++) {
                res =(i) + ". from" + result.get(i).parent + "to" + result.get(i).Airportcode;
                out.write(res + "\n");
                System.out.println(res);
            }
            out.write("The distance covered is" + result.get(result.size()-1).path_cost + "Kilometers");
            out.write("Number of stops:" + i);
            out.close();

        }catch( FileNotFoundException fne) {
            fne.printStackTrace();
        }
    
    }

    @Override
    public int compareTo(Search.Node o) {
        return Double.compare(this.path_cost, o.path_cost);
    }

    @Override
    public String toString() {
        return "" + Airportcode;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(Airportcode, node.Airportcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Airportcode);
    }
}


public static boolean UniformCostSearch(String startcity, String Destinationcity){
    System.out.println("Searching from" + startcity + "to" + Destinationcity);
        Node root = new Node(startcity);

        PriorityQueue<Node> frontier =new PriorityQueue<>();
        frontier.add(root);
        HashSet<Node> explored = new HashSet<>();
        System.out.println("Initially, frontie =" + frontier);
        System.out.println("Initially, explored set =" + explored);
        while (frontier.size() > 0){
            Node popped_node = frontier.remove();
            System.out.println("Searching for a solution..");
            if (OptimalDistance.goal_test(popped_node.Airportcode, Destinationcity)){
                popped_node.solution_path();
                System.out.println("Solution found:" + popped_node.Airportcode);
                return true;
            }
            explored.add(popped_node);

            ArrayList<String> costs = OptimalDistance.actions(popped_node.Airportcode).get(0);
            ArrayList<String> successor = OptimalDistance.actions(popped_node.Aiportcode).get(1);
            for (int i = 0; i<costs.size(); i++){
                double old_pathcost = Double.parseDouble(costs.get(i)) + popped_node.path_cost;
                Node child = new Node(successor.get(i), popped_node, Double.parseDouble(cost.get(i)) + popped_node.path_cost);
                if ( ! (explored.contains(child) && frontier.contains(child))){
                    frontier.add(child);
                }
                else{
                    if (child.path_cost <old_pathcost){
                        old_pathcost = child.path_cost;
                        child.parent = popped_node.parent;
                        frontier.add(child);
                    }
                }
            }
        }
        return false;
    }
}