object Versions {
    val kotlinStdlib = "1.3.61"
    val kotlinCoroutines = "1.2.1"
    val tornadofx = "1.7.16"
    val kfoenix = "0.1.3"
    val ktor = "1.2.2"
    val klock = "1.0.0"
    val kotlinSerializationRuntime = "0.14.0"
    val kotlinSerializationYamlSupport = "0.15.0"
    val regexDsl = "v0.1"
    val clikt = "2.1.0"
    val kotlinArgparser = "2.0.7"

    val gson = "2.2.2"
    val jsoup = "1.8.1"
}

object Deps {

    val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinStdlib}"
    val kotlinCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
    val klock = "com.soywiz:klock-jvm:${Versions.klock}"
    val kotlinSerializationRuntime = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.kotlinSerializationRuntime}"
    val kotlinSerializationYamlSupport = "com.charleskorn.kaml:kaml:${Versions.kotlinSerializationYamlSupport}"
    val regexDsl = "com.github.h0tk3y:regex-dsl:${Versions.regexDsl}"
    val kotlinStdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinStdlib}"
    val tornadofx = "no.tornado:tornadofx:${Versions.tornadofx}"
    val kfoenix = "com.github.bkenn:kfoenix:${Versions.kfoenix}"
    val ktorServer = "io.ktor:ktor-server-core:${Versions.ktor}"
    val ktorServerWebSocket = "io.ktor:ktor-websockets:${Versions.ktor}"
    val ktorServerNetty = "io.ktor:ktor-server-netty:${Versions.ktor}"
    val ktorHTMLBuilder = "io.ktor:ktor-html-builder:${Versions.ktor}"
    val ktorClient = "io.ktor:ktor-client-core:${Versions.ktor}"
    val ktorClientJetty = "io.ktor:ktor-client-jetty:${Versions.ktor}"
    val ktorClientCio = "io.ktor:ktor-client-cio:${Versions.ktor}"
    val clikt = "com.github.ajalt:clikt:${Versions.clikt}"
    val kotlinArgparser = "com.xenomachina:kotlin-argparser:${Versions.kotlinArgparser}"

    val gson = "com.google.code.gson:gson:${Versions.gson}"
    val jsoup = "org.jsoup:jsoup:${Versions.jsoup}"
    val primefaces = "org.primefaces:primefaces:6.0"
    val cdiApi = "javax.enterprise:cdi-api:1.2"
    val faces = "org.glassfish:javax.faces:2.2.13"
    val primefacesAllTheme = "org.primefaces.themes:all-themes:1.0.10"
    val javaXServletjstl = "javax.servlet:jstl:1.2"
    val taglibs = "taglibs:standard:1.1.2"
    val javaeeWebApi = "javax:javaee-web-api:7.0"
    val jstl = "jstl:jstl:1.2"
    val apacheCommonsIO = "org.apache.commons:commons-io:1.3.2"
    val apacheHttpClient = "org.apache.httpcomponents:httpclient:4.3.5"
    val jsonSimple = "com.googlecode.json-simple:json-simple:1.1.1"
    val jacksonMapper = "org.codehaus.jackson:jackson-mapper-asl:1.9.13"
}
