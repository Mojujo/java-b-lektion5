package se.oscar;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        User user = new User("Oscar", "oscar@gmail.com");
        User user1 = new User("Stefan", "stefan@gmail.com");
        User user2 = new User("Klas", "klas@gmail.com");
        User user3 = new User("Oscar", "oscar@gmail.com");



        if (user.equals(user3)) {
            System.out.println("Users match");
        } else {
            System.out.println("Users don't match");
        }

        System.out.println();

        Map<String, User> userMap = new HashMap<>();
        userMap.put("Oscar", user);
        userMap.put("Stefan", user1);
        userMap.put("Klas", user2);

        User foundUser = userMap.get("Oscar");
        System.out.println("Found user: " + foundUser.getName() + " "   + foundUser.getEmail());

        System.out.println();

        for (Map.Entry<String, User> entry : userMap.entrySet()) {
            User userUnique = userMap.get(entry.getKey());
            if (userUnique != null) {
                System.out.println("Found user: " + userUnique.getName() + " "   + userUnique.getEmail());
            }
        }

        System.out.println();

        Set<User> userSet = new HashSet<>();
        userSet.add(user);
        userSet.add(user1);
        userSet.add(user2);
        System.out.println("Amount in set: " + userSet.size());
        User searchUser = new User("Stefan", "stefan@gmail.com");
        if (userSet.contains(searchUser)) {
            System.out.println("Found user: " + searchUser.getName() + " "   + searchUser.getEmail());
        } else {
            System.out.println("User not found");
        }

        for (User setUser : userSet ) {
            if (setUser.equals(searchUser)) {
                System.out.println("Found user: " + setUser.getName() + " "   + setUser.getEmail());
                break;
            }
        }
    }
}