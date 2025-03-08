package com.xcoder.data.generator.model.test;

import com.xcoder.data.generator.model.MeasurementType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DataTestOptions {
    private int delayInSeconds;
    private MeasurementType[] measurementTypes;
}
