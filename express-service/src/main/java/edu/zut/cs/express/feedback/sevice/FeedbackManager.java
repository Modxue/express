package edu.zut.cs.express.feedback.sevice;

import java.util.List;

import edu.zut.cs.express.feedback.domain.FeedBack;

public interface FeedbackManager {
	List<FeedBack> findByCustomer(String customerId);
}
