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

## Conclusion

인터페이스 추상 메소드는 다른 클래스들이 구현할 공통적인 기능들을 제공하는 것이다.

추상클래스는 어떤 행동을 하기 위한 뼈대 클래스가 될 수 있고, 자유롭게 커스텀이 필요하다고 생각하는 행동들을 서브클래스에 위임한다.

그 뼈대(행동, 추상 메소드)들을 오버라이드하면 내 입맛에 맞게 사용이 가능한 것이다.

스프링이라면 해당 커스텀 서비스를 빈으로 등록해 사용하는 것이다.
