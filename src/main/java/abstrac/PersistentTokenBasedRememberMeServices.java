package abstrac;

public class PersistentTokenBasedRememberMeServices extends AbstractRememberMeServices {
    @Override
    protected UserDetails processAutoLogin() {
        // might be some logic with Cookie
        // and return UserDetails named "kyu"
        return new UserDetails("kyu", 29);
    }
}
