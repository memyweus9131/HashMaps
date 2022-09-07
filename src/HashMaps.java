import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {

        HashMap <String, String> EmployeeList = new HashMap<String, String>();

        EmployeeList.put ("Tom", "VP");
        EmployeeList.put ("Bob", "SVP");
        EmployeeList.put ("Cook", "EVP");
        EmployeeList.put ("Brock", "FVP");
        EmployeeList.put ("Peter", "SEVP");

        System.out.println(EmployeeList);

        EmployeeList.remove("2");
        System.out.println(EmployeeList);

        EmployeeList.size();
        System.out.println(EmployeeList.size());

        EmployeeList.remove("Peter");
        System.out.println(EmployeeList);

        System.out.println(EmployeeList.containsKey("Peter"));

        System.out.println(EmployeeList.containsValue("SEVP"));

        System.out.println(EmployeeList.get("Cook"));

        System.out.println(EmployeeList.values());

        System.out.println(EmployeeList.keySet());


        EmployeeList.clear();
        System.out.println(EmployeeList);




    }
}
