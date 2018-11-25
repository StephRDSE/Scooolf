package app.perso.stephrdse.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.perso.stephrdse.model.entities.CourseY;
import app.perso.stephrdse.model.repositories.CourseYRepository;

@Service
public class CourseYServiceImpl implements CourseYService{

	@Autowired
	private CourseYRepository courseYRepository;
	
	public void save(CourseY courseY) {
		courseYRepository.save(courseY);		
	}

}
