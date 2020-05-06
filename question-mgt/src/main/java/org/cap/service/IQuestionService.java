package org.cap.service;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.cap.entities.Questions;

public interface IQuestionService {
	Questions addQuestions(BigInteger testId, Questions question);
	
	Questions updateQuestions(BigInteger testId, Questions question);
	
	Questions deleteQuestions(BigInteger testId, Questions question);

	BigDecimal calculateTotalMarks();
	
	Questions findById(BigInteger testId);

}
