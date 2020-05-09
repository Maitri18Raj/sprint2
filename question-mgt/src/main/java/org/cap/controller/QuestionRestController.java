package org.cap.controller;

import java.math.BigInteger;

import javax.validation.Valid;

import org.cap.dto.QuestionDto;

import org.cap.entities.Questions;
import org.cap.service.IQuestionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionRestController {
	
	private IQuestionService service;
	
	 @PostMapping("/add")
	    public ResponseEntity<Questions>createTest(@RequestBody @Valid QuestionDto QuestionDto){
	       Questions question = convert(QuestionDto);
	       BigInteger id = test.getTestId();
	       question=service.addQuestion(testId,question);
	        ResponseEntity<Questions>response=new ResponseEntity<>(question, HttpStatus.OK);
	        return response;
	   }
	 
	 @GetMapping("/remove")
		public ResponseEntity<Questions> deleteTest(@RequestBody @Valid QuestionDto QuestionDto) {	
		 Questions question = convert(QuestionDto);
		 BigInteger id = test.getTestId();	
		 test = service.deleteQuestion(id);
		 ResponseEntity<Questions>response=new ResponseEntity<>(question, HttpStatus.OK);
			return response;
	 

	
	public Questions  convert(QuestionDto dto) {
		Questions question = new Questions();
		question.setQuestionId(dto.getQuestionId());
		question.setQuestionTitle(dto.getQuestionTitle());
		question.setQuestionAnswer(dto.getQuestionAnswer());
		question.setQuestionMarks(dto.getQuestionMarks());
		question.setChosenAnswer(dto.getChosenAnswer());
		question.setMarksScored(dto.getMarksScored());
		return question;
	}
}