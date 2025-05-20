public abstract class Validator {
    protected Validator next;

    public Validator setNext(Validator next) {
        this.next = next;
        return next;
    }

    public void validate(User user) {
        if (check(user)) {
            if (next != null) next.validate(user);
            else System.out.println("✅ Semua validasi berhasil. Akun siap dibuat!");
        }
    }

    protected abstract boolean check(User user);
}
