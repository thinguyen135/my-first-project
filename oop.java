public class oop{
    public static void main(String[] args) {
        User u= new User();
        u.set_name("Thi");;
        u.set_membership(User.Membership.Silver);
        System.out.println("name:"+u.get_name()+" nha");
        System.out.println(u.get_membership());
    }
}
