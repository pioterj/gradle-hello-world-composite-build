package com.example.buildsrc;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class HelloPlugin implements Plugin<Project> {

    public void apply(Project project) {
        project.getTasks().register("greet", HelloTask.class);
    }
}
