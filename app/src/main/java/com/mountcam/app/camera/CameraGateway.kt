package com.mountcam.app.camera

/**
 * Boundary between the UI and a vendor-specific camera transport.
 * Never log credentials, serial numbers, pairing payloads, or video frames.
 */
interface CameraGateway {
    suspend fun connect(config: CameraConnectionConfig): CameraConnectionResult
    suspend fun disconnect()
}

data class CameraConnectionConfig(
    val deviceIdentifier: String,
    val username: String,
    val password: CharArray,
    val mode: ConnectionMode
)

enum class ConnectionMode { LOCAL, P2P }

sealed interface CameraConnectionResult {
    data object Connected : CameraConnectionResult
    data class Failed(val reason: String) : CameraConnectionResult
    data object SdkUnavailable : CameraConnectionResult
}

/** Safe placeholder until SDK terms, credentials and device compatibility are verified. */
class UnconfiguredCameraGateway : CameraGateway {
    override suspend fun connect(config: CameraConnectionConfig): CameraConnectionResult =
        CameraConnectionResult.SdkUnavailable

    override suspend fun disconnect() = Unit
}
