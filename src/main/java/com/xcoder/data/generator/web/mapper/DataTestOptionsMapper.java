package com.xcoder.data.generator.web.mapper;

import com.xcoder.data.generator.model.test.DataTestOptions;
import com.xcoder.data.generator.web.dto.DataTestOptionsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
