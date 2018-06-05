package edu.zut.cs.express.feedback.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.express.feedback.domain.FeedBack;
import edu.zut.cs.express.feedback.sevice.FeedbackManager;
import edu.zut.cs.express.manager.service.AdminServiceConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AdminServiceConfig.class)
public class FeedbackManagerTest {

	@Autowired
	FeedbackManager feedbackManager;
	
	@Test
	public void testFindByCustomer() {
		String customerId = "customerId_1";
        List<FeedBack> result = this.feedbackManager.findByCustomer(customerId);
        List<FeedBack> expected = new ArrayList<FeedBack>();
        for (int i = 0; i < 10; i++) {
            FeedBack feedback = new FeedBack();
            expected.add(feedback);
        }
        assertEquals(expected.size(), result.size());
	}
}