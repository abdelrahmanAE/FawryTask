public class SeatbeltRule implements TrafficRule {
    @Override
    public Violaitons CheckRule(RadarInformaion info){
        if(!info.IsStatus()) return new Violaitons("SeatbeltRule", "seatbelt not fastend", 100);
        return null;
    }
}
