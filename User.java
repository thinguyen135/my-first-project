import java.util.*;
public class User {
    private String _name;
    private String _memberShip;
    void set_name(String name){
        _name=name;
    }  
    void set_membership(Membership memberShip){
        _memberShip=memberShip.name();

    }
    public static List<User> admins;
    public User(String string,Membership membership){
        set_name(string);
        set_membership(membership);
    }
    public User(){

    }
    public boolean equals(User u2){
        if(u2.get_name()==get_name() && get_membership()==u2.get_membership()){
            return true;
        }
        return false;
    }
    
    String get_name(){
        return _name;
    }
    String get_membership(){
        return _memberShip;
    }
    public enum Membership{
        Bronze,Silver,Gold;
    }
}
