public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public  BuddyInfo(){
        name = "John";
        address = "123 First street";
        phoneNumber = "613";
    }

    public  BuddyInfo(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}
