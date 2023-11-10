package spring5.ch05_pjt_01.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import spring5.ch05_pjt_01.contact.ContactSet;
import spring5.ch05_pjt_01.contact.dao.ContactDao;

public class ContactRegisterService {
//    @Autowired
    private ContactDao contactDao;

    // Default 생성자 추가
//    public ContactRegisterService() {
//        System.out.println("Default Constructor");
//    }

//    @Autowired
//    public ContactRegisterService(ContactDao contactDao) {
//        System.out.println("contactDao : " + contactDao);
//
//        this.contactDao = contactDao;
//    }

    public void register(ContactSet contactSet) {
        String name = contactSet.getName();

        if (verify(name)) {
            contactDao.insert(contactSet);
        } else {
            System.out.println("The name has already registered");
        }
    }

    public boolean verify(String name) {
        ContactSet contactSet = contactDao.select(name);

        return contactSet == null ? true : false;
    }

    @Autowired
    public void setWordDao(ContactDao contactDao) {
        this.contactDao = contactDao;
    }
}
