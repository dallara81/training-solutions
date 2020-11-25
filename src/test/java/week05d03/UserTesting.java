package week05d03;

import java.util.ArrayList;
import java.util.List;

public class UserTesting {

    private List<User> userList = new ArrayList<>();

    public void validate(List<User> userList) {
        int i = 0;
        while (i < userList.size()) {
            if (userList.get(i).getName() == null || "".equals(userList.get(i).getName()) || userList.get(i).getName().isBlank()) {
                throw new IllegalArgumentException("Ne hagyd üresen a név mezőt!");
            } else if (userList.get(i).getAge() > 0 || userList.get(i).getAge() < 125) {
                throw new IllegalArgumentException("Az életkor reálisan 0 és 125 év közé eső szám lehet csak!");
            }
        }
    }

    public static void main(String[] args) {
        UserTesting userV = new UserTesting();
        List<User> listUser = new ArrayList<>();
        User user1 = new User("Éva", 19);
        User user2 = new User("Tünde", -48);
        User user3 = new User("Dorottya", 124);
        User user4 = new User("Tímea", 126);
        User user5 = new User("Rozália", 0);
        User user6 = new User("Mária", 21);
        User user7 = new User("", 22);

        listUser.add(user1);
        listUser.add(user2);
        listUser.add(user3);
        listUser.add(user4);
        listUser.add(user5);
        listUser.add(user6);
        listUser.add(user7);

        userV.validate(listUser);
    }
}