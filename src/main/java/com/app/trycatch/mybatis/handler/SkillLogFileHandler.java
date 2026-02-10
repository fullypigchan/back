package com.app.trycatch.mybatis.handler;

import com.app.trycatch.common.enumeration.skillLog.SkillLogFileType;
import com.app.trycatch.common.enumeration.skillLog.SkillLogStatus;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(SkillLogFileType.class)
public class SkillLogFileHandler implements TypeHandler<SkillLogFileType> {

    @Override
    public void setParameter(PreparedStatement ps, int i, SkillLogFileType parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.getValue());
    }

    @Override
    public SkillLogFileType getResult(ResultSet rs, String columnName) throws SQLException {
        switch (rs.getString(columnName)) {
            case "thumbnail":
                return SkillLogFileType.THUMBNAIL;
            case "image":
                return SkillLogFileType.IMAGE;
            case "attachment":
                return SkillLogFileType.ATTACHMENT;
        }
        return null;
    }

    @Override
    public SkillLogFileType getResult(ResultSet rs, int columnIndex) throws SQLException {
        switch (rs.getString(columnIndex)) {
            case "thumbnail":
                return SkillLogFileType.THUMBNAIL;
            case "image":
                return SkillLogFileType.IMAGE;
            case "attachment":
                return SkillLogFileType.ATTACHMENT;
        }
        return null;
    }

    @Override
    public SkillLogFileType getResult(CallableStatement cs, int columnIndex) throws SQLException {
        switch (cs.getString(columnIndex)) {
            case "thumbnail":
                return SkillLogFileType.THUMBNAIL;
            case "image":
                return SkillLogFileType.IMAGE;
            case "attachment":
                return SkillLogFileType.ATTACHMENT;
        }
        return null;
    }
}
