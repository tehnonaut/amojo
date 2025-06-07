# amojo

Amojo is an open source collection of games built entirely with emojis. When
you open the application you'll be greeted with a list of puzzle‑style games
that run on a grid and use emojis as the primary building blocks. Everyone is
welcome to contribute new ideas or improvements!

## Building

Run the following command to build and test the project (Gradle is preinstalled in this environment):

```bash
gradle build
```

## Running

Execute the application with:

```bash
gradle run
```

## Automated Releases

When code is pushed to the `main` branch, a GitHub Actions workflow builds the release APK using the Android SDK and publishes it as a prerelease. The latest APK can be downloaded from the Releases page.
