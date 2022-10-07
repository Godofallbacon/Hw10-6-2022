package user;

public class User {

    private String userName;
    private String passWord;
    private char size;
    private int rewardPoints;
    private float balance;
    private String[] address;


    public User(){ //default constructor

    }//end of constructor

    public float getBalance() {
        return balance;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public void setBalance(float balance) {
        if (balance < 0) {
            System.out.println("Cannot be Negative!");
        } else {
            this.balance = balance;
        }
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public User(String userName, String passWord, int rewardPoints, float balance, String[] address){
        this.userName = userName;
        this.passWord = passWord;
        this.rewardPoints = rewardPoints;
        this.balance = balance;
        this.address = address;

    }

    public void setUserName(String newUserName){
        this.userName = newUserName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void resetPassword(String newPassword){
        this.passWord = newPassword;
    }

    public void useRewardPoints(int pointsToUse){
       // rewardPoints - pointsToUse;
        rewardPoints=rewardPoints-pointsToUse;
        System.out.println("You just used " + pointsToUse + " and now have " + rewardPoints + " left");
    }
    public void printAddress() {
        for (int i = 0; i < address.length; i++) {
            System.out.println(address[i]);
        }
    }
    public void printUserProfile() {
        System.out.println(userName + " " + balance + " " + rewardPoints + " " + address[0] + " " + address[1]);
        }

    }

