> **Q2) Spring에서 인터페이스 DI 로 구현한 뒤에 그냥 메소드 호출하면 어떻게 그게 실행이 되는거지?**
> 
> 추측: 스프링이 실행될때 빈에 올라가는 기본적으로 올라가는 인터페이스들을 구현하는 구현체가 있는데 다른 곳에서 그 인터페이스를 DI 하면 기본으로 셋팅되어있는 impl객체를 부른다

```java
@Controller
@RequiredArgsConstructor
public class MemberMyInfoController {

    private final RememberMeServices rememberMeServices;

    @GetMaapping("test")
    @ResponseBody
    public Test test() {
        // execute certain method, which is implemented already when starting Spring by default
        rememberMeServices.someMethod(); 
        return new Test();
    }
}
```
