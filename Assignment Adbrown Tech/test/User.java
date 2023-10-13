package test;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<String> permissions = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPermission(String permission) {
        permissions.add(permission);
    }

    public List<String> getPermissions() {
        return permissions;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', permissions=" + permissions + "}";
    }
}

