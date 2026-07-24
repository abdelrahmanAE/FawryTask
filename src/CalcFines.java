import java.util.List;

public class CalcFines {
    private String PlateNumber;
    private List<Violaitons> violaitons;
    private int total;

    public CalcFines(String PlateNumber, List<Violaitons> violaitons){
        this.PlateNumber = PlateNumber;
        this.violaitons = violaitons;
        this.total = CalcTotal();
    }
    private int CalcTotal(){
        int sum = 0;
        for(Violaitons it : violaitons) sum += it.getFees();
        return sum;
    }
    public void PrintFine() {
        System.out.println("Traffic fine for car " + PlateNumber);
        System.out.println("Total amount " + total + "EGP");
        System.out.println("Violations : ");
        for (Violaitons it : violaitons) System.out.println(it.getState() + " : " + it.getFees() + "EGP");
    }
    public String getPlateNumber(){return PlateNumber;}
    public List<Violaitons> getViolaitons(){return violaitons;}
    public int getTotal(){return total;}
}
