package org.launchcode.techjobs_oo;

import java.util.Objects;

import static org.junit.Assert.assertEquals;

public class CoreCompetency {
    private int id;
    private static int nextId = 1;
    private String value;

    public CoreCompetency() {
        this.id = nextId;
        nextId++;
    }

        public CoreCompetency(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
//        System.out.println("Core Competency: " +value+"\n");
 //       System.out.println(this.value);
//
//        if (value==null) {
//            System.out.printf( value);
//            //this.value = "Data not available";
//        }
        return "Core Competency: " +value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.


    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
