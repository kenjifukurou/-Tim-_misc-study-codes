package com.marsaint.arshiva;

public class StudentEquals {

    private int id;
    private String name;

    public StudentEquals(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        if (obj == null) {
            System.out.println("obj is null");
            return false;
        }
        if (!(obj instanceof StudentEquals)) {
            System.out.println("obj is not instanceof StudentEquals");
            return false;
        }
        if (obj == this) {
            System.out.println("obj is StudentEquals");
            return true;
        }
//        boolean b = this.getId() == ((StudentEquals) obj).getId();
        if (this.getId() == ((StudentEquals) obj).getId()) {
            System.out.println("id is same");
            return true;
        }
        System.out.println("nothing else match");
        return false;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.id + ": " + this.name;
    }
}
