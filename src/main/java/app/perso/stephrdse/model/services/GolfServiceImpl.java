package app.perso.stephrdse.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.perso.stephrdse.model.entities.Golf;
import app.perso.stephrdse.model.repositories.GolfRepository;

@Service
public class GolfServiceImpl implements GolfService{
	
	@Autowired
    private GolfRepository golfRepository;
	
	public void save(Golf newGolf) {
		golfRepository.save(newGolf);
	}

}
