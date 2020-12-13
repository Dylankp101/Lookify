package com.codingdojo.lookify.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codingdojo.lookify.models.Lookify;
import com.codingdojo.lookify.repository.LookifyRepository;
import com.codingdojo.lookify.service.LookifyService;


@Service
public class LookifyService {

	@Autowired
	private LookifyRepository lookifyRepository;
    public List<Lookify> all() {
        return lookifyRepository.findAll();
    }
	public List<Lookify> findAllByRating() {
		// TODO Auto-generated method stub
		return lookifyRepository.findAllByOrderByRatingDesc();
	}
//    public List<Lookify> allByRating() {
//        return lookifyRepository.orderByRating();
//    }
    // creates
    public Lookify create(Lookify lookify) {
        return lookifyRepository.save(lookify);
    }
    // deletes
    public Lookify delete(Long id) {
        lookifyRepository.deleteById(id);
		return null;
    }
    // retrieves
    public Lookify find(Long id) {
        Optional<Lookify> optionalLookify = lookifyRepository.findById(id);
        if(optionalLookify.isPresent()) {
            return optionalLookify.get();
        } else {
            return null;
        }
    }


}
