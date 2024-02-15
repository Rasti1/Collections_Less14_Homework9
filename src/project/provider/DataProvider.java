package project.provider;

import project.entity.User;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    public List<User> getUser(){

        List<User> userList = new ArrayList<>();

        userList.add(new User("Nate", "natan423@gmail.com"));
        userList.add(new User("Alice", "alice222@gmail.com"));
        userList.add(new User("Bob", "bob543@gmail.com"));
        userList.add(new User("Jake", "jakel@gmail.com"));
        userList.add(new User("Veronika", "ver123@gmail.com"));

        return userList;

    }
}
