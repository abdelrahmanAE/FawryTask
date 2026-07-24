public class SpeedLimitRule implements TrafficRule{
    @Override
    public Violaitons CheckRule(RadarInformaion info){
        int MaxSpeed = 80;
        if(info.getCarType().equalsIgnoreCase("truck") || info.getCarType().equalsIgnoreCase("Truck")) MaxSpeed = 60;
        else if(info.getCarType().equalsIgnoreCase("private") || info.getCarType().equalsIgnoreCase("Private")) MaxSpeed = 80;

        if(info.getSpeed() >MaxSpeed) {
            String state = "speed of " + info.getSpeed()+ " exceed mas allowed " + MaxSpeed;
            return new Violaitons("SpeedLimitRule", state, 300);
        }
        return null;
    }
}
