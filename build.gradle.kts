// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.ClassPath.gradle)
        classpath(Dependencies.ClassPath.kotlinGradle)
        classpath(Dependencies.ClassPath.navArgs)
        classpath(Dependencies.ClassPath.hiltAndroid)
        classpath("com.android.tools.build:gradle")
        classpath("com.android.tools.build:gradle:7.0.2")
//        classpath(Dependencies.ClassPath.googleGms)
//        classpath(Dependencies.ClassPath.firebaseCrashlytics)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()

        mavenCentral()
        maven { url = uri(Repositories.jitpackUrl) }
//        jcenter()
    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}