package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.launchcode.techjobs_oo.Job;

import static org.junit.Assert.*;

public class JobTest {
//    private Job myJob1;
//    private Job myJob2;
//  @Before
//  public void createJob(){
//    Job myJob1 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//    Job myJob2 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//  }

  @Test
  public void testSettingJobId(){
    Job myJob1 = new Job();
    Job myJob2 = new Job();
    assertFalse(myJob1.equals(myJob2));
  }
  @Test
  public void testJobConstructorSetsAllFields(){
    Job myJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//    System.out.println(myJob3.getEmployer().getClass());
    assertEquals(true, myJob3 instanceof Job);
    assertTrue(myJob3.getName() instanceof String);
    assertEquals("Product tester", myJob3.getName());
    assertTrue(myJob3.getEmployer() instanceof Employer);
    assertEquals("ACME", myJob3.getEmployer().toString());
    assertTrue(myJob3.getLocation() instanceof Location);
    assertEquals("Desert", myJob3.getLocation().toString());
    assertTrue(myJob3.getPositionType() instanceof PositionType);
    assertEquals("Quality control", myJob3.getPositionType().toString());
    assertTrue(myJob3.getCoreCompetency() instanceof CoreCompetency);
    assertEquals("Persistence", myJob3.getCoreCompetency().toString());

  }
  @Test
  public void testJobsForEquality(){
    Job myJob4 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job myJob5 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(myJob4.equals(myJob5));
  }

}
