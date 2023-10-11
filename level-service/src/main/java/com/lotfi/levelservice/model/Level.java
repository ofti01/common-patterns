package com.lotfi.levelservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("level")
public class Level {

    @Id
    private String id;

    @Field("name_level")
    @Indexed(unique = true)
    private String nameLevel;

    @Field("section")
    private String section;

}
