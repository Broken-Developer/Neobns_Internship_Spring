package spring5.ch05_pjt_01.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import spring5.ch05_pjt_01.contact.ContactSet;
import spring5.ch05_pjt_01.contact.dao.ContactDao;

import javax.annotation.Resource;

public class ContactSearchService {
//    @Autowired(required = false)
    @Resource
//    @Qualifier("usedDao")
    private ContactDao contactDao;

    // Default 생성자 추가
//    public ContactSearchService() {
//        System.out.println("Default Constructor");
//    }

//    @Autowired
//    public ContactSearchService(ContactDao contactDao) {
//        System.out.println("contactDao : " + contactDao);
//
//        this.contactDao = contactDao;
//    }

    public ContactSet search(String name) {
        if (verify(name)) {
            return contactDao.select(name);
        } else {
            System.out.println("Contact information is available");
        }

        return null;
    }

    public boolean verify(String name) {
        ContactSet contactSet = contactDao.select(name);

        return contactSet != null ? true : false;
    }

//    @Autowired
//    @Resource
    public void setContactDao(ContactDao contactDao) {
        this.contactDao = contactDao;
    }
}
