/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

import java.util.Arrays;

public abstract class Bag {

    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.numberOfContents = 0;
        this.contents = new String[this.capacity];
    }

    public String getColor(){
        return this.color;
    }
    public int getNumberOfContents(){
        return this.numberOfContents;
    }
    public int getCapacity(){
        return this.capacity;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public boolean addItem(String item){
        if (this.numberOfContents < this.capacity) {
            this.contents[numberOfContents++] = item;
            return true;
        } else {
            return false;
        }
    }


    /**
     * If there are no items in this Bag, return null.
     *
     * @return
     */

    public String popItem() {
        if (this.getNumberOfContents() == 0) {
            return null;
        } else {
            this.numberOfContents = this.getNumberOfContents() - 1;
            return contents[contents.length-1];
        }
    }

    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n){
        this.capacity += n;
    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}