package com.marsaint.arshiva;

public abstract class ListItem {

    protected ListItem leftLink = null;
    protected ListItem rightLink = null;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem moveLeft();
    abstract ListItem setLeft(ListItem leftItem);
    abstract ListItem moveRight();
    abstract ListItem setRight(ListItem rightItem);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
