public class oop{
    public static void main(String[] args) {
        User u= new User("thi",User.Membership.Bronze);
        User u2=new User("thi",User.Membership.Bronze);
        System.out.println("name:"+u.get_name());
        System.out.println(u.equals(u2));
    }
}
