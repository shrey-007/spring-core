package org.example.multipleClassDependencies;

public class State {
    String name;
    String sid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public State() {

    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", sid='" + sid + '\'' +
                '}';
    }
}
