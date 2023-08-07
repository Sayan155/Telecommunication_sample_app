public class Main {
    public static void main(String[] args) {

        deskphone my_dp = new deskphone("7980204477");
        my_dp.power_on();
        my_dp.callphone("7980204477");
        my_dp.answer();

        smartphone my_sp = new smartphone("9831475565");
        my_sp.power_on();
//        my_sp.callphone("7980204477");
        my_sp.callphone("9831475565");
        my_sp.answer();
    }
}