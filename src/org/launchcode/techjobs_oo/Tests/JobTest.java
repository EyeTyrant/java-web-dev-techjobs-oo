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
  public void toStringTest(){
//    Job myJob6 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//    System.out.println(myJob1);
    assertEquals("ID: " + "3" +"\n"+
        "Name: " + "Product tester" + "\n" +
        "Employer: " + "ACME" + "\n"+
        "Location: " + "Desert" + "\n"+
        "Position Type: " + "Quality control" +"\n"+
        "Core Competency: " + "Persistence", myJob1.toString());
  }

}
