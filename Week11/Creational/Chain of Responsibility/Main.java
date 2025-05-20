public class Main {
    public static void main(String[] args) {
        Validator validatorChain = new UsernameValidator();
        validatorChain
            .setNext(new PasswordValidator())
            .setNext(new EmailValidator());

        User user1 = new User("andri", "abc12345", "andri@mail.com");
        User user2 = new User("", "pass", "mail.com");

        System.out.println("=== Validasi User 1 ===");
        validatorChain.validate(user1);

        System.out.println("\n=== Validasi User 2 ===");
        validatorChain.validate(user2);
    }
}

// Model User
class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}

// Abstract Validator
abstract class Validator {
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

// Concrete Validators
class UsernameValidator extends Validator {
    @Override
    protected boolean check(User user) {
        if (user.username == null || user.username.isEmpty()) {
            System.out.println("❌ Username tidak boleh kosong.");
            return false;
        }
        return true;
    }
}

class PasswordValidator extends Validator {
    @Override
    protected boolean check(User user) {
        if (user.password == null || user.password.length() < 8) {
            System.out.println("❌ Password minimal 8 karakter.");
            return false;
        }
        return true;
    }
}

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
