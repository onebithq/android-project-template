# Android Project Template

![Travis CI build status](https://img.shields.io/travis/onebithq/android-project-template/master.svg?label=master)
![Travis CI build status](https://img.shields.io/travis/onebithq/android-project-template/skeleton.svg?label=skeleton)

Android Project Template used in [Onebit](http://onebitmedia.com). There are two templates in this repository. One in `master` branch is the **full-featured and use opinionated stacks**, while the `skeleton` branch contains a **vanilla template** that allow more freedom and can be easily used in any projects.

## Goals

As a service company, bootstrapping Android project code is a tedious and repetitive task when kickstarting a new project. We create this template to speed up bootstrapping while maintaining extensibility to use in any projects with any number of team members. 

These are the configuration that we try to simplify:

* Code style enforcement
* Code quality checking (checkstyle, PMD, lint)
* Version numbering
* Integration with CI environment (Jenkins, Travis, etc) **(WIP)**
* Signed APK build **(WIP)**
* Google Play publishing **(WIP)** 
* Git workflow helpers **(WIP)**

## Included stuffs

### EditorConfig

No more tab vs space debate, it's enforced by configuration. The configuration is stored in `.editorconfig` on the project root. Newest Android Studio already have native support for EditorConfig. 

### Logging

Use `Timber.d(message)` instead of `Log.d(TAG, message)`. It's automatically tagged and has similar style with `String.format()`

### Report the number of method references in your APK on every build.

Why: Android apps have 65536 methods hard limit. 

Provided by [Dex count plugin](https://android-arsenal.com/details/1/1940). 

### Code quality checking

CheckStyle and PMD included.

To do all checks, run:

```
./gradlew check
```

To customize the rules, edit the following files:

* `/config/checkstyle.xml`
* `/config/pmd`

## Libraries

* Butterknife
* OkHttp
* Picasso
* LeakCanary
