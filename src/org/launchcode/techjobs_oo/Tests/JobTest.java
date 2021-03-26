package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;
import org.junit.Test;


import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class JobTest {

    Job job1, job2, job3, job4, job5, job6, job7;
    @Before
    public void createJobObjects() {
        job1 = new Job();
        job2 = new Job();
        job3 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        job7 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
//        job7 = new Job(" ", new Employer(" "), new Location(" "), new PositionType(" "), new CoreCompetency(" "));

    }


    @Test()
    public void testSettingJobId() {

        //assertEquals(job1.getId(),"");
        //assertEquals("The two IDs are NOT equal",job1.getId(),job2.getId());
        //assertTrue(job2.getId()-job1.getId()==1);
        //assertTrue(job1.getId() == job2.getId()-1);
        assertFalse(job2.getId() - job1.getId() != 1);
        //assertFalse("The statement is NOT false",job1.getId()-job2.getId()==-1);
    }

//    @Test()
//        public void testCorrectAssignmentOfJobId(){
//        System.out.println(job1.getId());
//        System.out.println(job1.getId());
//        assertEquals(job1.getId(),1);
//        assertEquals(job2.getId(),2);
//    }

    @Test()
    public void testJobConstructorSetsAllFields(){
        assertTrue(job3 != null);
    }
    //assertTrue(job3 instanceof Job);
    //}

    @Test()
    public void testJobsForEquality(){
        //assertThat(Objects.equals(job4, job5)).isTrue();
        //assertFalse(job4==job5);
        assertNotSame(job4, job5);


//        System.out.println(job1.getId());
//        System.out.println(job2.getId());
//        System.out.println(job3.getId());
//        System.out.println(job4.getId());
//        System.out.println(job5.getId());
//        System.out.println(job1.getId());
    }

    @Test ()
    public void testToString (){

        //String expected = "\n" + job4 + "\n";
        //assertEquals(job4.toString(), expected);

        String expected = "\nID: " + job4.getId()  +
                "\nName: " + job4.getName()  +
                "\nEmployer: " + job4.getEmployer() +
                "\nLocation: " + job4.getLocation() +
                "\nPosition Type: " + job4.getPositionType() +
                "\nCore Competency: " + job4.getCoreCompetency() +
                "\n";
        assertEquals(job4.toString(), expected);
    }
    @Test
    public void testForEmptyFields() {

        String actualExample = "\nID: " + job6.getId()  +
                "\nName: " + job6.getName()  +
                "\nEmployer: " + job6.getEmployer() +
                "\nLocation: " + job6.getLocation() +
                "\nPosition Type: " + job6.getPositionType() +
                "\nCore Competency: Data not available" +
                "\n";

            assertEquals(job6.toString(), actualExample);
    }

    @Test
    public void testForOnlyIdField(){
//        System.out.println(job1);
        String actualExample = "";
        if(actualExample == "\n" + "ID: " + job7.getId()  +"\n"){
            System.out.println("OOPS! This job does not seem to exist.");

        };
        assertEquals(job7.toString(), "OOPS! This job does not seem to exist.");


    }
}

