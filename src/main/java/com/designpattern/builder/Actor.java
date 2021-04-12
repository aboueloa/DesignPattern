package com.designpattern.builder;

public class Actor {
    private final String name;
    private Role role;
    private int salary;

    public Actor(Builder builder){
        name = builder.name;
        role = builder.role;
        salary = builder.salary;
    }
    public static class Builder{
        private String name;
        private int salary;
        private Role role;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder salary(int salary){
            this.salary = salary;
            return this;
        }

        public Builder role(Role role){
            this.role = role;
            return this;
        }

        public Actor build(){
            return new Actor(this);
        }

    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name=" + name +
                ", role=" + role +
                ", salary=" + salary +
                '}';
    }
}
