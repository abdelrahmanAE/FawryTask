public class Main {
    public static void main(String[] args) {
        RadarSystem radar = new RadarSystem();

        radar.AddRule(new SeatbeltRule());
        radar.AddRule(new SpeedLimitRule());

        RadarInformaion car1 = new RadarInformaion("ABC1234", "2026-07-24", "private", 95, false);
        RadarInformaion car2 = new RadarInformaion("AEC1434", "2026-05-11", "truck", 80, true);
        RadarInformaion car3 = new RadarInformaion("DEF2637", "2026-02-19", "private", 55, true);
        RadarInformaion car4 = new RadarInformaion("EEFG2343", "2026-01-01", "truck", 80, false);

        System.out.println("Radar Data");
        radar.ProocessRadarInfo(car1);
        radar.ProocessRadarInfo(car2);
        radar.ProocessRadarInfo(car3);
        radar.ProocessRadarInfo(car4);
        radar.PrintAllFines();
        radar.PrintViolationsCount();
    }
}