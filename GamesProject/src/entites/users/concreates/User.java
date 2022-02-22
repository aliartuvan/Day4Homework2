package entites.users.concreates;

import entites.users.abstracts.Entity;

 abstract public class User implements Entity {
    private int id;
    private String nickName;
    private String password;

    public User(int id, String nickName, String password) {
        this.id = id;
        this.nickName = nickName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
