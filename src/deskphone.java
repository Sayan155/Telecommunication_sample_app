public class deskphone implements Telephone{
    private String myNumber;
    private boolean isringing;

    public deskphone(String myNumber){
        this.myNumber = myNumber;
    }

//    now we have to override the methods of that interface class
    @Override
    public void power_on() {
        System.out.println("Desk phone always powered on.");
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing "+ phoneNumber+ " on desk phone.");
    }

    @Override
    public void answer() {
        if(isringing) {
            System.out.println("Answering the desk phone.");
        }
        else{
            System.out.println("Phone is not ringing.");
        }
    }


    @Override
    public boolean callphone(String phoneNumber) {
        if(phoneNumber == myNumber){
            isringing = true;
            System.out.println("Phone ringing");
        }
        else{
            isringing = false;
        }
        return isringing;

    }

    @Override
    public boolean isringing() {
        return isringing;
    }
}
