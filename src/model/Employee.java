
package model;

public class Employee {
    private String id;
    private String name;
    private String username;
    private String password;

    public Employee(String id, String name, String username, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getName() { return name; }
}