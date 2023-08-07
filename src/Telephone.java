public interface Telephone {
    // power on
    // dial a number
    // answer a phone call
    // call another phone
    // is ringing
    void power_on(); // just defining the method and not the body that why using ; and not {
    void dial(String phoneNumber );
    void answer();
    boolean callphone(String phoneNumber);
    boolean isringing();
}
