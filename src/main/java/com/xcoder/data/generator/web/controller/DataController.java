package com.xcoder.data.generator.web.controller;

import com.xcoder.data.generator.model.Data;
import com.xcoder.data.generator.model.test.DataTestOptions;
import com.xcoder.data.generator.service.KafkaDataService;
import com.xcoder.data.generator.service.TestDataService;
import com.xcoder.data.generator.web.dto.DataDto;
import com.xcoder.data.generator.web.dto.DataTestOptionsDto;
import com.xcoder.data.generator.web.mapper.DataMapper;
import com.xcoder.data.generator.web.mapper.DataTestOptionsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {
    private final DataMapper dataMapper;
    private final KafkaDataService kafkaDataService;
    private final TestDataService testDataService;
    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dto) {
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto testOptionsDto) {
        DataTestOptions dataTestOptions = dataTestOptionsMapper.toEntity(testOptionsDto);
        testDataService.sendMessages(dataTestOptions);
    }

}
