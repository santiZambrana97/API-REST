package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entities.FotballClub;
import com.example.Repositories.BaseRepository;
import com.example.Repositories.LigaRepository;

@Service
public class FootballClubServiceImpl  extends BaseServiceImpl<FotballClub, Long> implements FootballClubService {

	@Autowired
	private LigaRepository ligaRepository;
	
	public FootballClubServiceImpl(BaseRepository <FotballClub,Long> baseRepository) {
		super(baseRepository);
	}

}
