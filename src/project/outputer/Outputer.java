package project.outputer;

import project.entity.User;

import java.util.List;

public class Outputer {

    public void getOutput(List<User> userList) {
        int count = 0;
        for (User info : userList) {
            count++;
            System.out.println(count + ") " + info);
        }
    }

}
