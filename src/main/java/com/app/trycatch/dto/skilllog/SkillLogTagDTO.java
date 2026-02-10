package com.app.trycatch.dto.skilllog;

import com.app.trycatch.common.enumeration.skillLog.SkillLogStatus;
import com.app.trycatch.domain.skilllog.SkillLogTagVO;
import com.app.trycatch.domain.skilllog.SkillLogVO;
import com.app.trycatch.domain.skilllog.TagVO;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class SkillLogTagDTO {
//    SkillLogTag
    private Long id;
    private String createdDatetime;
    private String updatedDatetime;

//    Tag
    private Long tagId;
    private String tagName;

//    SkillLog
    private Long skillLogId;
    private Long memberId;
    private Long experienceProgramId;
    private String skillLogTitle;
    private String skillLogContent;
    private String skillLogCategory;
    private int skillLogViewCount;
    private SkillLogStatus skillLogStatus;

    public SkillLogTagVO toSkillLogTagVO () {
        return SkillLogTagVO.builder()
                .id(id)
                .skillLogId(skillLogId)
                .tagId(tagId)
                .createdDatetime(createdDatetime)
                .updatedDatetime(updatedDatetime)
                .build();
    }

    public TagVO toTagVO() {
        return TagVO.builder()
                .id(tagId)
                .tagName(tagName)
                .build();
    }

    public SkillLogVO toSkillLogVO() {
        return SkillLogVO.builder()
                .id(skillLogId)
                .memberId(memberId)
                .experienceProgramId(experienceProgramId)
                .skillLogTitle(skillLogTitle)
                .skillLogContent(skillLogContent)
                .skillLogCategory(skillLogCategory)
                .skillLogViewCount(skillLogViewCount)
                .skillLogStatus(skillLogStatus)
                .build();
    }

}
