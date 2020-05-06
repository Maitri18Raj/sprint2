package org.cap.dao;

import java.math.BigInteger;

import org.cap.entities.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionDao extends JpaRepository<Questions,BigInteger>{

}
