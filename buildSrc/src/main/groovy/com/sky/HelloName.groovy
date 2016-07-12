package com.sky
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

public class HelloName extends DefaultTask {
    String firstName

    @TaskAction
    void doAction() {
        println "Hello world $firstName"
        ant.echo('Hello --->')
    }

    public void setName(String name) {
        this.firstName = name
    }
}