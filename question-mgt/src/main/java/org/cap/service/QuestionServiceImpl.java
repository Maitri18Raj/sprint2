package org.cap.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

import org.cap.dao.IQuestionDao;
import org.cap.entities.Questions;
import org.cap.testmgt.exceptions.TestNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

public class QuestionServiceImpl implements IQuestionService {
	
	private IQuestionDao questionDao;
	
	public IQuestionDao getQuestionDao() {
		return questionDao;
	}
	
	@Autowired
	public void setQuestionDao(IQuestionDao questionDao) {
		this.questionDao = questionDao;
	}
	
	@Override
	public Questions addQuestions(BigInteger testId, Questions question) {
		question = questionDao.save(question);
		return null;
	}

	@Override
	public Questions updateQuestions(BigInteger testId, Questions question) {
		Questions question1 = findById(testId);
		question1 = questionDao.save(question);
		return question1;
	}

	@Override
	public Questions deleteQuestions(BigInteger testId, Questions question) {
		Questions question1 = findById(testId);
		questionDao.delete(question);
		return question1;
	}

	@Override
	public BigDecimal calculateTotalMarks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Questions findById(BigInteger testId) {
		Optional<Questions> optional = questionDao.findById(testId);
		if (optional.isPresent()) {
			Questions question = optional.get();
			return question;
		}
		throw new TestNotFoundException("Test not found for id=" + testId);
	}

}
