public class oop{
    public static void main(String[] args) {
        User u= new User("thi",User.Membership.Bronze);
        System.out.println("name:"+u.get_name());
        System.out.println(u.get_membership());
    }
}
