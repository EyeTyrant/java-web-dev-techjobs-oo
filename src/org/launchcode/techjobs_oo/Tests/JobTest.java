package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.launchcode.techjobs_oo.Job;

import static org.junit.Assert.*;

public class JobTest {
    Job myJob1;
    Job myJob2;
  @Before
  public void createJob(){
    myJob1 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    myJob2 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
  }
  @Test
  public void testSettingJobId(){
    myJob1 = new Job();
    myJob2 = new Job();
    assertFalse(myJob1.equals(myJob2));
  }
  @Test
  public void testJobConstructorSetsAllFields(){
//    Job myJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//    System.out.println(myJob3.getEmployer().getClass());
    assertEquals(true, myJob1 instanceof Job);
    assertTrue(myJob1.getName() instanceof String);
    assertEquals("Product tester", myJob1.getName());
    assertTrue(myJob1.getEmployer() instanceof Employer);
    assertEquals("ACME", myJob1.getEmployer().toString());
    assertTrue(myJob1.getLocation() instanceof Location);
    assertEquals("Desert", myJob1.getLocation().toString());
    assertTrue(myJob1.getPositionType() instanceof PositionType);
    assertEquals("Quality control", myJob1.getPositionType().toString());
    assertTrue(myJob1.getCoreCompetency() instanceof CoreCompetency);
    assertEquals("Persistence", myJob1.getCoreCompetency().toString());
  }
  @Test
  public void testJobsForEquality(){
//    Job myJob1 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//    Job myJob2 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(myJob1.equals(myJob2));
  }
  @Test
  public void testEmptyField(){
    Job myJob6 =  new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals("Data not available", myJob6.getEmployer().toString());
  }
//  @Test
//  public void testIdAndAllEmptyFields(){
//    Job myJob7 =  new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
//    assertEquals("OOPS! This job does not seem to exist.", myJob7);
//  }
  @Test
  public void toStringTest(){
//    Job myJob7 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//    System.out.println(myJob1);
    assertEquals("\n" + "ID: " + "1" + "\n" +
        "Name: " + "Product tester" + "\n" +
        "Employer: " + "ACME" + "\n" +
        "Location: " + "Desert" + "\n" +
        "Position Type: " + "Quality control" + "\n" +
        "Core Competency: " + "Persistence" + "\n", myJob1.toString());
  }

}
