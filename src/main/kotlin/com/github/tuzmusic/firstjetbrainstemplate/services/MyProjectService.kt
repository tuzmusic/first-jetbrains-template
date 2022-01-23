package com.github.tuzmusic.firstjetbrainstemplate.services

import com.intellij.openapi.project.Project
import com.github.tuzmusic.firstjetbrainstemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
