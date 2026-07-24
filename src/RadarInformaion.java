public class RadarInformaion {
    private String PlateNumber;
    private String date;
    private String CarType;
    private int speed;
    private boolean status;
    public RadarInformaion(String PlateNumber, String date, String CarType, int speed, boolean status){
        this.PlateNumber = PlateNumber;
        this.date = date;
        this.CarType = CarType;
        this.speed = speed;
        this.status = status;
    }
    // getters and seters
    public String getPlate_Number(){return PlateNumber;}
    public void setPlate_Number(String PlateNumber){this.PlateNumber = PlateNumber;}

    public String getDate(){return date;}
    public void setDate(String date){this.date = date;}

    public String getCarType(){return CarType;}
    public void setCarType(String car_Type){this.CarType = car_Type;}

    public int getSpeed(){return speed;}
    public void setSpeed(int speed){this.speed = speed;}

    public boolean IsStatus(){return status;}
    public void setStatus(boolean status){this.status = status;}

    public void print_info(){
        System.out.println("=========================================================");
        System.out.println("Plate Number: " + PlateNumber);
        System.out.println("Date: " + date);
        System.out.println("Car Type: " + CarType);
        System.out.println("Speed: " + speed);;
        System.out.println("Seatbelt: " + (status ? "Fastened" : "NOT Fastened"));
    }
}
