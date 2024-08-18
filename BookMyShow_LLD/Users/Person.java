package BookMyShow_LLD.Users;

import BookMyShow_LLD.entity.Address;

public abstract class Person {

    private String name;
    private Address address;
    private String email;
    private String phone;

    /* Has a relationship*/
    private Account account;

}
