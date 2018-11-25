package app.perso.stephrdse.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.perso.stephrdse.model.entities.CourseW;
import app.perso.stephrdse.model.repositories.CourseWRepository;

@Service
public class CourseWServiceImpl implements CourseWService{

	@Autowired
	private CourseWRepository courseWRepository;
	
	public void save(CourseW courseW) {
		courseWRepository.save(courseW);
		
		
	}

}
