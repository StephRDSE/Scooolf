package app.perso.stephrdse.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.perso.stephrdse.model.entities.CoursePar;
import app.perso.stephrdse.model.repositories.CourseParRepository;

@Service
public class CourseParServiceImpl implements CourseParService{

	@Autowired
    private CourseParRepository courseParRepository;

	
	public void save(CoursePar coursePar) {
		courseParRepository.save(coursePar);
		
	}

}
