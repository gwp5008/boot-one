package com.boot.one.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boot.one.model.Subject;
import com.boot.one.repository.SubjectRepository;

@Service
@Transactional
public class SubjectDAO {

	@Autowired
	SubjectRepository subjectRepository;
	
	public Subject save(Subject subject) {
		return subjectRepository.save(subject);
	}
	public Subject find(Long id) {
		return subjectRepository.findOne(id);
	}
	public void delete(Long id) {
		subjectRepository.deleteSubject(0, id);
	}
	public Subject checkMatchingSubject(String subjectName) {
		return subjectRepository.checkMatchingSubject(subjectName);
	}
}
