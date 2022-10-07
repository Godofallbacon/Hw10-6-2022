package user;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    User user1 = new User();//User()
        String[] address1 = {"198_BoringLane","421_GoogleBoulevard"};
        //ObjectName.PropertyName = Whatever we want to store ;
       // user1.userName = "Mikaila";
    //ObjectName.MethodName();
        user1.setUserName("Mikaila");
        System.out.println(user1.getUserName());
        User user2 = new User();
        user2.setUserName("Andrew");
        System.out.println(user2.getUserName());

        User user3 = new User("Jazmin","Coding", 1000, 0, address1);
        user3.resetPassword("int");
        //System.out.println(user3.getUserName() + " " + user3.getPassWord() + " " + user3.getRewardPoints());
        //System.out.println("You just used " + user3.getRewardPoints() + " points");
        //user3.useRewardPoints(1000);
        user3.setBalance(-1000.0f);
        //System.out.println(user3.getBalance());
        //user3.printAddress();
        user3.printUserProfile();




    }
}
