package com.lilly.ble

import android.Manifest

// used to identify adding bluetooth names
const val REQUEST_ENABLE_BT = 1
// used to request fine location permission
const val REQUEST_ALL_PERMISSION = 2
val PERMISSIONS = arrayOf(
    Manifest.permission.ACCESS_FINE_LOCATION,
    Manifest.permission.ACCESS_COARSE_LOCATION,
    Manifest.permission.BLUETOOTH_SCAN,
    Manifest.permission.BLUETOOTH_CONNECT
)

//사용자 BLE UUID Service/Rx/Tx
const val SERVICE_STRING = "00001805-0000-1000-8000-00805f9b34fb"
const val CHARACTERISTIC_COMMAND_STRING = "00002a2b-0000-1000-8000-00805f9b34fb"
const val CHARACTERISTIC_RESPONSE_STRING = "00002a0f-0000-1000-8000-00805f9b34fb"

//BluetoothGattDescriptor 고정
const val CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb"
