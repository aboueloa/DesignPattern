package com.designpattern.builder;

public class Role {
    private String role;
    private Script script;

    public Role(Builder builder){
        role = builder.role;
        script = builder.script;
    }
    public static class Builder{
        private String role;
        private Script script;

        public Builder role(String role){
            this.role = role;
            return this;
        }
        public Builder script(Script script){
            this.script = script;
            return this;
        }
        public Role build(){
            return new Role(this);
        }

    }

    public String getRole() {
        return role;
    }

    public Script getScript() {
        return script;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role=" + role +
                ", script=" + script +
                '}';
    }
}
