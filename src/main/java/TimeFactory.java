import java.util.HashMap;
import java.util.Map;

public class TimeFactory {
    private static Map<String, Time> times = new HashMap<>();

    public static Time getTime(String nome, String pais){
        Time time = times.get(nome);
        if(time == null){
            time = new Time(nome, pais);
            times.put(nome, time);
        }

        return time;
    }

    public static int getTotalTimes() {
        return times.size();
    }
}
