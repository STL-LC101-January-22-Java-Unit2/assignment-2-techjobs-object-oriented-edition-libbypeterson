package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
@Test
    public void testSettingJobId() {
    Job job1 = new Job();
    Job job2 = new Job();
    assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertTrue(job1.getName() instanceof String);
    assertTrue(job1.getEmployer() instanceof Employer);
    assertTrue(job1.getLocation() instanceof Location);
    assertTrue(job1.getPositionType() instanceof PositionType);
    assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);

    assertEquals("Product tester", job1.getName());
    assertEquals("ACME", job1.getEmployer().getValue());
    assertEquals("Desert", job1.getLocation().getValue());
    assertEquals("Quality control", job1.getPositionType().getValue());
    assertEquals("Persistence", job1.getCoreCompetency().getValue());
    }

}
