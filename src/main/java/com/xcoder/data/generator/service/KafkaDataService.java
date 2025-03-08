package com.xcoder.data.generator.service;

import com.xcoder.data.generator.model.Data;

public interface KafkaDataService {
    void send(Data data);
}
