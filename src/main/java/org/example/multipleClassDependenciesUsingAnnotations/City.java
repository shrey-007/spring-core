package org.example.multipleClassDependenciesUsingAnnotations;

public class City {
    String name;
    int cid;

    public City() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", cid=" + cid +
                '}';
    }
}
