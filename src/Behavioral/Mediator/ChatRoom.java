package Behavioral.Mediator;

import java.util.Date;

/**
 * Created by benchen on 11/26/16.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
