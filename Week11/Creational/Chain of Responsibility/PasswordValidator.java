public class PasswordValidator extends Validator {
    @Override
    protected boolean check(User user) {
        if (user.password == null || user.password.length() < 8) {
            System.out.println("❌ Password minimal 8 karakter.");
            return false;
        }
        return true;
    }
}