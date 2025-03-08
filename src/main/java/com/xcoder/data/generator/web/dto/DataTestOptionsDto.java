package com.xcoder.data.generator.web.dto;

import com.xcoder.data.generator.model.MeasurementType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DataTestOptionsDto {
    private int delayInSeconds;
    private MeasurementType[] measurementTypes;
}
