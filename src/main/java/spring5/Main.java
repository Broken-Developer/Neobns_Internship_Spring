package spring5;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        TransportationWalk transportationWalk = new TransportationWalk();
//        transportationWalk.move();

        // applicationContext.xml에 bean을 생성하여 DI한다.
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

        TransportationWalk transportationWalk = ctx.getBean("tWalk", TransportationWalk.class);
        transportationWalk.move();

        ctx.close();
    }
}