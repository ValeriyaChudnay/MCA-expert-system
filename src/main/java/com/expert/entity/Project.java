package com.expert.entity;

import java.util.List;

public class Project {
    private int id;
    private String name;
    private List<Expert> experts;
    private Expert adminExpert;
    private List<Method> methods;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Expert> getExperts() {
        return experts;
    }

    public void setExperts(List<Expert> experts) {
        this.experts = experts;
    }

    public Expert getAdminExpert() {
        return adminExpert;
    }

    public void setAdminExpert(Expert adminExpert) {
        this.adminExpert = adminExpert;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }
}
