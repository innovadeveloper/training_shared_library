package com.app

import com.fasterxml.jackson.databind.ObjectMapper
import com.models.JenkinsProperty
import com.models.Project
import com.models.ProjectInfo

//@Grab('com.fasterxml.jackson.core:jackson-databind:2.12.5')
//@Grab('com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.12.5')

class AppGroovy {
    static void main(String[] args) {
        JenkinsProperty jenkinsProperty = new JenkinsProperty()
        jenkinsProperty.project = new Project()
        jenkinsProperty.project.project_info = new ProjectInfo()
        jenkinsProperty.project.project_info.app_name = "hola mundo"
        def objectMapper = new ObjectMapper()
        def json = objectMapper.writeValueAsString(jenkinsProperty)

        println(jenkinsProperty.project.project_info.app_name)
    }

    static String saludo(String name){
        return 'hola mundo ' + name
    }
}
