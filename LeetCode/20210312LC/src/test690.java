import java.util.*;

public class test690 {
}

// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

class Solution690 {
    Map< Integer, Employee > map = new HashMap<>();
    public int getImportance(List<Employee> employees, int id) {
        for (Employee e : employees)
            map.put(e.id, e);
        return dfs(id);
    }
    public int dfs(int val){
        Employee employee = map.get(val);
        int ans = employee.importance;
        for (Integer subId : employee.subordinates)
            ans += dfs(subId);
        return ans;
    }
}