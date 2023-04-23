public class Clock {

    public Clock() {
    }

    public static void main(String [] args){
            Clock clock = new Clock();
            Clock.setHour = (23);
            Clock.setMinute =(59);
            Clock.setSeconds =(59);
            System.out.println("YOUR TIME IS:");
            System.out.println(Clock.setHour + "hrs" + " : "+ Clock.setMinute + "min" + " : " + Clock.setSeconds + "sec");

          }
    private static int setHour;
    private static int setMinute;
    private static int setSeconds;
    public Clock (int hour, int minute, int second){
        new Clock(23, 59,59);
    }

    public void setHour(int hour){
       this.setHour(0);
    }
    public int getHour(){
        return setHour;
    }

    public void setMinute(int minute){
       this.setMinute(0);
    }
    public int getMinute(){
        return setMinute;
    }
    public void setSeconds(int seconds){
        this.setSeconds(59);
    }

    public int getSeconds(){
        return setSeconds;
    }

}
