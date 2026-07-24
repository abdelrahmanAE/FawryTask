public class Violaitons {
    private String RuleName;
    private String state;
    private int fees;
    public Violaitons(String RuleName, String state, int fees){
        this.RuleName = RuleName;
        this.state = state;
        this.fees = fees;
    }
    // getters and setters
    public String getState(){return state;}
    public void setState(String state){this.state = state;}

    public String getRuleNameRuleName(){return RuleName;}
    public void setRuleName(String RuleName){this.RuleName = RuleName;}

    public int getFees(){return fees;}
    public void setFees(int fees){this.fees = fees;}
}
