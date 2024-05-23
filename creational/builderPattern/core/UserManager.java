package creational.builderPattern.core;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is a manager responsible for managing a collection of User objects. It provides utility
 * functions to add and remove users, as well as search for users based on specific criteria.
 * 
 * @author Ashish Wale
 */
public class UserManager {
    private static UserManager userManager = null;
    private List<User> users;

    private UserManager() {
        this.users = new ArrayList<>();
    }

    public static UserManager getManager() {
        if (userManager == null) {
            userManager = new UserManager();
        }
        return userManager;
    }

    public void addUser(User user) {
        if (user != null && !users.contains(user))
            users.add(user);
    }

    public void removeUser(User user) {
        if (user != null && users.contains(user))
            users.remove(user);
    }

    public List<User> searchUsers(UserQuery query) {
        List<User> users = new ArrayList<>();
        for (User user : this.users) {
            if (query.getFirstName() != null && query.getFirstName().equals(user.getFirstName()))
                if (query.getLastName() != null && query.getLastName().equals(user.getLastName()))
                    users.add(user);
                else if (query.getLastName() == null)
                    users.add(user);
        }
        
        return users;
    }
}
