import java.util.ArrayList;
public class oop{
    public static void main(String[] args) {
        // create array save consumer ,it consists name and card
        ArrayList<User> users= new ArrayList<User>();
        User.admins= new ArrayList<User>();
        users.add(new User("thi",User.Membership.Silver));
        users.add(new User("Trung",User.Membership.Gold));
        User.admins.add(new User("chien",User.Membership.Silver));
        if (!User.admins.isEmpty()) {
            System.out.println(User.admins.get(0).get_name());
        }
        shout(19);
        shout("khó nha");
        for (User person:users){
            System.err.println(person.get_name()+"   "+person.get_membership());
        }
    }
    private static <T> void shout(T text){
        System.out.println(text);
    }
}
