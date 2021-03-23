package icu.kyakya.orm.mybatis.config.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Slf4j
@Configuration
public class TestAspect {

//    @Autowired
//    UserService userService;
//
//    @AfterReturning(pointcut = "target(icu.kyakya.orm.mybatis.service.UserService) && execution(* selectAllOrInit())", returning = "users")
//    public void iniUserTable(List<User> users) {
//        log.info("init user table");
//        if (users.size() == 0) {
//            IntStream.range(0, 30).forEach(i -> {
//                User u = new User();
//                u.setName("u" + i);
//                u.setGender("xx");
//                u.setHeight(180 - i);
//                u.setCreateTime(new Date());
//                userService.insert(u);
//            });
//            users.addAll(userService.selectAll());
//        }
//    }


}

