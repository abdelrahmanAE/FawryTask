import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RadarSystem {
    private List<TrafficRule> rules = new ArrayList<>();
    private List<CalcFines> AllFines = new ArrayList<>();
    private Map<String, Integer> RuleViolatIonsCount = new HashMap<>();

    public void AddRule(TrafficRule rule){
        rules.add(rule);
    }
    public void ProocessRadarInfo(RadarInformaion info){
        List<Violaitons> CurrentViolations = new ArrayList<>();
        for (TrafficRule it : rules){
            Violaitons v = it.CheckRule(info);
            if(v !=  null){
                CurrentViolations.add(v);
                String RuleName = v.getRuleNameRuleName();
                RuleViolatIonsCount.put(RuleName, RuleViolatIonsCount.getOrDefault(RuleName, 0) + 1);
            }
        }
        if(!CurrentViolations.isEmpty()){
            CalcFines fine = new CalcFines(info.getPlate_Number(), CurrentViolations);
            AllFines.add(fine);
            fine.PrintFine();
            System.out.println("=========================================================");
        }
    }
    public void PrintAllFines(){
        System.out.println("all fines");
        for (CalcFines it : AllFines) System.out.println("Plate : " + it.getPlateNumber() + " | Total Amount " + it.getTotal() + "EGP");
        System.out.println("=========================================================");
    }
    public void PrintViolationsCount(){
        System.out.println("all violated");
        for (Map.Entry<String, Integer> entry : RuleViolatIonsCount.entrySet()){
            System.out.println(entry.getKey() +  " : " + entry.getValue());
        }
    }
}
