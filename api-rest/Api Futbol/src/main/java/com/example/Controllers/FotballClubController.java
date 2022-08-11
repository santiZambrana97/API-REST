package com.example.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entities.FotballClub;
import com.example.Services.FootballClubServiceImpl;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/clubes")
public class FotballClubController extends BaseControllerImpl<FotballClub, FootballClubServiceImpl> {

}
