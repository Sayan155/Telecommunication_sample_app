public class smartphone implements  Telephone{
    private String myNumber;
    private boolean isringing;
    private boolean power_on;


    public smartphone(String myNumber){
        this.myNumber = myNumber;
    }

    @Override
    public void power_on() {
        power_on = true;
        System.out.println("Powering on...");
    }


    @Override
    public void dial(String phoneNumber) {
        System.out.println("Dialing "+phoneNumber+" on smartphone.");

    }

    @Override
    public void answer() {
        if(isringing && power_on){
            System.out.println("Answering the smartphone");
        }
        else{

        }

    }

    @Override
    public boolean callphone(String phoneNumber) {
        if(phoneNumber==myNumber){
            isringing = true;
            System.out.println("The phone is ringing for the number "+phoneNumber);
        }
        else{
//            let's code if the entered number matches our number and if the phone is powered on or not
            if(phoneNumber != myNumber){
                System.out.println("Wrong number entered.");
                isringing = false;
            }
        }
        return isringing;
    }

    @Override
    public boolean isringing() {
        return isringing;
    }
}
