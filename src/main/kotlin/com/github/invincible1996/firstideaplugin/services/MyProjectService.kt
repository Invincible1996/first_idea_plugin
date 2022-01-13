package com.github.invincible1996.firstideaplugin.services

import com.intellij.openapi.project.Project
import com.github.invincible1996.firstideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
