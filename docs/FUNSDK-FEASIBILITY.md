# FunSDK feasibility gate — 2026-10-13

## Verified public references

- XM community Android integration: https://github.com/xmcamera/libxmfunsdk
- XM open-platform FAQ: https://github.com/xmeye/openplatform-docs/blob/master/docs/FunSDKDevelopmentGuide/FunSDKDevelopmentGuide-FAQ.md
- Maven coordinates reported: io.github.xmcamera:libxmfunsdk:4.7.5.3 (published 2025-02-18; verify compatibility and dependencies before use).
- Official documentation describes Android app certificate fields APP_UUID, APP_KEY, APP_SECRET and APP_MOVECARD, and platform developer registration.
- FAQ describes device-ID/device-login/password access without registered end-user account in some SDK versions; this does NOT remove the app certificate requirement.

## License and security decision

Maven metadata advertises Apache-2.0, but confirm native binary redistribution rights and vendor platform terms before bundling the AAR. AppSecret in AndroidManifest is extractable from any distributed APK: do NOT treat it as a secure secret store. Do not place any real vendor credentials in this public repository, CI configuration, artifacts or a distributable test APK without an approved credential strategy.

## Hardware caveat

Tekron X2-WQ-BL running iCSee, RTSP H264DVR 1.0 and ports 8899/34567 suggests an XM-family protocol but does not prove FunSDK compatibility. iCSee remote access does not establish third-party P2P entitlement.

## Safe next test

1. Check vendor developer portal account/application approval and the terms of private-family use.
2. Validate Android SDK binary compatibility and dependency risks in an isolated build.
3. Prepare a local-only SDK initialization experiment using non-production test credentials and without publishing sensitive APKs.
4. On user's Android phone, test a single camera's authenticated P2P session over mobile data; do not open router ports or reset cameras.
5. Add a real video surface only after authenticated frames are received.

Status: RESEARCHED, NOT CONNECTED. No actual FunSDK integration or device login has been tested.
