import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

version = "0.0.1"

val versionName = "Montreee Sputnik 1"

plugins {
    idea
    kotlin("jvm") version Versions.kotlinStdlib
    id("kotlinx-serialization") version Versions.kotlinStdlib
    war
}

allprojects {

    val project = this

    version = rootProject.version

    apply {
        plugin("org.jetbrains.kotlin.jvm")
        plugin("kotlinx-serialization")
    }

    configureRepositories()

    sourceSets.forEach {
        when (it.name) {
            "main" -> {
                it.resources.srcDirs("resources")
            }
            "test" -> {
                it.resources.srcDirs("testResources")
            }
        }
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }

    kotlin {
        sourceSets.forEach {
            when (it.name) {
                "main" -> {
                    it.kotlin.srcDirs("kotlin")
                }
                "test" -> {
                    it.kotlin.srcDirs("test")
                }
            }
        }
    }

    dependencies {
        compile(Deps.kotlinStdlib)
        compile(Deps.kotlinStdlibJdk8)
        compile(Deps.gson)
        compile(Deps.jsoup)
        compile(Deps.primefaces)
        compile(Deps.cdiApi)
        compile(Deps.faces)
        compile(Deps.primefacesAllTheme)
        compile(Deps.javaXServletjstl)
        compile(Deps.taglibs)
        compile(Deps.javaeeWebApi)
        compile(Deps.jstl)
        compile(Deps.apacheCommonsIO)
        compile(Deps.apacheHttpClient)
        compile(Deps.jsonSimple)
        compile(Deps.jacksonMapper)
        compile(Deps.kotlinCoroutines)
        compile(Deps.kotlinSerializationRuntime)
        subprojects.forEach {
            project(it.path)
            add("compile", project(it.path))
            add("archives", project(it.path))
        }

        compile("io.kotlintest:kotlintest-runner-junit5:3.3.2")
    }

    tasks.test {
        useJUnitPlatform()
        testLogging {
            events("passed", "skipped", "failed")
        }
    }

    val compileKotlin: KotlinCompile by tasks
    compileKotlin.apply {

    }

    val jar: Jar by tasks
    jar.apply {
        val jarName = "${rootProject.name}${project.path.replace(":", "-")}-${project.version}.jar"
        archiveFileName.set(jarName)
    }
}

val jar: Jar by tasks
jar.apply {
    archiveFileName.set("${rootProject.name}-${rootProject.version}.jar")
}

val war: War by tasks
war.apply {
    from("webapp")
}
