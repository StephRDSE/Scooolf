package app.perso.stephrdse.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.perso.stephrdse.model.entities.CourseR;
import app.perso.stephrdse.model.repositories.CourseRRepository;

@Service
public class CourseRServiceImpl implements CourseRService{

	@Autowired
	private CourseRRepository courseRRepository;
	
	public void save(CourseR courseR) {

		courseRRepository.save(courseR);
	}

}
