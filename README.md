# Android Project Template

Onebit Android Project Template

## Included Stuffs

### EditorConfig

No more tab vs space debate, it's enforced by configuration. The configuration is stored in `.editorconfig` on the project root. Newest Android Studio already have native support for EditorConfig. 

### App icon with flavor and version info

Only enabled on debug builds. This feature is provided by [Icon Version plugin](https://github.com/akonior/icon-version).

### Report the number of method references in your APK on every build.

Provided by [Dex count plugin](https://android-arsenal.com/details/1/1940). 

### Code quality checking

CheckStyle and PMD included.

To do all checks, run:

```
./gradlew check
```

