package com.ml.diamond.controller;

import com.ml.diamond.entity.Projects;
import com.ml.diamond.service.ProjectsService;
import com.ml.diamond.utils.DataGrid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/projects")
@Slf4j
public class ProjectsController {

    @Autowired
    ProjectsService service;

    @GetMapping(value = "/getPage", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public DataGrid<Projects> getPage(Projects projects){
        return service.getPage(projects);
    }

}
