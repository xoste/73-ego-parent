package com.xoste.leon.pojo;

/**
 * @author Leon
 */
public class Images {
    private int id;
    private String path;

    public Images() {
    }

    public Images(int id, String path) {
        this.id = id;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
