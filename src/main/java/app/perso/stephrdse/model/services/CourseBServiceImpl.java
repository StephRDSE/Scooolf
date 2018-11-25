package app.perso.stephrdse.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.perso.stephrdse.model.entities.CourseB;
import app.perso.stephrdse.model.repositories.CourseBRepository;

@Service
public class CourseBServiceImpl implements CourseBService{

	@Autowired
	private CourseBRepository courseBRepository;
	
	public void save(CourseB courseB) {
		courseBRepository.save(courseB);
		
	}

	
}
