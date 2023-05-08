package com.ap.shallowanddeepdeepcopyexm;

public class User implements Cloneable{
    public String name;
    public int id;
    public Address address;

    public User(){
    }

    public User(String name, int id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString(){
        return "User [name " + name + ", Id " + id + " "+ address + " ]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        User user = null;
        try{
            user = (User) super.clone();
        } catch (CloneNotSupportedException e){
            System.out.println("Cloneable not supported");
        }
        user.address = (Address) this.address.clone();
        return user;
    }

}
