package week.day1;


public class Mobile {
  public void makeCall() {
	  String  mobileModel = "RedmiNote7";
	  float   mobileWeight= 5.8f;
	  System.out.println("MobileModel :" +mobileModel);
	  System.out.println("MobileWeigh :" +mobileWeight );
	  }
  public void sendMsg() {
	  boolean  isFullCharged = true;
	  int      mobileCost    = 17000;
	  System.out.println("Charged :"    +isFullCharged );
	  System.out.println("MobileCost :" +mobileCost );
  }
  public static void main(String[] args) {
	Mobile myMobile=new Mobile() ;
	myMobile.makeCall();
    myMobile.sendMsg();
    System.out.println("This is my mobile");
}
}
