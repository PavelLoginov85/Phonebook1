import java.util.HashMap;
import java.util.Map;

public class Phone {
    private Map<String,String> map = new HashMap<>();
    // метод добавление телефонов

    void addphone(String phoneNum,String name){
        map.put(phoneNum,name);
    }
    String getByphoneNum(String phoneNum){
        return phoneNum + ":" + map.get(phoneNum);
    }
    String getByname(String name){
        StringBuilder st = new StringBuilder();
        for (Map.Entry entry:
             map.entrySet())
        {
            if(entry.getValue().equals(name))
            {
                st.append(entry.getKey())
                        .append(":")
                        .append(name)
                        .append("\n");
            }
        }
        return st.toString();

    }
//    String all(){
//        return map.toString();
//    }
}
