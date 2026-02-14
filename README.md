# Android Development Projects

A collection of beginner-to-intermediate Android Studio sample apps built with Java.  
Each folder in this repository is an independent Android project that demonstrates a specific Android concept (activity lifecycle, intents, RecyclerView, fragments, vector assets, etc.).

## Projects in this repository

| Project | What it demonstrates |
|---|---|
| `Activitylifecycle` | Android activity lifecycle callbacks (`onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onRestart`, `onDestroy`) with Logcat output. |
| `MyApplication` | Basic starter app structure and layout wiring in a single activity. |
| `ExplicitIntents` | Navigating between activities using explicit intents and returning data with `startActivityForResult`. |
| `ImplicitIntents` | Launching external apps (dialer, map, browser) using implicit intents. |
| `ChallengeIntents` | A mini contact workflow: create contact-like details, return data, and trigger dial/web/map intents from result data. |
| `FalsePhone` | Receiving and displaying incoming intent data/URI payloads. |
| `TemperatureCricket` | Simple input, validation, and calculation UI (chirps-to-temperature formula). |
| `RecyclerView` | RecyclerView setup with custom adapter, list model, click handling, and dynamic item insertion. |
| `RecyclerViewandFragement` | Combined RecyclerView + Fragment-based UI with shared app data and item detail display. |
| `VectorAssets` | Working with `ImageView` drawables and switching vector/image resources at runtime. |

## Prerequisites

- Android Studio (recommended latest stable version)
- Android SDK + platform tools installed
- JDK 8+ (normally bundled with modern Android Studio)
- Emulator or physical Android device

## How to run any project

Because this repo is a **multi-project collection** (not one single Gradle root), open and run one folder at a time.

1. Open Android Studio.
2. Select **Open**.
3. Choose one project folder (for example: `ImplicitIntents/` or `RecyclerView/`).
4. Wait for Gradle sync to complete.
5. Run on an emulator/device.

## Build from terminal (optional)

From inside a specific project folder:

```bash
./gradlew assembleDebug
```

Example:

```bash
cd ImplicitIntents
./gradlew assembleDebug
```

## Learning path suggestion

If you are using this repo for practice, a good order is:

1. `MyApplication`
2. `Activitylifecycle`
3. `ExplicitIntents`
4. `ImplicitIntents`
5. `ChallengeIntents`
6. `RecyclerView`
7. `RecyclerViewandFragement`
8. `VectorAssets`
9. `TemperatureCricket`
10. `FalsePhone`

## Notes

- Some projects use older APIs such as `startActivityForResult`, which is still useful for learning legacy code patterns.
- Naming reflects original practice app titles (for example, `RecyclerViewandFragement` keeps the original spelling).
- Each subproject contains its own Gradle wrapper and can be built independently.

## Contributing

If you want to improve these demos:

- keep changes scoped to the relevant project folder,
- test on at least one emulator/device configuration,
- and update this README if you add or rename projects.

