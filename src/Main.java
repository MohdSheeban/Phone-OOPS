public class Main {
    public static void main(String[] args) {

        Landline ll1=new Landline("6388521241");
        Landline ll2=new Landline("7985170330");

        ll1.callNumber("7985170330");
        ll2.receiveCall("7985170330");
        System.out.println(ll2.answerCall());
    }
}