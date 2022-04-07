![image](https://user-images.githubusercontent.com/59721293/162165110-f93acd90-b192-4dc5-8c79-8e9d2c757c7f.png)

```java
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
```

- `AbstractRememberMeSerices`는 RememberMe 로직을 실행시키기 위한 뼈대 서비스이다.
- let's say you are using `PersistentTokenBasedRememberMeServices` for AutoLogin because It  was already made by Spring Security.
- and you want to customize some logic of `processAutoLogin()` for using Session instead of Cookie. 
- so you create `CustomAutoLoginServices` and override the method like below.

```java
public class CustomAutoLoginServices extends AbstractRememberMeServices {
    @Override
    protected UserDetails processAutoLogin() {
        // might be some logic with Session or something
        // then return UserDetails named "pyro"
        return new UserDetails("pyro", 20);
    }
}
```
- at this point, interfaces were not really useful here, but the thing is that they offer common functions for example auto login, logout or something. If you take a look Spring Security you will be more clear about that.
- this is how abstract and interface work!
