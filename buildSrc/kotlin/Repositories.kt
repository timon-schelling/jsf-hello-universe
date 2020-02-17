import org.gradle.api.Project
import org.gradle.kotlin.dsl.maven
import org.gradle.kotlin.dsl.repositories

fun Project.configureRepositories() {
    repositories {
        jcenter()
        mavenCentral()
        maven("https://kotlin.bintray.com/kotlinx")
        maven("https://dl.bintray.com/soywiz/soywiz")
        maven("https://mvnrepository.com/")
        maven("https://jitpack.io")
        maven("http://download.java.net/maven/2/")
        maven("http://repository.primefaces.org/")
    }
}