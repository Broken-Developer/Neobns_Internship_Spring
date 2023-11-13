package spring5.ch05_pjt_01.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutoWiredEx {
    @Autowired
    public AutoWiredEx(@Qualifier("usedBean") FirstBean fBean, SecondBean sBean) {
        System.out.println("fBean : " + fBean);
        System.out.println("sBean : " + sBean);
    }

    @Autowired
    public void AutoWiredEx(ThirdBean tBean, @Qualifier("usedBean") FourthBean fBean) {
        System.out.println("tBean : " + tBean);
        System.out.println("fBean : " + fBean);
    }
}
