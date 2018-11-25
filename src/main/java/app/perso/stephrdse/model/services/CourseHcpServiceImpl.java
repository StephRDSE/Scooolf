package app.perso.stephrdse.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import app.perso.stephrdse.model.entities.CourseHcp;
import app.perso.stephrdse.model.repositories.CourseHcpRepository;

public class CourseHcpServiceImpl implements CourseHcpService{
	
	@Autowired
	private CourseHcpRepository courseHcpRepository;

	public void save(CourseHcp courseHcp) {
		courseHcpRepository.save(courseHcp) ;
		
	}

}
