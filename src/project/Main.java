package project;

import project.entity.User;
import project.outputer.Outputer;
import project.provider.DataProvider;
import project.view.AppView;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        runApp();

    }

    public static void runApp(){

        DataProvider dataProvider = new DataProvider();
        Outputer outputer = new Outputer();
        AppView appView = new AppView();
        appView.getInfo();
        List<User> userList = dataProvider.getUser();
        outputer.getOutput(userList);
        int indexToRetrieve = appView.getSearchElement();

        if (indexToRetrieve >= 0 && indexToRetrieve < userList.size()) {

            User user = userList.get(indexToRetrieve);
            System.out.println("User with index " + indexToRetrieve + " is: " + user);

        } else {
            System.out.println("There's no users with this index.");
        }

    }
}

