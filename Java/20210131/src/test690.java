
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 给定一个保存员工信息的数据结构，它包含了员工唯一的id，重要度 和 直系下属的id。
// 比如，员工1是员工2的领导，员工2是员工3的领导。他们相应的重要度为15, 10, 5。
// 那么员工1的数据结构是[1, 15, [2]]，员工2的数据结构是[2, 10, [3]]，员工3的数据结构是[3, 5, []]。
// 注意虽然员工3也是员工1的一个下属，但是由于并不是直系下属，因此没有体现在员工1的数据结构中。
// 现在输入一个公司的所有员工信息，以及单个员工id，返回这个员工和他所有下属的重要度之和。
public class test690 {
    public static void main(String[] args) {
    }
}

// Definition for Employee.
class Employee {
    public int id;  // 员工 id
    public int importance; // 重要度
    public List<Integer> subordinates; // 下属
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