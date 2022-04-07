import abstrac.PersistentTokenBasedRememberMeServices;

public class Main {
    public static void main(String[] args) {
        PersistentTokenBasedRememberMeServices persistentTokenBasedRememberMeServices = new PersistentTokenBasedRememberMeServices();
        persistentTokenBasedRememberMeServices.autoLogin();
    }
}
