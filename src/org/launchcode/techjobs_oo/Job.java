package org.launchcode.techjobs_oo;

import org.junit.Before;

import java.util.Map;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.


    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public String toString() {

        String result = "";
        if(name.equals("") && employer.getValue().equals("") && location.getValue().equals("") && positionType.getValue().equals("") && coreCompetency.getValue().equals("")){
            return "OOPS! This job does not seem to exist.";
        }

        if(name.equals("")){
            name="Data not available";
        }
        if(employer.getValue().equals("")||employer.getValue()==null){
            employer.setValue("Data not available");
        }
        if(location.getValue().equals("")||location.getValue()==null){
            location.setValue("Data not available");
        }
        if(positionType.getValue().equals("")||positionType.getValue()==null){
            positionType.setValue("Data not available");
        }
        if(coreCompetency.getValue().equals("")||coreCompetency.getValue()==null){
            coreCompetency.setValue("Data not available");
        }

        result="\n"+"ID: "+this.id+"\n"+
                "Name: "+this.name+"\n"+
                this.employer+this.location+this.positionType+this.coreCompetency+"\n";
//        return "\n"+"ID: "+this.id+"\n"+
//                "Name: "+this.name+"\n"+
//                this.employer+this.location+this.positionType+this.coreCompetency+"\n";
        return result;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
// i added null pointer exception to each field so it identifies if any of the fields has a null value
    public void setName(String name) {
        if (name == null) {
            throw new NullPointerException("Data not available");
        }
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        if (employer == null) {
            throw new NullPointerException("Data not available");
        }
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        if (location == null) {
            throw new NullPointerException("Data not available");
        }
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        if (positionType == null) {
            throw new NullPointerException("Data not available");
        }
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        if (coreCompetency == null) {
            throw new NullPointerException("Data not available");
        }
        this.coreCompetency = coreCompetency;
    }


}

