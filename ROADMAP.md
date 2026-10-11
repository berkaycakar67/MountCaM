# MountCaM Roadmap

## V0.1 — Android shell
- [ ] Build and run Kotlin + Jetpack Compose app
- [ ] Dark forest-green theme and two placeholder camera cards
- [ ] Connection state UI: loading / offline / error
- [ ] Confirm Android build toolchain and reproducible Gradle wrapper

**Done when:** a debug APK installs and opens without claiming to show real camera feeds.

## V0.2 — Connectivity proof
- [ ] Check XM FunSDK availability, terms, and Android compatibility
- [ ] Implement CameraGateway interface with no secrets in source control
- [ ] Test authenticated P2P login for one camera
- [ ] Verify real video frames over mobile data

**Done when:** an authorized camera displays live frames outside the orchard Wi-Fi.

## V0.3 — Controls
- [ ] Add second camera
- [ ] PTZ and audio after device support verification
- [ ] Fullscreen, reconnect, error handling
- [ ] Measure data usage and stream quality

## V1.0 — Family release
- [ ] Three authorized users and revocable access
- [ ] Three simultaneous sessions test
- [ ] SD playback, subject to SDK support
- [ ] Secure credential storage and privacy review
- [ ] Real-world mobile network testing

No milestone is considered complete solely because iCSee supports the corresponding feature.
