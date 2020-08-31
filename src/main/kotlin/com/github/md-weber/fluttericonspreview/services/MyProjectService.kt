package com.github.md-weber.fluttericonspreview.services

import com.intellij.openapi.project.Project
import com.github.md-weber.fluttericonspreview.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
