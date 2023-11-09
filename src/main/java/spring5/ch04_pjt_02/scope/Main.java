package spring5.ch04_pjt_02.scope;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

        DependencyBean dependencyBean_01 = ctx.getBean("dependencyBean", DependencyBean.class);
        DependencyBean dependencyBean_02 = ctx.getBean("dependencyBean", DependencyBean.class);

        if (dependencyBean_01.equals(dependencyBean_02)) {
            System.out.println("dependencyBean_01 == dependencyBean_02");
        } else {
            System.out.println("dependencyBean_01 != dependencyBean_02");
        }

        ctx.close();

        /*
        *   스프링 컨테이너에서 생성된 빈을 getBean()을 이용하여 가져오면 가져올 때마다 새로운 빈이 생성되는 것이 아니라 동일한 빈이 계속 사용된다.
        *   이것을 '싱글턴(singleton)'이라고 한다.
        *   개발자가 특별히 명시하지 않으면 default로 모든 빈은 싱글턴 범위를 갖는다.
        *
        *   싱글턴과 반대되는 개념을 '프로토 타입(prototype)'이라고 한다.
        *   이는 개발자가 직접 applicationContext.xml에서 빈을 정의할 때, scope 속성을 이용하여 명시해줘야 한다.
        */
    }
}