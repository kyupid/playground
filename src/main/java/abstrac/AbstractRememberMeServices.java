package abstrac;

// Base structure for RememberMeService
public abstract class AbstractRememberMeServices implements FunctionOne, FunctionTwo {
    @Override
    public void printOne() {
        System.out.println("Hello, I'm from FunctionOne");
    }

    @Override
    public void printTwo() {
        System.out.println("Hello, I'm from FunctionTwo");
    }

    public final void autoLogin() {
        UserDetails userDetails = processAutoLogin();
        System.out.println(userDetails.toString());
    }

    protected abstract UserDetails processAutoLogin();
}
