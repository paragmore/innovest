package com.example.service;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ChallengeDao;
import com.example.model.Challenge;

@Service
public class ChallengeServiceImpl implements ChallengeService{
	
	@Autowired
	ChallengeDao dao;

	@Override
	public void createChallenge(Challenge ch) {
		// TODO Auto-generated method stub
		dao.save(ch);
		
	}

	@Override
	public Collection<Challenge> getAllChallenges() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public void deleteChallengeById(UUID id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
		
	}

	@Override
	public void updateChallenge(Challenge ch) {
		// TODO Auto-generated method stub
		dao.save(ch);
	}

	@Override
	public Optional<Challenge> findChallengeById(UUID id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

}
