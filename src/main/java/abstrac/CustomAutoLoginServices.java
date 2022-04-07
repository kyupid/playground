package abstrac;

public class CustomAutoLoginServices extends AbstractRememberMeServices {
    @Override
    protected UserDetails processAutoLogin() {
        // might be some logic with Session or something
        // then return UserDetails named "pyro"
        return new UserDetails("pyro", 20);
    }
}
