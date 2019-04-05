package com.sanshengshui.mqtt;

/**
 * @Author: 穆书伟
 * @Date: 19-4-3 下午3:11
 * @Version 1.0
 */
public class MqttTopics {
    
    public static final String BASE_DEVICE_API_TOPIC = "v1/devices/me";
    public static final String DEVICE_TELEMETRY_TOPIC = BASE_DEVICE_API_TOPIC + "/telemetry";
    public static final String DEVICE_ATTRIBUTES_TOPIC = BASE_DEVICE_API_TOPIC + "/attributes";
}