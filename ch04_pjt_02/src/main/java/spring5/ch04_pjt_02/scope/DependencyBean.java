package spring5.ch04_pjt_02.scope;

import spring5.ch04_pjt_02.scope.InjectionBean;

public class DependencyBean {
    InjectionBean injectionBean;

    public DependencyBean(InjectionBean injectionBean) {
        this.injectionBean = injectionBean;
    }
}
