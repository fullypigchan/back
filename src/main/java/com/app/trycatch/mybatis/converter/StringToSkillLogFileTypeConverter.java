package com.app.trycatch.mybatis.converter;


import com.app.trycatch.common.enumeration.skillLog.SkillLogFileType;
import com.app.trycatch.common.enumeration.skillLog.SkillLogStatus;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToSkillLogFileTypeConverter implements Converter<String, SkillLogFileType> {
    @Override
    public SkillLogFileType convert(String source) {
        return SkillLogFileType.getSkillLogFileType(source);
    }
}
