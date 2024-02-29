package org.example.models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class FileInfo {

    private SimpleIntegerProperty index = new SimpleIntegerProperty();
    private SimpleStringProperty name = new SimpleStringProperty();
    private SimpleStringProperty url = new SimpleStringProperty();
    private SimpleStringProperty status = new SimpleStringProperty(); // "Downloading", "Completed", "Starting"
    private SimpleStringProperty Action = new SimpleStringProperty();
    private SimpleStringProperty path = new SimpleStringProperty();

    public FileInfo(int index, String name, String url, String status, String Action, String path) {
        this.index.set(index);
        this.name.set(name);
        this.url.set(url);
        this.status.set(status);
        this.Action.set(Action);
        this.path.set(path);
    }

    public int getIndex() {
        return index.get();
    }

    public SimpleIntegerProperty indexProperty() {
        return index;
    }

    public void setIndex(int index) {
        this.index.set(index);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getUrl() {
        return url.get();
    }

    public SimpleStringProperty urlProperty() {
        return url;
    }

    public void setUrl(String url) {
        this.url.set(url);
    }

    public String getStatus() {
        return status.get();
    }

    public SimpleStringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    public String getAction() {
        return Action.get();
    }

    public SimpleStringProperty actionProperty() {
        return Action;
    }

    public void setAction(String action) {
        this.Action.set(action);
    }

    public String getPath() {
        return Action.get();
    }

    public SimpleStringProperty PathProperty() {
        return Action;
    }

    public void setPath(String path) {
        this.Action.set(path);
    }

    @Override
    public String toString() {
        return "FileInfo{" +
                "index=" + index +
                ", name=" + name +
                ", url=" + url +
                ", status=" + status +
                ", Action=" + Action +
                ", path=" + path +
                '}';
    }
}
