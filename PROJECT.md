# MountCaM — Project Brief

Status: Android prototype planning. **MountCaM** is a technical codename; final app name undecided.

## Goal
An Android-first private camera application for a mountain hazelnut orchard house, accessible to three authorized family members without a permanent intermediary device.

## Existing equipment
- Two Tekron X2-WQ-BL Wi-Fi PTZ cameras (interior and exterior).
- DATA FORCE CPE906-E SIM router, CGNAT/private WAN IPv4.
- Local addresses observed: interior 192.168.100.100, exterior 192.168.100.104 (not guaranteed stable).
- iCSee works on Wi-Fi and mobile data; three concurrent viewers tested.

## Verified services
Both cameras: TCP 80 (HTTP), 554 (RTSP), 8899 and 34567 open. RTSP server identifies as H264DVR 1.0 and requires authentication. ONVIF has not been verified. XM/FunSDK P2P integration has **not** been tested.

## Product direction
Dark charcoal + forest-green UI; mountain hazelnut orchard atmosphere; two live camera cards, fullscreen, PTZ, audio, recordings and family access as progressively verified features.

## Constraints
No additional gateway, no PC required for normal usage. Never commit device serials, passwords, pairing QR payloads, SDK keys or recordings. Keep iCSee operational until the replacement is proven.

## First technical gate
Verify SDK distribution/licensing and establish one authorized P2P live stream from Android before implementing the full feature set.
