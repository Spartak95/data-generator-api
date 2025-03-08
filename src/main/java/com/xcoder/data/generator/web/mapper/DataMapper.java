package com.xcoder.data.generator.web.mapper;

import com.xcoder.data.generator.model.Data;
import com.xcoder.data.generator.web.dto.DataDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
