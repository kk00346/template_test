package com.github.kk00346.templatetest.services

import com.intellij.openapi.project.Project
import com.github.kk00346.templatetest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
