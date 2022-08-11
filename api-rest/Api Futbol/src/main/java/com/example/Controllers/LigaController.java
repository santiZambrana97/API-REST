package com.example.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.Entities.Liga;
import com.example.Services.LigaServiceImpl;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/ligas")
public class LigaController extends BaseControllerImpl<Liga, LigaServiceImpl> {

}
