# TestJitPack

Project for testing library publication on [JitPack](https://jitpack.io/)

[![JitPack](https://jitpack.io/v/gmk57/TestJitPack.svg)](https://jitpack.io/#gmk57/TestJitPack)

**Lessons learned:**
* Abandoned [Gradle Android Maven plugin](https://github.com/dcendents/android-maven-gradle-plugin)
by Daniel Beland seems to work fine, despite the lack of official support for Gradle 5+. See 
[`decendents` branch](https://github.com/gmk57/TestJitPack/tree/dcendents).
* If no publishing plugin is configured in the project, JitPack engine prints a warning and uses
some default plugin. Judging by the tasks list, it may be the same Gradle Android Maven plugin. 
JitPack even generates `sources.jar` automatically. See [`master` branch](https://github.com/gmk57/TestJitPack).
* Official [Maven Publish plugin](https://developer.android.com/studio/build/maven-publish-plugin)
works too, but for some reason it executes 4x more tasks and takes 3x more time. Final result seems 
to be more or less the same. See [`maven_publish` branch](https://github.com/gmk57/TestJitPack/tree/maven_publish).
