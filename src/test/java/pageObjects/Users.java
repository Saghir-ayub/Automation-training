package pageObjects;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private List<UserInformation> users = new ArrayList<>();
    public void addUser(UserInformation user){
        users.add(user);
    }

    public UserInformation getUser(int userNumber) {
        return users.get(userNumber);
    }

    public int size(){
        return users.size();
    }

}
