package com.company;

public class Main {
    private Wife bride;
    private Husband bridegroom;
    private Family family;

    public void main(String[] args) {
        this.bride = new Wife("Rodina",25,false);
        this.bridegroom = new Husband("Viorel",25, false);

        family = new Family(this.bride,this.bridegroom);

        family.setName(bridegroom.name);
        family.addChild("Catalina");
    }
}
