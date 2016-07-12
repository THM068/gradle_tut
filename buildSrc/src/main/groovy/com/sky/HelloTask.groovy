package com.sky
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
/**
 * Created by tm1c14 on 12/07/2016.
 */
class HelloTask extends DefaultTask {

    @TaskAction
    void doAction() {
        println "Executing my custom task."
    }
}
