public class User {
    private String _name;
    private String _memberShip;
    void set_name(String name){
        _name=name;
    }  
    void set_membership(Membership memberShip){
        _memberShip=memberShip.name();

    }
    String get_name(){
        return _name;
    }

    public User(String name,Membership membership){
        set_name(name);
        set_membership(membership);
    }
    
    String get_membership(){
        return _memberShip;
    }
    public enum Membership{
        Bronze,Silver,Gold;
    }
    
}
