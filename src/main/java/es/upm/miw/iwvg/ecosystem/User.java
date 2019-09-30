package es.upm.miw.iwvg.ecosystem;

public class User {
    private int number;

    private String name;

    private String midname;

    private String familyName;

    public User(int number, String name, String midname, String familyName) {
        this.number = number;
        this.name = this.format(name);
        this.midname = this.format(midname);
        this.familyName = this.format(familyName);
    }

    private String format(String string) {
        return string.trim().substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public String fullName() {
        return this.name + " " + this.midname + " " + this.familyName;
    }

    public String initials() {
        return this.name.substring(0, 1) + "." + this.midname.substring(0, 1) + ".";
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getMidlename(){return this.midname;}

    public String getFamilyName() {
        return this.familyName;
    }
}
