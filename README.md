# KotlinLintIssue
Kotlin Lint Issue

**Studio Build:**

Version of Gradle Plugin: com.android.tools.build:gradle:3.6.2
Version of Gradle: gradle-5.6.4
Version of Java: jdk1.8.0_121.jdk
Version of Kotlin: 1.3.72
OS: MacOs

Steps to Reproduce:

- Check out this project: https://github.com/saurabhkpatel/KotlinLintIssue.git
- Run this command: ./gradlew clean && ./gradlew :app:lint
- You will see this error: "Error: Call requires API level 26 (current min is 21): getApplicationBytesFromOreo [NewApi]" at line number 32.

Expected result: It shouldn't give any lint error. Actual result: It gives a lint error for kotlin source code only, java source code flow works correctly.

Note: It only throws an error when the Kotlin code is in a different lib module.

https://issuetracker.google.com/issues/154316752
