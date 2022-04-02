package org.simpleflatmapper.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.simpleflatmapper.map.annotation.Key;

@Data
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    public class ProfileDTO {

        @Key
        private Long id;
        private String phone;
        private String avatar;
        private int privacy;

    }