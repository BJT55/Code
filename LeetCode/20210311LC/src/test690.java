import java.util.*;

public class test690 {
}

// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee> map = new HashMap<>();
        for (Employee e : employees){
            map.put(e.id,e);
        }
        return getImportance(map,id);
    }

    public int getImportance(Map<Integer,Employee> employees, int id){
        Employee employee = employees.get(id);
        int ret = employee.importance;
        for (int i = 0; i < employee.subordinates.size(); i++){
            Integer subId = employee.subordinates.get(i);
            employee.importance += getImportance(employees,subId);
        }
        return employee.importance;
    }
}