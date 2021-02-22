package ex002_filter.entities;

public class User {
    private int id;
    private String name;
    private String password;
    private boolean isAdmin;

    public User(){

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getAdmin(){
        return isAdmin;
    }

    public void setAdmin(boolean admin){
        this.isAdmin = admin;
    }

    @Override
    public boolean equals(Object o){
        if(o.getClass() == this.getClass()){
            User user = (User) o;
            return isAdmin == user.isAdmin && user.name.equals(name) && user.password.equals(password);
        }
        return false;
    }

    @Override
    public int hashCode(){
        int result = 31;
        result = 31 * result + ((name != null) ? name.hashCode() : 0);
        result = 31 * result + ((password != null) ? password.hashCode() : 0);
        result = 31 * result + (isAdmin ? 1 : 0);
        return result;
    }
}
