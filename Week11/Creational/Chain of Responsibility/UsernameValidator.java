public class UsernameValidator extends Validator {
    @Override
    protected boolean check(User user) {
        if (user.username == null || user.username.isEmpty()) {
            System.out.println("❌ Username tidak boleh kosong.");
            return false;
        }
        return true;
    }
}