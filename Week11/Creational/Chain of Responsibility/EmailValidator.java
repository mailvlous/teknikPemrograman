class EmailValidator extends Validator {
    @Override
    protected boolean check(User user) {
        if (user.email == null || !user.email.contains("@")) {
            System.out.println("❌ Format email tidak valid.");
            return false;
        }
        return true;
    }
}