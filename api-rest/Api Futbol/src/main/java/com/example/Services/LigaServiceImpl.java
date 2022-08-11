package com.example.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Entities.Liga;
import com.example.Repositories.BaseRepository;
import com.example.Repositories.LigaRepository;

@Service
public class LigaServiceImpl extends BaseServiceImpl<Liga, Long> implements LigaService {

	@Autowired
	private LigaRepository ligaRepository;
	
	public LigaServiceImpl(BaseRepository<Liga,Long> baseRepository) {
		super(baseRepository);
		
	}

}
